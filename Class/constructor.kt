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

class D(val name: String) {
    //이렇게 var 또는 val이 붙어 있으면 선언과 초기화가 동시에
    var age: Int = 20
    var height: Int = 500

//    컴파일 에러!
//    constructor(name: String, age: Int) {
//        this.age = age
//    }

    init{
        println("init")
    }
    constructor(name: String, age: Int) : this(name) {
        this.age = age
        println("22")
        //init -> constructor(name,age) 순서
    }

    constructor(name: String, age: Int, height: Int) : this(name, age) {
        this.height = height
        println("3")
        // init -> constructor(name,age) -> constructor(name,age,height) 순서
    }
}

fun main(args: Array<String>) {
    
  var a:D=D("33")
  var b:D=D("33",22)
  var c:D=D("33",22,11)
 /*
  output
  init
  
  init
  22

	init
	22
	3
  * */  
}