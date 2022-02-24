
class Solution {
    fun solution(n: Int): IntArray {
       
        val arr = Array(n){IntArray(n)}
        //하, 우, 왼대 방향 반복
        val dir = arrayOf(arrayOf(1,0),arrayOf(0,1),arrayOf(-1,-1))

        var r:Int =0 //현재 행 
        var c:Int =0//현재 열 
        var max_right_cnt:Int=n //해당 이동방향(cur_dir)에 채워야하는 개수
        var num:Int =1 //현재 값
        var move_cnt:Int=0 //해당 이동방향(cur_dir)에 이동횟수
        var cur_dir:Int=0 //현재 진행 방향 (아래 ,우,왼위 대각선)
        
        while(max_right_cnt!=0) //채워야하는 행이 없을 때 까지
        {
            //println("${num} ${cur_dir} ${max_right_cnt}")
            arr[r][c]=num++ //현재 행과 열 채워야하는 값을 채운 후 증가
            move_cnt++ //위에서 채웠으므로 이동 
            if(move_cnt==max_right_cnt) //기준에 만족하는 이동을 하면 
            {
                max_right_cnt-- //다음 이동횟수 감소 
                move_cnt=0 //초기화 
                cur_dir++ //진행 방향 변경 (%3==0 아래,%3==1 오른쪽 진행,%3==2 왼쪽위 진행)
            }
            r+=dir[cur_dir%3][0] 
            c+=dir[cur_dir%3][1]
        }
        
        val answer = ArrayList<Int>()
        
        for(i in 0 until n){
            for(j in 0 until n){
                if(arr[i][j]!=0)
                    answer.add(arr[i][j])
            }
        }
        
        return answer.toIntArray()
    }
}