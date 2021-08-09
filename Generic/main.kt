/*
    1.Class 제네릭 선언

    class 클래스명 <T:A> (val t:T){}  A or A를 상속받은 클래스만 사용가능 한 타입
*/
open class A{
    open fun shout()
    {
        println("A가 소리칩니다.")
    }
}

class B:A(){
    override fun shout(){
        println("B가 소리칩니다.")
    }
}

class C:A(){
    override fun shout(){
        println("C가 소리칩니다.")        
    }
}

class UsingGeneric <T:A>(val t:T)
{
    fun doShouting(){
        t.shout()
    }
}

/*
    함수 제네릭
    fun <T:A> 함수명(t:T){} // A or A를 상속받은 클래스만 사용가능 한 타입
*/

fun <T:A> doShouting(t:T)
{
    t.shout()
}
fun main(args: Array<String>) {
    UsingGeneric(A()).doShouting()
    UsingGeneric(B()).doShouting()
    UsingGeneric(C()).doShouting()
    doShouting(B())
}
