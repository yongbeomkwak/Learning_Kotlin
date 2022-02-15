
class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
     
        
        val list=strings.toList()
        
       val answer:Array<String> = list.sortedWith(compareBy({it[n]},{it})).toTypedArray()
       
        
        return answer
    }
}