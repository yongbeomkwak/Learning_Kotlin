
class Solution {
    var answer=mutableListOf<String>()
    
    fun dfs(now:String,used:Array<Boolean>,tickets: List<Array<String>>,use_cnt:Int):Boolean 
    {
        answer.add(now)
        if(use_cnt==tickets.size) return true
        
        
        for (i in 0 until tickets.size)
        {
            if(now==tickets[i][0]&&used[i]==false) //출발지가 현재와 같고 해당 티켓을 사용하지 않았다면 
            {
                used[i]=true //사용
                val arri:String= tickets[i][1] // 도착지 
                val t:Boolean=dfs(arri,used,tickets,use_cnt+1) //해당 도착지로 조사
                if(t) return true  //만약 만족했다면 리턴 
                used[i]=false// 사용취소
            }
        }
        
        answer.removeAt(answer.size-1) //사용취소 
        return false
    }
    
    fun solution(tickets: Array<Array<String>>): Array<String> {
       
        val sorted_tickets=tickets.sortedBy{it[1]} //도착지를 기준으로 오름차순
        var used=Array<Boolean>(sorted_tickets.size,{false}) //티켓 사용 여부
        
        dfs("ICN",used,sorted_tickets,0)
        
        return answer.toTypedArray()
    }
}