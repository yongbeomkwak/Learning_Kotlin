
import java.util.*
class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
 
        /*
          zip() 함수는 두 컬랙션의 자료들을 조합하여 새로운 자료를 만들 때 사용합니다. 
          두 컬렉션 간 자료의 갯수가 달라도 되고 더 적은 갯수에 컬랙션쪽으로 따라 갑니다. 조합된 결과           는 Pair로 만들어주며, 원할 경우 규칙을 정의 할 수 있습니다.


        */
        println(progresses.zip(speeds).javaClass.name)
        val days = progresses.zip(speeds).map { (p, s) ->
            // p:progress
            // s:speed

            val left = 100 - p //남은 작업 
            val div = left / s //끝낼 수 있는 요일 
            val mod = if (left % s > 0) 1 else 0 //만약 남은 요일이 speed로 나눠 떨어지면 mod=0 남을 경우 하루 더 필요 
            div + mod //총 끝낼 수 있는 일수
        }
        //days => ArrayList
        
        val stack = Stack<Pair<Int, Int>>() //스택 선언 
   
        stack.add(Pair(days.first(), 1)) //첫번째 일 수, 카운트 값
        
          for (day in days.drop(1)) { //days.drop(1):days의 가장 앞 1개를 제외한 모든 요소 ,위에서 첫번째는 stack에 넣었으므로
             
          
            if (day <= stack.peek().first) { //이번 작업 남은 일수가 현재 top의 남은일수보다 작거나 같으면
                val (a, b) = stack[stack.size-1] //top() 
                stack[stack.size-1] = Pair(a, b+1) //top()의 값의 count(b)값을 +1 증가시켜 대체한다.
            }
            else {
                stack.add(Pair(day, 1)) //아닐경우 다음 따로 끝나느 작업이 존재
                //add(밑에 넣음)
            }
        }
        
        return stack.map { it.second }.toIntArray() //stack의 top부터 pair값만 IntArray로 바꾸어 리턴 
    }
}