val a="패키지 스코프"
fun main(args: Array<String>) {
    /*
    a)스코프 범위
        1.패키지 내부
        2.클래스 내부
        3.함수 내부
    b)스코프 규칙
        1.스코프 외부에서 스코프 내부로 접근은 참조 연산자(.)로만 가능
        2.패키지외부는 import 로 참조
        3.동일 패키지에서는  멤버 공유 가능
        4.하위 스코프에서 상위 스코프 재정의 가능
        
    */

    //b-3
    println(a)
    B().print()

    //b-4
    val a="함수 스코프"
    println(a) //함수 스코프
    A().print() //클래스 스코프 
}

/*
b-3
 a 변수가 main 함수와 클래스 B에 모두 속하지 않았지만 , 같은 패키지 이므로 공유 가능
 */
class B{
    fun print(){
        println(a)
    }
}

/*
    b-4
    글로벌 변수 a를 다시 재정
*/
class A{
    val a="클래스 스코프"
    fun print(){
        println(a)
    }
}