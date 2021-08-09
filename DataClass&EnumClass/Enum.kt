/*
    Enum: 열거형 클래스 
    문법: enum keyword 
    
    매개변수 삽입 및 함수도 선언 할 수 있음
    단 함수 선언 시 열거 선언이 끝난 곳에 ;(세미콜론)을 붙힌 후 부터 함수 선언 가능
*/

enum class State(val msg:String)
{
    SING("노래를 부릅니다."),
    EAT("밥을 먹습니다."),
    SLEEP("잠을 잡니다"); //함수를 선언하기 위해 열거형 선언 끝에 ;

    fun isSleeping() =this==State.SLEEP
}

fun main(args: Array<String>) {
     var state=State.SING
     println(state)

     state=State.SLEEP
     println(state.isSleeping())

     state=State.EAT
     println(state.msg)

}