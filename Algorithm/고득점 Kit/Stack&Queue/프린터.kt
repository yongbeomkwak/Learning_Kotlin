
import java.util.*
class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 1
        val len=priorities.size
        val isSelect=mutableListOf<Int>()
        for (i in 0..len-1)
        {
            if(i==location) isSelect.add(1)
            else isSelect.add(0)
        } //해당 로케이션 인덱스 요소는 1로 
        
        var tmp=priorities.zip(isSelect) //위에서 만든 isSelect와 priorities를 합하여 Pair를 갖는 ArrayList
        
        var pot:Int=0 //현재 가르키는 우선순위 값
        val rank=priorities.sortedDescending() //우선순위를 내림차순 
        
        val q:Queue<Pair<Int,Int>> =LinkedList<Pair<Int,Int>>() //큐 선언
        
        tmp.forEach{ (p,s) ->
            q.add(Pair(p,s))
        } //tmp값 큐에 삽입
     
        while(true)
        {
        
            if(q.peek().first<rank[pot]) //만약 front 값의 rank가 현재 가르키는 우선순위 보다 낮으면 뒤에 삽입
            {
                val head=q.poll()!! //head에서 꺼내고 (poll 꺼내며 리턴값 없을 시 null)
                q.add(head) //삽입 
                
            }
            else //우선순위가 맞으면
            {
                
                if(q.peek().second==1) break //second가 1이면 찾은 것
                else{ //아니면 
                    answer++ //횟수 증가
                    q.remove() //front에서 제거 
                    pot++// 다음 랭크 가르킴
                }
            }
        }
      
        
        return answer
    }
}