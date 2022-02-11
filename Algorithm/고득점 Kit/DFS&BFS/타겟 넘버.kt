
class Solution {
    var answer = 0
    var n:Int =0 
    fun solution(numbers: IntArray, target: Int): Int {
        this.n=numbers.size
        dfs(numbers[0],1,target,numbers)
        dfs(-numbers[0],1,target,numbers)
        return answer
    }
    
    fun dfs(pass:Int,curr:Int,target:Int,numbers:IntArray)
    {
        if(curr==n)
        {
            if(pass==target) this.answer++
            return 
        }
        dfs(pass+numbers[curr],curr+1,target,numbers)
        dfs(pass-numbers[curr],curr+1,target,numbers)
        
    }
    
}