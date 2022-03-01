
import java.util.*
class Solution {
     val arr = Array<MutableList<Int>>(100){mutableListOf()}
     
     
      fun countNode(startNode:MutableList<Int>, s:Int, e:Int):Int{
          //s는 시작노드 e는 끊을 노드
        val hs = HashSet<Int>()
           val q:Queue<Int> = LinkedList<Int>()
        
        // 현재 노드에 대한 처리
        hs.add(s)
        for(n in startNode){
            // e랑 연결된 노드를 끊어주기 위함
            if(n == e) continue //넘어가는게 끊어주는 것
            hs.add(n)
            q.offer(n)
        }
        
        
          while(q.isNotEmpty()){ //bfs
            val now = q.poll()
            for(i in arr[now].indices){
                // 이미 방문했던 노드면 continue
                if(hs.contains(arr[now][i])) continue
                hs.add(arr[now][i])
                q.offer(arr[now][i])
            }
        }
        return hs.size
        
      }
     
    fun solution(n: Int, wires: Array<IntArray>): Int {
        var answer: Int = 100
        
          // 양방향을 체크해 주기 위함
        wires.forEach{ 
            arr[it[0] - 1].add(it[1] - 1)
            arr[it[1] - 1].add(it[0] - 1)
        }
        
        
        
        // 각 트리를 카운트 후 차이가 가장 적은 값을 answer에 저장
         wires.forEach{ //모든 연결에 대하여 하니씩 끊어봄 
            answer = Math.min(answer, Math.abs(countNode(arr[it[0]-1], it[0]-1, it[1]-1) - countNode(arr[it[1]-1], it[1]-1, it[0]-1)))
        }
        
        
        
        
        return answer
    }
}