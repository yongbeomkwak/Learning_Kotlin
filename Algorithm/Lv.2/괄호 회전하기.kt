
import java.util.*
class Solution {
   //  조건 2번 확인
    val openlist=listOf('[','(','{')
    fun check(s:String):Boolean
    {
        val st=Stack<Char>()
        for(c in s)
        {
            if(st.isEmpty())
            {
                if(!openlist.contains(c)) return false
                else st.push(c)
            }
            else
            {
                val chr:Int= when(c)
                {
                    ']' -> 0
                    ')' -> 1
                    '}' -> 2
                    else -> 3
                }
                if(chr==3) return false
                if(st.peek()==openlist[chr])
                {
                    st.pop()
                }
                else return false
            }
            
        }
        if(st.isEmpty()) return true
        else return false
    }
    
    fun solution(s: String): Int {
        var answer: Int = 0
        if(check(s)) answer++
        
        
        
        for(i in 0 until s.length-1)
        {
            val s1=s.substring(0..i)
            val s2=s.substring(i+1..s.length-1)
            
            if(check(s2+s1)) answer++
            else  println("${s2+s1}")
            
        }
        
        return answer
    }
}