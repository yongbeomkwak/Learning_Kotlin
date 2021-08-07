fun main(args: Array<String>) {

    var a=Animal("대한이",2,"Cat")
    var b=Dog("둥이",5)
    a.introduce()
    b.introduce()
    b.bark()
}


/*
기본적으로 Kotlin은  상속을 금지 한다 
상속을 하는 클래스 -> super class
상속을 받는 클래스 -> sub   class

규칙 a: 만약 상속을 해야할 때 super class에 open을 붙혀준다
    - open class 클래스명...fun
규칙 b: sub class는 super class에 존재하는 속성과 같은 이름의 속성을 가질 수 없음


*/

open class Animal(var name:String,var age:Int,var type:String)
{
    fun introduce(){
        println("저는 ${this.type} ${this.name}이고,${this.age}살 입니다.")
    }
}

//sub class 사용 시 , var를 사용하지 않는다,입력받아 넘겨준다(부모로)
// class 자식클래스명 :부모()[반드시 () 붙여야됨 생성자형태로]
class Dog(name:String,age:Int): Animal(name,age,"Dog"){

    fun bark()
    {
        println("멍멍")
    }
}

