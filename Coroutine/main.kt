
/*
  Coroutine
  비동기 처리를 위해서 kotlinx.coroutines.* import해야함  

  코루틴은 제어범위 및 실행범위를 지정할 수 있음(코루틴 Scope)

  CoroutineScope:특정한 목적의 Dispatcher를 지정하여 제어 및 동작이 가능한 범위 

  Dispatcher 종률

    1.Dispatcher.Default:기본적인 백그러운드 동작
    2.Dispatcher.IO: I/O에 최적화된 동작
    3.Dispatcher.Main:메인(UI)스레드에 동작


    launch vs async
    -launch:반환 값이 없는 Job객체
    -async:반환 값이 있는 Deffered 객체
    -둘다 모두 람다 함수 형식(async는 마지막 값이 리턴값)
    -코루틴을 생서하는 함수
*/

/*
runBlocking

코루틴은 제어 스코프 또는 프로그램 종료되면 같이 종료 되므로
기다려주는 범위를 생성해줘야함

runBlocking{} 코루틴이 끝날 때 까지 기다려주는 구간
주의:안드로이드는  메인 스레드에서 runBlocking을 걸어주면 일정 시간안에 응답없으면 강제종료됨
*/

import kotlinx.coroutines.*
fun main(args: Array<String>) {
    
    runBlocking{
        launch{
            for(i in 1..5){
                println(i)
            }
        }
    }
}
