/*
람다함수 란
자체가 고차함수, 별도의 연산자(::)필요 없음
문법:
var b:Type = 값, 기본 변수 선언에서 타입 부분에 ,매개변수와 리턴 타입이 들어감,값에 함수 내용
val a:(매개변수 타입들,..) -> 리턴 타입 ={매개변수명:타입,.... -> 함수내용} 
*/
fun main(args: Array<String>) {
    
    val lambda:(String,Int)->Unit={str:String,num:Int->println("$str 람다함수 $num")}
    b(lambda)
}



fun b(function:(String,Int)->Unit)
{
    function("b가 호출한",10)
}
