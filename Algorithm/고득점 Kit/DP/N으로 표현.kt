
import java.util.*
class Solution {
    fun solution(N: Int, number: Int): Int {
      if(N==number) return 1
        var DP = MutableList<HashSet<Int>>(9,{HashSet<Int>()})
        DP[1].add(N)
        //DP[k] -> N을 k개 사용하여 만들 수 있는 숫자들
        for (k in (2..8))
        {
            for(i in (1..k-1))
            {
                for(j in (1..k-1))
                {
                    if((i+j)!=k) continue  //i+j개가 k와 일치할 때
                    
                    for(a in DP[i])
                    {
                        for(b in DP[j])
                        {
                            DP[k].add(a+b)
                            if(a-b>0) DP[k].add(a-b)
                            DP[k].add(a*b)
                            if(a/b>0) DP[k].add(a/b)
                        }
                    }
                    
                    
                    
                    
                }
            }
            
            DP[k].add(getNN(N,k))
            
            if(DP[k].contains(number)) return k
        }
        
        
        
        return -1
    }
    fun getNN(N:Int,k:Int):Int
    {
        var ret:Int=N
        
        for(i in 1..k-1)
        {
            ret=ret*10+N
        }
        return ret
    }
}