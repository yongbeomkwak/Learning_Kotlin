
class Solution {
    fun solution(n: Int, costs: Array<IntArray>): Int {
        var answer = 0
         val sortedCosts = costs.sortedBy { it[2] }
        val hash=mutableSetOf(0)
        
        while(hash.size<n)
        {
            for ((s, e, c) in sortedCosts) {
            
               if(hash.contains(s) || hash.contains(e))
                {
                    if(hash.contains(s)&&hash.contains(e)) //출발과 도착 모두 셋에 존재시
                    {
                        continue
                    }
                    hash.add(s)
                    hash.add(e)
                    answer+=c
                    break
                }   
            
            }
            
        }
        
        return answer
    }
}