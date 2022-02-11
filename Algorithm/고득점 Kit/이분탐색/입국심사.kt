
class Solution {
    fun solution(n: Int, times: IntArray): Long {
        val sorted_times=times.sorted()
        var answer: Long = 0
       
        
        var left:Long=1
        var right:Long= n.toLong() * sorted_times[times.size-1]
        
        while(left<=right)
        {
            var mid:Long = (left+right)/2
            var done:Long = 0
            
            for(time in sorted_times)
            {
                done+= mid/time
            }
            
            if(done<n)
            {
                left=mid+1
            }
            else
            {
                if(mid<=right)
                {
                    answer=mid
                }
                right=mid-1
            }
            
        }
        
        return answer
    }
}