
class Solution {
    
    fun dfs(computers: Array<IntArray>,n:Int):Boolean
    {
        if(computers[n][n]==0) //이미 방문 했다면
        {
            return false
        }
        computers[n][n]=0 //방문 함
        
        
        for(i in 0 until computers.size)
        {
            if(computers[n][i]==1)
            {
                dfs(computers,i)
            }
        }
        return true
    }
    
    
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        
        for(i in 0 until n)
        {
            if(computers[i][i]==1&&dfs(computers,i)) answer++
        }
        
        return answer
    }
}