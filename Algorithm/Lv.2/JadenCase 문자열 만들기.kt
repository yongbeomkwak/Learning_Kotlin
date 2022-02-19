
class Solution {
    fun solution(s: String): String {
         return s.toLowerCase().split(" ").map {
               it.capitalize()
           }.joinToString(" ")
   }
}