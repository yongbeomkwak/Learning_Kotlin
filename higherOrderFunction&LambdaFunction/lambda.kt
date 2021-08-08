/*
람다함수 란
자체가 고차함수, 별도의 연산자(::)필요 없음
문법:
    var b:Type = 값, 기본 변수 선언에서 타입 부분에 ,매개변수와 리턴 타입이 들어감,값에 함수 내용
    val a:(매개변수 타입들,..) -> 리턴 타입 ={매개변수명:타입,.... -> 함수내용} 

특징
    1)만약 리턴 타입이 있을 경우 마지막 부분이 리턴 됨
    2)파라미터가 없다면 중괄호 안에는 실행할 구문만
    3)파라미터가 한개라면 , 실행구문 쪽에서 $it를 사용한다
    */
fun main(args: Array<String>) {
    
    val lambda:(String,Int)->Unit={str:String,num:Int->println("$str 람다함수 $num")}
    b(lambda)

    /*
 특징 1)
 */

 val cal:(Int,Int)->Int={a,b->
    println(a)
    println(b)
    a+b //여기가 리턴됨 return keyword가 없어도
}
println(cal(1,2))

/*
    특징 2)
    ()->Unit(리턴 없음)={실행 구문만}
*/
val a:()->Unit={println("파라미터가 없습니다.")}
a()

/*
    특징 3)
    파라미터 한개 시 $it 사용
*/

val c:(String)->Unit={println("$it 파라미터 한개 람다함수")}

    c("AX")
}





fun b(function:(String,Int)->Unit)
{
    function("b가 호출한",10)
}
