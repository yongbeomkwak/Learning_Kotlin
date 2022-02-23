

class Solution {
    fun solution(numbers: LongArray): LongArray {
        var answer: LongArray = longArrayOf()
        
        for(nums in numbers)
        {
           if(nums%2==0L) answer+=(nums+1) //짝수일 경우 바로 다음 홀수가 조건을 만족하는 최소값
           else //홀수일 경우 최하위 0비트는 1로  그다음 비트는 0으로 변경하면 최솟값
            {
                val tmp=nums+1 //0비트 중 최하위 비트를 찾기 위해 해당 비트 1로 변경
                val two_complement=nums.inv()+1 //2의 보수:비트 반전 + 1
                val last_zero=(tmp and two_complement)
                //2의보수와 해당 tmp를 and연산하면  최하위 zero 비트 찾을 수 있음
                val zero_toOne = nums or last_zero  //최하위 0의 자리를 1로 
                val res=(zero_toOne and (last_zero shr 1).inv())
                answer+=res
                /**
                nums:1001
                tmp: 1010(nums+1)
                two_complement: (0111) (nums.inv()+1) [nums의 2의 보수]
                last_zero:tmp & two_complement:0010  //  1이 최하위 0 위치
                zero_toOne=1011 (nums | last_zero )
                last_zero shr 1: 0001 (오른쪽 쉬프트) (최하위 0비트 다음 비트 선택)
                (last_zero shr 1).inv() 1110(반전) 이유:(최하위 0비트 다음 1비트를 0으로)
                res: 1011 and 1110 -> 1010
                */
            }
            
        }
        return answer
    }
}