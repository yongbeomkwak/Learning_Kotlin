
import java.util.*
class Solution {
    fun solution(n: Int, edge: Array<IntArray>): Int {
        var answer = 0
        //var visit=Array<Boolean>(n+1,{false})
        var adj=Array<MutableList<Int>>(n+1,{mutableListOf<Int>()})
        var dist=Array<Int>(n+1,{20001})
        for ((s,e) in edge)
        {
            adj[s].add(e)
            adj[e].add(s)
        }
        val q:Queue<Int> = LinkedList<Int>()
        q.add(1)
        dist[0]=0
        dist[1]=0
        
        while(q.isNotEmpty())
        {
            val u=q.poll()!!
            
            for(v in adj[u])
            {
                if(dist[u]+1<dist[v])
                {
                    dist[v]=dist[u]+1
                    q.add(v)
                }
            }
        }
        
       
        
        val max =dist.max()
       
        answer=dist.count{it==max}
        
        
        
        return answer
    }
}