class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer: IntArray = intArrayOf()
        val size:Int = (right-left+1).toInt()
        
        
        
        for(i in left..right)
        {
            //해당 i를 기준으로 2차원 배열에서 어떤 값을 나타내는지
            //행은 1부터 시작 열은 0으로 시작하면 계산이 쉬어진다.
            //행보다 열의 값이 작을 때는 행 번호 값을 갖고 
            //열의 값이 클경우 열+1을 값으로 같는다. 
            /**
                0   1   2
                
            1   1   2   3    i=5 일때 2행 1번 째  row=(5/3)+1 =2 col=(5%3) =2 
                             (col==row) 이므로 해당 값은 (col+1)=(2+1)=3 이 된다.
            
            2   2   2   3(i=5일 때 값,i는 0부터 시작)      
            
            3   3   3   3
            */
            val row:Long=(i/n)+1 
            val col:Long=(i%n)
            if(col<row) answer+=row.toInt()
            else answer+=(col+1).toInt()
        }
    
      
        return answer
    }
}