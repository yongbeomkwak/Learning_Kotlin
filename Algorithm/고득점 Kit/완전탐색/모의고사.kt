
import java.util.*

typealias P=Pair<Int,Int>
class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        val a:List<Int> = listOf(1,2,3,4,5) //5 
        val b:List<Int> = listOf(2,1,2,3,2,4,2,5) //8
        val c:List<Int> = listOf(3,3,1,1,2,2,4,4,5,5) // 10 
        var ret:MutableList<P> = mutableListOf<P>(P(1,0),P(2,0),P(3,0))
        val tmp=MutableList<Int>(3,{0})
        
        for (i in 0 until answers.size)
        {
            if(answers[i]==a[i%5]) tmp[0]++
            if(answers[i]==b[i%8]) tmp[1]++
            if(answers[i]==c[i%10]) tmp[2]++
        }
        val max=tmp.max()
        
        for (i in 0 until tmp.size)
        {
            if(tmp[i]==max)
            {
                answer+=i+1
            }
        }
        
     
        
        return answer
    }
}