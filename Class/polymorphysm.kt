/*
    Up-Casting:서브 클래스의 인스턴스가 super Class 타입 변수에 저장 될 때
    -   별도의 연산자 필요x
    -   sub class의 멤버는 사용불가 
    -   ex) var a:A=B() 


    Down-casting:Up-casting된 객체를 다시 서브 클래스로 만드는 과정
    -   연산자 is와 as 필요
    -   is는 조건문에 사용되며, 호환여부 확인 및 가능하면 캐스팅, 조건문 안에서만 DC가 됨
    -   as는 해당 변수와 결과로 받는 변수 모두 캐스팅
        ex) var c = b as Cola 일 때 , b 역시도  Cola로 캐스팅됨, 이후 Cola로 취급
*/
open class Drink{
    var name="음료"
    
    open fun drink(){
        println("${name}을 마십니다.")
    }
}

class Cola:Drink(){ //서브 클래스
    var type="콜라"

    override fun drink()
    {
        println("${name}중 ${type}을 마십니다.")
    }
    fun washDish(){
        println("설거지를 합니다.")
    }
}

fun main(args: Array<String>) {
    var a =Drink()
    a.drink()
    //Up-casting
    var b:Drink=Cola() 
    b.drink() //override 된 drink 실행
    //b.washDish() 사용불가 

    if(b is Cola){
        b.washDish()
    }
    //b.washDish() 사용불가 
    var c = b as Cola
    c.washDish()
    b.washDish()
}
