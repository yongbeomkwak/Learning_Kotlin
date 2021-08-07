fun main(args: Array<String>) {
    
    
    var a=Person("엘", 18)
    var b=Person("라",20)
    
    var c=Person("피")
    var d=Person("카")
    
}

/*
    init:생성자 호출 시 실행되는 함수 
    constructor:보조 생성자
    멤버 변수 중  기본값으로 해야할 것이 있을 때 사용
    반드 시 init 생성자 쪽으로 초기화 진행 시켜야함(this 사용) 
   용
    문법: constructor(arg:Type..) :this(arg(넘겨 줄 값),1(기본값)){}
    init이 먼저 실행되고, 보조생성자가 실행되는 구조
*/
class Person(var name:String,var age:Int)
{
    init{
        println("안녕하세요 ${this.age} 살 ${this.name}입니다")
    }
    //name을 입력 받고 age는 22로 init에 넘겨줌
    constructor(name:String):this(name,22){
        println("보조생성자가 호출되었습니다.")

    }
}