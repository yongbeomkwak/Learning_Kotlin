
class Solution {
    fun solution(s: String): String {
        var answer = ""
        val tmp=s.split(' ').map{
            it.toInt()
        }.sorted()
        answer="${tmp[0]} ${tmp[tmp.size-1]}"
        return answer
    }
}