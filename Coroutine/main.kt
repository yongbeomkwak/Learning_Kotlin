import kotlinx.coroutines.*
/*
  Coroutine
  비동기 처리를 위해서 kotlinx.coroutines.* import해야함  
   
  GlobalScope:프로그램 어디서나 제어 동작이 가능한 기본 범위
  코루틴은 제어범위 및 실행범위를 지정할 수 있음(코루틴 Scope)

  CoroutineScope:특정한 목적의 Dispatcher를 지정하여 제어 및 동작이 가능한 범위 

  Dispatchers 종류

    1.Dispatchers.Default:기본적인 백그러운드 동작, 정렬이나 무거운 작업
    2.Dispatchers.IO: I/O에 최적화된 동작 ,네트워크, DB
    3.Dispatchers.Main:메인(UI)스레드에 동작


    launch vs async
    -launch(동기) ,async(비동기)
    -launch:반환 값이 없는 Job객체
    -async:반환 값이 있는 Deffered 객체
    -둘다 모두 람다 함수 형식(async는 마지막 값이 리턴값)
    -코루틴을 생하는 함수
*/

/*
runBlocking

코루틴은 제어 스코프 또는 프로그램 종료되면 같이 종료 되므로
기다려주는 범위를 생성해줘야함

runBlocking{} 코루틴이 끝날 때 까지 기다려주는 구간
주의:안드로이드는  메인 스레드에서 runBlocking을 걸어주면 일정 시간안에 응답없으면 강제종료됨

delay(millsecond:Long):루틴을 대기
Job.join():Job이 끝날 때까지 대기
Deferred.await():Deferred가 끝날 때까지 대기,또한 Deferred의 결과를 반환해주는 함수
*/

fun count():Int
{
    for(i in 'a'..'f')
    {
		print("${i}-")
    }
    return 3
}


fun main(args: Array<String>) {
    
   val scope=CoroutineScope(Dispatchers.Default)
   val Gscope=GlobalScope
 
    
   Gscope.launch{
       for(i in 1..10)
    {
		print("${i}-")
    }
   }
   val coroutineA=scope.launch{
       for(i in 1..10)
    {
		print("${i}- ")
    }
   }
   
   CoroutineScope(Dispatchers.Default).launch{
       var num=CoroutineScope(Dispatchers.Default).async{
           count()
       }.await()
       println("HiHi: ${num}")
   }
   
   println("Hello")
   
   
   
   
 
   
}
