
class Solution {
    
    
    fun gcd(a:Int,b:Int):Int{
        var _a=a
        var _b=b
        
        while(_a>0)
        {
            val tmp=_a
            _a=_b%_a
            _b=tmp
        }
        
        
        return _b
        
    }
    
    fun lcm(a:Int,b:Int):Int
    {
        
        return (a*b)/gcd(a,b)
    }
    
    fun solution(arr: IntArray): Int {
        var answer = 0
        arr.sort()
        
        var now:Int=arr[0]
        
        for(i in 1 until arr.size)
        {
            now=lcm(now,arr[i]);
        }
        
        answer=now
        return answer
    }
}