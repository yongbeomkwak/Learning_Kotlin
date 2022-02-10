
class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        var list=MutableList<Int>(n,{1})
        
        for(i in reserve)
        {
            list[i-1]=2
        }
        for(i in lost)
        {
            list[i-1]--
        }
     
        
        for(i in 0..n-1)
        {
            val prev:Int =i-1
            val next:Int =i+1
            if(i>0 && list[i]==0 && list[prev]==2)
            {
                list[i]++
                list[prev]--
            }
            
            if(i<n-1 && list[i]==0 && list[next]==2)
            {
                list[i]++
                list[next]--
            }
        }
        println(list)
        answer=list.count{
            println(it)
            it>=1
        }
        
        return answer
    }
}