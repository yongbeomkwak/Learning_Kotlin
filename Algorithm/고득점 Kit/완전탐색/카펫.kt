
class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf(0,0)
        
   
        val sum:Int=brown+yellow
        
        for (h in 3..brown)
        {
            if(sum%h==0)
            {
                val w=sum/h
                
                if((h-2)*(w-2)==yellow)
                {
                    answer[0]=w
                    answer[1]=h
                    break
                }
                
                
            }
          
            
            
        }
        
        return answer
    }
}