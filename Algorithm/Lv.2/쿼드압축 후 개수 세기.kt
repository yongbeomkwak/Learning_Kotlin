
class Solution {
    var answer: IntArray = IntArray(2,{0})
    fun dfs(r : Int, c : Int, size : Int, arr : Array<IntArray>)
    {
        var zero:Boolean=true
        var one:Boolean=true
        for(i in r until r+size)
        {
            for(j in c until c+size)
            {
                if(arr[i][j]==0) one=false;
                else zero=false;
            }
        }
        
        
        if(zero) //위에서 1이 한번도 발생하지 않으면 여기에 들어옴
        {
            answer[0]++
            return
        }
        if(one) //위에서 0이 한번도 발생하지 않으면 여기에  들어옴
        {
            answer[1]++
            return
        }
        
        //+size/2  아래 또는 오른쪽 
        dfs(r,c,size/2,arr); //왼쪽 위 4분면
        dfs(r,c+size/2,size/2,arr); //오른쪽 위 4분면 
        dfs(r+size/2,c,size/2,arr) //왼쪽 아래
        dfs(r+size/2,c+size/2,size/2,arr) //오른쪽 아래 
      
        
    }
    fun solution(arr: Array<IntArray>): IntArray {
        
        
        dfs(0,0,arr.size,arr)
        return answer
    }
}