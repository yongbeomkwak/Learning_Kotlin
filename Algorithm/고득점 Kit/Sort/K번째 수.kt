
class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
         val tmp =array.toList()
        
        for (command in commands)
        {
            val begin=command[0]-1 //시작인덱스는 -1 해야 맞음
            val end=command[1]
            val k=command[2]
            val sub=tmp.subList(begin,end).sorted()
        
            answer.add(sub[k-1])
            
        }
        
        return answer.toIntArray()
    }
}