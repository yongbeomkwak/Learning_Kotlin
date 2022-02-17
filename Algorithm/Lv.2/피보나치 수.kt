class Solution {
    fun solution(n: Int): Int = if(n == 1 || n == 2) 1 else fib(n, 1, 1)  
    tailrec fun fib(n: Int, a: Int, b: Int): Int = if(n == 1) a else fib(n - 1, b % 1234567, (a + b) % 1234567)

    
}
