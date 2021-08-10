/*
    스코프 함수 종류
    1/apply:안스턴스를 생성 후, 변수에 담기전에 초기화 과정을 할 때 쓰임,참조연산자 사용 x
    2.run: apply와 같이 참조 연사자 사용x,안스턴스를 만든 후,멤버 변수를 반환 받아 변수에 저장할 때 사용
    3.with:run과 같음 단지 인스턴스를 참조연사자로 접근안하고(a.with(x)) 파라미터로  전달 with(a)
    4.also:it란 keyword를 통해 apply역할
    5.let:it란 keyword를 통해 run역할

    처리가 끝나면 인스턴스 반환
    apply,also

    처리가 끝나면 최종값 반환
    run/let

    also/let: apply와 run은 멤버를 별도의 연산자 없이 사용했지만
            also/let은 마치 파라미터로 인스턴스를 넘기는 것 처럼
            it keyword를 이용하여 멤버 접근 
            why? 만약 스코프 바깥에 멤버의 이름과 중복된느게 있을 경우
            apply/run은 apply와 run이 있는 스코프 변수를 우선시 하지만
            also/let은 스코프 안에 있는 것을 우선시 

*/

class Book(var name:String,var price:Int)
{
    fun discount()
    {
        this.price-=2000
    }
}

fun main(args: Array<String>) {
    /*
        apply 안에서 참조연산자 필요없음
        멤버 접근 시  그냥 멤버이름으로 접근
    */
    var price=5000 //also 와 let의 특징을 알아보기 위해 , Book의 멤버변수인 price와 같은 이름으로
    var a=Book("코틀린",10000).apply {
        println(price) //5000 ,외부 변수가 우선 시
        name="[초특가]"+name
        discount()
    }
    println(a.price)// 8000
    a.also { 
        println(" also 상품명: ${it.name} 가격:${it.price}원")
     }
    /*
    run:인스턴스 완성 후 멤버 값을 받을 때
    */
    var b=a.run { 
        println(" run 상품명: ${name} 가격:${price}원")
        price //price가 리턴되어 b에 저장
     }

    var l=a.let{
        println(" run 상품명: ${it.name} 가격:${it.price}원")
        it.price //price가 리턴되어 l에 저장
    }
     println(b) //5000
     println(l) // 8000
     /*
    with:인스턴스 완성 후 멤버 값을 받을 때, 인스턴스를 파라미터로 넘겨줄 때 사용
    */
     var c=with(a){
        println("with 상품명: ${name} 가격:${price}원")
        price        
     }
     println(c)


}

