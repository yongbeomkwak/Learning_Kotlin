
class Solution {
    lateinit var st_matrix:Array<IntArray>
    fun _init(rows:Int,cols:Int):Array<IntArray>
    {
        var ret:Array<IntArray> =arrayOf<IntArray>()
        val end= rows*cols
        
        for(h in (1..end) step cols)
        {
            var tmp=intArrayOf()
            for(i in (h until h+cols))
            {
                tmp+=i
            }
            ret+=tmp
        }
        
        
        return ret
    }
    
    fun _copy(mat:Array<IntArray>,rows:Int,cols:Int)
    {
      for(i in 0 until rows)
        {
            for(j in 0 until cols)
            {
                st_matrix[i][j]=mat[i][j]
            }
        }
        
        
        
    }
    
    fun task(mat:Array<IntArray>,h1:Int,v1:Int,h2:Int,v2:Int):Int
    {
        var arr=intArrayOf()
        val left=v1-1
        val right=v2-1
        val top=h1-1
        val bottom=h2-1
        var tmp=intArrayOf()
        
       
        for(i in (left+1..right))
        {
            
            mat[top][i]=st_matrix[top][i-1]
            tmp+=st_matrix[top][i-1]
        }
        
        for(i in (top+1..bottom))
        {
            mat[i][right]=st_matrix[i-1][right]
            tmp+=st_matrix[i-1][right]
        }
        for(i in right-1 downTo left)
        {
            mat[bottom][i]=st_matrix[bottom][i+1]
            tmp+=st_matrix[bottom][i+1]
        }
        for(i in bottom-1 downTo top)
        {
            mat[i][left]=st_matrix[i+1][left]
            tmp+=st_matrix[i+1][left]
        }
        
        
        
       
       
        return tmp.min()!!

        
    }
    
    
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        st_matrix=_init(rows,columns)
        var matrix=_init(rows,columns)
     
       
        for(move in queries)
        {
            val h1=move[0]
            val v1=move[1]
            val h2=move[2]       
            val v2=move[3]
            /*for(arr in st_matrix)
            {
                for(i in arr)
                {
                    print("${i} ")
                }
                println()
            }*/
            answer+=task(matrix,h1,v1,h2,v2)
            _copy(matrix,rows,columns)
            
        }
  
        return answer
    }
}