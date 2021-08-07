fun main(args: Array<String>) {    
    /*
        1. if문 

        2. when문
            -다른 언어의 Switch문 과 비슷.
            -값을 리턴 할 수도 있음(doWhen2 참고)
            -등호나 부등호 사용 불가 
            -여러개 조건 만족 시 가장 위에 위치한 것을 실행 
            -모든 조건이 맞지 않을 때는 else 에서 실행됨
    */

    var a:Int=11
    if (a>10){
        println("10보다 큽니다")
    }else{
        println("10보다 작습니다.")
    }
    doWhen(1)
    doWhen("Dimo")
    doWhen(1234L)
    doWhen(3.1234)
    doWhen("Kotlin")
    var k=doWhen2(1234L)
    println("doWhen2: $k\n")
    /*
        2.연산자

        1)비교 연산자
        >,<,>=,<=,!=,==

        2) is 연산자
        -   호환 여부 확인 연산자
        -  변수 is Type
        -   호환이 된다면 변화 까지 해줌
        -  호환이 안되는지? -> !is 사용
    */
    var b=1234L
    if( b is Long){
        println("호환 가능")
    }   else{
        println("호환 불가능")
    }
}
fun doWhen(a:Any)
{
    when(a)
    {
        1-> println("정수 1입니다")
        "Dimo" -> println("문자열 Dimo입니다")
        is Long -> println("정수 Long Type입니다.")
        !is String -> println("문자열이 아닙니다")
        else -> println("모든 조건에 부합하지 않습니다.") 
    }
}

fun doWhen2(a:Any):String
{
    var result=when(a)
    {
        1-> "정수 1입니다"
        "Dimo" ->"문자열 Dimo입니다"
        is Long -> "정수 Long Type입니다."
        !is String -> "문자열이 아닙니다"
        else -> "모든 조건에 부합하지 않습니다." 
    }
    return result
}