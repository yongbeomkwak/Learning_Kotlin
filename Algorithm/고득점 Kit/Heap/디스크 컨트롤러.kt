
import java.util.*


class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        var jobList = jobs.map { it[0] to it[1]}.sortedBy { it.first }
        //first로 오름 차순 정렬
        
        var sortedTime: PriorityQueue<Pair<Int, Int>> = PriorityQueue(compareBy { it.second }) //Pair의 second으로 오름차순
        var current = 0
        var sum = 0
        while (!jobList.isEmpty() || !sortedTime.isEmpty()) {
            val c = jobList.takeWhile { it.first <= current } //작업 요청시간이 현재시간보다 빠르거나 같을 때 
            sortedTime.addAll(c) //c의 모든요소를 추가 
            jobList = jobList.drop(c.size)  //c의 크기만큼 앞에서 자른 후 뒤에 것만 저장
            if (sortedTime.isEmpty()) { //큐가 비어있다면 
                current = jobList.first().first //현재시간을 다음 작업의 시작시간으로 
            } else { //비어있지 않다면
                val j = sortedTime.poll() //가장먼저 수행할 작업의 요청을 꺼낸 후
                current += j.second //해당 작업시간을 시간에 더한 후
                sum += current - j.first //현재시간-시작시간 = 총 수행시간
            }
        }

        return sum / jobs.size
    }
}