import java.util.*

class Solution {
    fun solution(gems: Array<String>): IntArray {
        var answer = intArrayOf(0,0)// [0,0]선언
        val s: HashSet<String> = HashSet<String>() //
         val bag:HashMap<String,Int> = HashMap<String,Int>()
        for (gem in gems)
        {
            s.add(gem)
        }
        
       
        val kinds:Int=s.size //중복되지 않은 총 보석 개수
        var start:Int =0 
        var end:Int =0
        var shortest:Int=100001 
        
        while(end<gems.size)
        {
            if(bag.containsKey(gems[end])) //담겨 있으면
            {
                //현재 값에 +1(.plus(1))
                bag.replace(gems[end],bag[gems[end]]!!.plus(1))
            }
            else
            {
                //삽입
                bag.put(gems[end],1)
            }
            end++
            
            if(kinds==bag.size)
            {
                while(start<end)
                {
                    if(bag.get(gems[start])!!<=1)
                    {
                        break
                    }
                    //해당 값 -1로 변경
                    bag.replace(gems[start],bag[gems[start]]!!.plus(-1))
                    start++
                }
                
                if(end-start<shortest)
                {
                    shortest=end-start
                    answer[0]=start+1
                    answer[1]=end
                }
            }
        }
        
        return answer
    }
}