/*
    ?. :null safe operator , 참조연산자(.)실행전 null check 만약 null 이면 뒤에는 실행 x 
    ?: :elvis operator ,객체가 null이 아니라면 그대로 실행,null이면 : 연산자 옆에 있는 객체로 대체 됨
    !!.:non-null assertion operator , 참조연산자(.) 사용하면서 컴파일 시 null check를 하지않아  런타임시 null pointer Exception이 발생하도록 방치하는 연산자
*/
fun main(args: Array<String>) {
    var a:String?=null
    
    println(a?.toUpperCase()) //null
    println(a?:"default".toUpperCase())// DEFAULT
    println(a!!.toUpperCase()) //Null PointerException
}