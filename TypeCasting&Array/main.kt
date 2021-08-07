
fun main()
{
/*
1. 암시적 형 변환 지원x(자동 형 변환)
2. 명시적 형 변환(explicit type Casting)
    - toByte()
    - toShort()
    - toInt()
    - toLong()
    - toFloat()
    - toDouble()
    - toChar()
 */

var a:Int =3;
var b:Float =a.toFloat()

println(a)
println(b)
/*  
배열 선언 하기

1.arrayOf(1,,,,,n)
2.arrayOfNulls<Type>(size)  , Null로 Size개 채워진 배열 생선

*/

var IntArray1=arrayOf(1,2,3,4,5)
println(IntArray1[0])

var IntArray2=arrayOfNulls<Int>(5)
println(IntArray2[0])

}
 