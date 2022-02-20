class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        
        //M x N  N x T -> M x T
        val rows:Int =arr1.size // M
        val cols:Int =arr2[0].size //T 
        var answer = arrayOf<IntArray>()
        
     
      
        for(row in arr1)
        {
            var tmp_arr=intArrayOf()
            for(col in 0 until cols)
            {
                var ret:Int=0
                val c=arr2.map{it[col]}.toIntArray() //해당 colum들 원소를 쭉 뽑아냄
          
                c.forEachIndexed{ i,v-> 
                    ret+=row[i]*v //행 * 열 
                }
                tmp_arr+=ret
                
            }
            answer+=tmp_arr
        }
        
        return answer
    }
}
