
import java.util.*

class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val hash:HashMap<String,Int> = HashMap<String,Int>()
        
        for (cloth in clothes){
            val kind=cloth[1]
            if(!hash.contains(kind))
            {
                hash.put(kind,1)
            }
            else
            {
               hash.replace(kind,hash[kind]!!.plus(1))  //값이 존재하면 +1 
            }
        }
        
        
        hash.forEach{ _,value ->
            //print(value)
            answer*=(value+1) 
        }
        
    
        
        
        
        return --answer
    }
}