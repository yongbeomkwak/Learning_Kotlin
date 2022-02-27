
class Solution {
    
    var answer: Int = 0
    val visit:BooleanArray=BooleanArray(8,{false})
    
    fun dfs(k:Int,cnt:Int,dungeons: Array<IntArray>)
    {
        val end:Int=dungeons.size
        if(cnt>answer)
        {
            answer=cnt
        }
        
        for(i in 0 until end)
        {
            if(k>=dungeons[i][0]&& !visit[i]) //현재 피로도가 해당 던전 최소 진입 피로도를 만족하고 방문하지 않았다면
            {
               
                visit[i]=true
                dfs(k-dungeons[i][1],cnt+1,dungeons)
                visit[i]=false
            }
        }
    }
    
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        
         
        
        dfs(k,0,dungeons)
        
        
        return answer
    }
}