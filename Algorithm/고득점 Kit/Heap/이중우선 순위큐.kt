
import java.util.*
class Solution {
    fun solution(operations: Array<String>): IntArray {
        var answer = intArrayOf(0,0)
        
        val minQueue:PriorityQueue<Int> = PriorityQueue(compareBy{it})
        val maxQueue:PriorityQueue<Int> = PriorityQueue((Comparator.reverseOrder())) //내림차순
        
        var cnt=0
    
        for (str in operations)
        {
            val (op,tmp) = str.split(" ")
            val num=tmp.toInt()
            
            if(op=="I")
            {
                maxQueue.offer(num)
                minQueue.offer(num)
               
            }
            else
            {
               if(maxQueue.isEmpty()) continue
                
                if(num==1)
                {
                    val max=maxQueue.poll()
                    minQueue.remove(max) //최소 힙에서 max값 삭제
                }
                else
                {
                    val min=minQueue.poll()
                    maxQueue.remove(min) //최대 힙에서 min값 삭제
                }
            }
                 
        }
      
        if(maxQueue.isNotEmpty())
        {
            answer[0]=maxQueue.poll()
            answer[1]=minQueue.poll()
        }
        
        return answer
    }
}