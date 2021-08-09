
/*
    infix:마치 연산자 처럼 사용 하는 함수
    infix keyword 사용
    문법 :
    infix fun 타입.함수명(매개변수:타입):리턴타입= 함수 내용
*/

infix fun Int.multiply(x:Int):Int =this * x //여기서 this는 fun 뒤에 있는 Int 타입의 값을 의미
fun main(args: Array<String>) {
    
    println(6 multiply(4))
    println(6.multiply(4))

}