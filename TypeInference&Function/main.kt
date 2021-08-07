fun main(args: Array<String>) {
    
    /*
        타입추론:변수가 할당 될 때 타입을 알아서 지정
        
        1. var a = 10
        
    */
   var ex=1
   var ex2=1L// long type
   var ex3=1.0f // Float type
   var ex4=1.0 // double
   var c='a' //char 
   var s="string" //string
   // 이진수 및 16진수 는 Int로 추론 된다
   println(ex)
   println(ex2)
   println(ex3)
   println(ex4)
   println(c)
   println(s)
   println(add1(1,2,3))
   println(add2(4,5,6))

   /*
    1.함수 만들기
    fun 함수명(arg1:type,arg2:type,arg3:type):return Type{

    }
    2.단일 표현 함수(single-expression function)
    변수에 값을 할당 하듯= 를 사용하여 
     리런타입을 지정하지 않아도  = 우측값을 보고 타입추론을 한다
    fun 함수명(arg1:type,arg2:type..)  = arg1+arg2 
   */

}

fun add1(a:Int,b:Int,c:Int):Int{
    return a+b+c
}

fun add2(a:Int,b:Int,c:Int) = a+b+c