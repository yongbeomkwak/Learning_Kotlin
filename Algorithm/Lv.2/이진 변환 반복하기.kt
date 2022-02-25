
class Solution {
    fun solution(s: String): IntArray {
        var copiedS = s
        var removedZero = 0
        var count = 0

        while (copiedS != "1") {
            removedZero += copiedS.replace("1", "").count()
            copiedS = copiedS.replace("0", "").count().toString(2)
            println(copiedS)
            count++
        }
        return intArrayOf(count, removedZero)
    }
}