/*
고차함수 란
함수를 마치 클래스에서 만들어낸 인스턴스처럼 취급하는 방법
함수를 파라미터로 넘겨줄 수도 있고 결과값으로 반환 받을 수 있음
모든함수를 고차함수로 사용가능


정의할 부분에서 파라미터로 넘겨줄 때는 
해당 함수 매개변수 타입과 ,리턴타입을 람다 형식으로 표현하고
만약 리턴 타입이 없을 시 Unit 타입 사용
이후 파라미터로 사용할 때 ::연산자 사용
::->일반 함수를 고차함수로 바꿔주는 연산자
*/
fun main(args: Array<String>) {
    b(::a)
}

fun a(str:String,num:Int){
    println("${str} 함수 ${num}")
}

fun b(function:(String,Int)->Unit)
{
    function("b가 호출한",10)
}