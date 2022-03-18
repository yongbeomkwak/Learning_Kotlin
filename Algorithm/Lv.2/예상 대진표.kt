
class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1
        
        var n:Int=a
        var m:Int=b
        
        while(true)
        {
            val tmp1= if(n%2==0) n else n+1
            val tmp2= if(m%2==0) m else m+1
            //println("${tmp1} ${tmp2}")
            if(tmp1==tmp2) break;
            else
            {
              n=tmp1/2
              m=tmp2/2
            }
            answer++
        }

        return answer
    }
}