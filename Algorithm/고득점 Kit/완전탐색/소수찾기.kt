
import java.util.*
import kotlin.math.*
class Solution {
    val s:HashSet<Int> =HashSet<Int>()
    var len:Int=0
    var g_numbers:String=""
    lateinit var g_used:MutableList<Boolean> 
    
    fun solution(numbers: String): Int {
        this.len=numbers.length
        this.g_used=MutableList<Boolean>(len,{false})
        this.g_numbers=numbers
        
        search("",0)
        var answer = s.size 
        return answer
    }
    
    fun check(n:Int):Boolean {
        if(n<2) return false
        val end=sqrt(n.toDouble()).toInt()
        for(i in 2 until end+1)
        {
            if(n%i==0) return false
        }
        return true
    }
    
    fun search(num:String,cnt:Int) {
        
        if(cnt==len)
        {
            if(check(num.toInt()))
            {
                s.add(num.toInt())
            }
            return 
        }
        
        if(cnt!=0)
        {
            if(check(num.toInt()))
            {
                s.add(num.toInt())
            } 
        }
        
        for(i in 0 until len)
        {
            if(g_used[i]) continue
            g_used[i]=true //사용
            val tmp=num+g_numbers[i]
            search(tmp,cnt+1)
            g_used[i]=false
            num.dropLast(1)
        }
        
        
        
    
    }
    
    
    

    
}