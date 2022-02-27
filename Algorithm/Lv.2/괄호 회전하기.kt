
import java.util.*
class Solution {
   //  조건 2번 확인
    val openlist=listOf('[','(','{') //열린 괄호 
    fun check(s:String):Boolean
    {
        val st=Stack<Char>()
        for(c in s)
        {
            if(st.isEmpty())
            {
                if(!openlist.contains(c)) return false //만약 스택이 비어있는데 닫힌괄호면 false
                else st.push(c) //열린괄호면 삽입
            }
            else
            {
                val chr:Int= when(c)
                {
                    ']' -> 0
                    ')' -> 1
                    '}' -> 2
                    else -> 3 //3은 열린괄호
                }
                if(chr==3)
                {
                    st.push(c) //열린괄호는 삽입
                    continue
                }
                if(st.peek()==openlist[chr]) //3이 아닌 값이면 해당 닫힌괄호와 매칭되는 열린괄호가 스택의 탑이면 
                {
                    st.pop() //추출
                }
                
            }
            
        }
        if(st.isEmpty()) return true //비어있으면 맞음
        else return false //비어있지않으면 틀림
    }
    
    fun solution(s: String): Int {
        var answer: Int = 0
        if(check(s)) answer++ //원본으로 처음 체크하고
        
        
        
        for(i in 0 until s.length-1)
        {
            val s1=s.substring(0..i)
            val s2=s.substring(i+1..s.length-1)
            //문자를 substring하여 오른쪽 이동을 구현함
            if(check(s2+s1)) answer++
            //else  println("${s2+s1}")
            
        }
        
        return answer
    }
}