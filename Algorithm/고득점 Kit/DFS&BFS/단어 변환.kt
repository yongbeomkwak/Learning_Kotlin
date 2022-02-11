
class Solution {
    
    var visit=MutableList(52,{false})
    var answer = 0
     fun String.diff(other:String):Int {
         //this는 a.diff(b)에서 a를 가리킨다
        return this.filterIndexed { index, c -> c != other.get(index) }.map { 1 }.sum()
    }
     
     fun dfs(now:Int,cnt:Int,target:String,near:Array<MutableList<Int>>,words:MutableList<String>)
    {
        
        if(words[now]==target)
        {
            
            if(answer==0) answer=cnt
            else answer= if(answer>cnt) cnt else answer
            return
        }
        visit[now]=true; //방문 표시 
        near[now].forEachIndexed{ i,next ->
    
            if(visit[next]==false)
            {
                dfs(next,cnt+1,target,near,words)
            }
            
        }
    }
    
    fun solution(begin: String, target: String, words: Array<String>): Int {
        if(words.count{it==target}==0) return 0
        
     

    
        val mu=mutableListOf<String>()
        mu.add(begin)
        words.forEach{ s->
            mu.add(s)
        }
        
        var near=Array<MutableList<Int>>(mu.size,{mutableListOf<Int>()})
        
        for(i in 0 until mu.size)
        {
            val now:String=mu[i]
            for(j in 0 until mu.size)
            {
                val next:String=mu[j]
             
                if(now.diff(next)==1)
                {
                 
                    near[i].add(j)
                }
            }
        }
        //println(near)
        dfs(0,0,target,near,mu)
        
        return answer
    }
}