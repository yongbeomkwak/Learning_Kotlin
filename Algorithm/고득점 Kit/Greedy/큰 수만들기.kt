
import java.util.*
class Solution {
    fun solution(number: String, k: Int): String {
      
        var kCnt=k
        val st:Stack<Char> =Stack<Char>()
        var numArray=CharArray(number.length-k) // 삭제한 후 남은 요소를 저장할 char배열
      
        number.forEach{
            //제거해야할 갯수가 남아있고 ,스택이 비어있지 않고,스택 top이 들어가야할 값보다 작으면
            while(kCnt!=0&&st.isNotEmpty()&&st.peek()<it)
            {
                st.pop() //제거
                kCnt--
            }
            
            st.add(it) //삽입
            
        }
       
         //위에서 제거가 다 안됬다면 스택에서 위에서 남은 횟수만큼 제거 
        for(i in 0 until kCnt)
        {
            st.pop()
        }
        
        st.forEachIndexed{ index,v ->
            numArray[index]=v
        }
        
        
        
        return String(numArray)
    }
}