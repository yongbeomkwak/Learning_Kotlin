/*
    비트
    000000111111
    가장 왼쪽은 최상위 비트 이므로 부호를 판별할 때 사용, 데이터를 담지는 않음

    1.BSO(bitwise shift operators)
        a)shl:최상위 비트를 제외하고 모두 왼쪽으로 시프트
        b)shr:최상위 비트를 제외하고 모두 오른쪽으로 시프트
        c)ushr:최상위 비트를 포함하여 모두 오른쪽으로 시프트
    
    2.bitwise operators:비트를 조작하는 연산자
        a) and:비교 대상 2개 모두 1일 때만 1 ,비트 확인할 때 또는 비트를 clear(0)으로 만들 때 사용
        b) or:비교 대상 2개 중 하나만 1이라도 1,비트의 set 연산 즉 비트 값을 1로 만들 고 싶을 때 사용
        c) xor:비교 대상이 다르면 1 같으면 0 ,비트들이 같은지 확인할 때 사용
        d) inv():비트 반전(0->1,1->0)
*/
fun main(args: Array<String>) {
    
    var bitData:Int=0b10000 //지정되지 않은 최상위 비트는 0으로 채워짐
    bitData=bitData or(1 shl 2) // 1 shl 2-> ob100 이 됨,1을 왼쪽으로 2번
    /*
        10000
          100
      or
      -------
       10100 =bitData
    */
    println(bitData.toString(2)) //bitData를 2진수로 보여주겠따, Int 형에서 toString은 파라미터를 진법을 나타낸다
    
    var result=bitData and(1 shl 4)// 1shl 4->0b10000

    /*
        10100
        10000
    and
    ---------
        10000
    */
    println(result.toString(2))
    println(result shr 4)// 10000->1

    bitData=bitData and(1 shl 4).inv()// 1 shl 4 ->10000.inv()->01111

    /*
        10100
        01111
    and
    ---------
        00100
    */
    println(bitData.toString(2))
    /*
        00100
        10100
    xor
    ---------
        10000
    */
    println((bitData xor(0b10100)).toString(2))
}