
import java.util.*
class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
    var answer:Int=0
    // 다리를 건너는 트럭
    val bridgeQueue : Queue<Int> = LinkedList<Int>()
    // 대기 트럭
    val waitQueue : Queue<Int> = LinkedList<Int>()

    // 다리 길이만큼 임의의 숫자 0을 채워줌
    for(i in 0 until bridge_length) bridgeQueue.add(0)
   
    for(i in truck_weights) waitQueue.add(i)

    // 모두 통과할 때 까지
    while(bridgeQueue.isNotEmpty()){
        //println(bridgeQueue)
        answer++
        bridgeQueue.poll() //계속 빼낸다.
        if(waitQueue.isNotEmpty()) { //기다리는 트럭이 있으면
                // 견딜수 있는 무게를 초과하지 않는다면 큐에 삽입
                if (bridgeQueue.sum() + waitQueue.peek() <= weight ) {
                    //건너는 트럭의 무게와 다음 트럭의 무게합이 제한무게를 초과 하지않았으면
                    bridgeQueue.add(waitQueue.poll()) // 해당 무게 추가 
                } else {
                    bridgeQueue.add(0)  // 아니면 0으로 채움
                }
            }
        }
        return answer
    }
}