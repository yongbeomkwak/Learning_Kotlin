
class Solution {
    
    fun solution(word: String): Int {
        var answer = 0
        var map = HashMap<Char,Int>()
        map.put('A',0)
        map.put('E',1)
        map.put('I',2)
        map.put('O',3)
        map.put('U',4)
        
         var array = arrayOf(781,156,31,6,1)

        for(i in word.indices){
            answer = answer+ map[word[i]]!! * array[i]+1
        }
        return answer
    }
}