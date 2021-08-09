/*

중첩클래스: 클래스안에 선언하지만 사실상 독립된 클래스
inner클래스: 구조 상으로 안에 존재하므로 반드시 바깥 클래스가 생성되어야 사용 할 수 있음
    inner keyword 사용

    차이: 바깥 클래스와 변수를 공유 할 수 있담(inner)
    변수 사용시: this@바깥 클래스 이름 (참조연산자).변수명
*/

class Outer{
    var text="Outer Class"
    class Nested{ //중첩 클래스 
        fun introduce()
        {
            println("Nested Class")
        }
    }
    
    inner class Inner{
        var text="Inner Class"

        fun introduceInner()
        {
            println(text)
        }

        fun introudceOuter()
        {
            println(this@Outer.text) //바깥 클래스 변수 사용
        }
    }
}

fun main(args: Array<String>) {
    Outer.Nested().introduce()

    val outer=Outer()
    val inner=outer.Inner()

    inner.introduceInner()
    inner.introudceOuter()

    outer.text="Changed Outer Class"
    inner.introudceOuter()
}