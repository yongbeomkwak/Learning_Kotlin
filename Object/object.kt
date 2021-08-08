/*
    Object:공통적으로 사용하는 변수 및 함수
    Singleton Pattern:클래스의 인스턴스를 단 하나만 만들어서 사용하는 패턴
    
    문법:object keyword사용

    특징
        1.생성자를 사용 안함
        2.Object이름에 참조연산자(.)를 붙여 사용
        3.최초 사용시 생성, 이후 코드 전체에서 공용 사용
*/


fun main(args: Array<String>) {
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()
    println(Counter.count)
    Counter.countClear()
    println(Counter.count)



    var a=Foodpoll("짬뽕")
    var b=Foodpoll("짜장")
    println("전체 투표수:${Foodpoll.total}")
    a.vote()
    b.vote()
    a.vote()
    a.vote()
    println(a.count)
    println(b.count)
    println("전체 투표수:${Foodpoll.total}")
    
}

object Counter{
    var count=0

    fun countUp(){
        count++
    }

    fun countClear(){
        count=0
    }
}

/*
    Companion object:Static 같은 개념,클래스 내부에 별도 공간에 고정적을 존재하여,
    인스턴스를 생성하지 않아도,공용으로 사용가능한 속성 or 함수

    문법:class 내부에 companion object keyword 시용,
        Class 이름으로 접근 
*/

class Foodpoll(val name:String)
{
    companion object {
        var total=0
    }
    var count=0

    fun vote(){
        count++
        total++
    }
}