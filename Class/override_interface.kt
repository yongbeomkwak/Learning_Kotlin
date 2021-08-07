fun main(args: Array<String>) {
    
    var a=Animal()
    var t=Tiger()
    a.eat()
    t.eat()
    var r=Rabit()
    r.eat()
    r.sniff()
    var d=Dog()
    d.eat()
    d.run()

}

/*
    override: super class 함수를 재정의 
    규칙 1:super class의 해당 함수 앞에 마찬가지로 open을 붙혀주고
    규칙 2:sub class에서는 사용시 앞에 override를 붙여준다
*/ 
open class Animal{
    open fun eat(){
        println("음식을 먹습니다.")
    }
}

class Tiger:Animal(){
    
    override fun eat(){
        println("고기를 먹습니다.")
    }

}

/*
abstract class:선언부만 있고 기능은 없는 클래스 
-  즉 추상함수 및 추상 클래스는 앞에 abstract keyword를 붙여줌
-  단독으로 인스턴스는 못 만들고 상속하여 생성할 수 있음
    var a=Animal2() 불가능
-  마찬가지로 추상함수 사용 시 override keyword를 붙임
*/

abstract class Animal2{
    //추상 함수  구현부 없음
    abstract fun eat() 
    //일반 정의있는 함수도 선언가능
    fun sniff()
    {
        println("킁킁")
    }
}

class Rabit :Animal2(){
    override fun eat(){
        println("당근을 먹습니다.")
    }
}
/*
    interface: interface keyword사용
    -interfcae 이름{}
    특징
    -인터페이스는 속성,추상함수,일반함수 가능 
    -인터페이스는 생성자 사용 불가
    -구현부가 있는 함수는 ->open함수
    -구현부가 없느 함수는 ->abstract함수 
    -인터페이스는 자동으로 구분해줌 따로 keyword 붙일 필요 없음 그냥 fun만 하면됨
    -다중 상속 시 ,   : it1,it2 ... 이런 식으로 ,로 연결
*/

interface Runner{
    //abstract
    fun run() 
}

interface Eater{
    //open
    fun eat(){
        println("음식을 먹습니다.")
    }
}

class Dog : Runner,Eater{
    override fun run(){
        println("우다다 달립니다.")
    }
    override fun eat()
    {
        println("허겁지겁 먹습니다.")
    }
}