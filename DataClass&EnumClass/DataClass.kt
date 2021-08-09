/*
    DataClass: 데이터를 다루는데 최적화된 클래스이므로 5가지 기능을 제공한다

    1.equals() 자동구현:동일성 판단
    2.hasCode() :해쉬코드 생성
    3.toString(): 속성을 보기 쉽게
    4.copy(): 객체를 복사하여 새 객체를 만듬, 파라미터가 있다면 해당 파라미터 교체
    5.ComponetX():속성을 순서대로 반환, ex) Component1,Component2...

    문법: data keyword 사용
    data class 클래스명
    */
class General(val name:String,val id:Int)
{

}

data class Data(val name:String,val id:Int)

fun main(args: Array<String>) {
    val a =General("박보영", 212)
    val b =Data("루다",306)

    println(a==General("박보영", 212))
    println(a.hashCode())
    println(a)

    println(b==Data("루다",306))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("아린")) //루다를 아린으로 바꿔서 리턴해줌 
    println(b.copy(id=618)) //id를 618로 바꿔서 리턴해줌

    val list=listOf(Data("보영",122),Data("하나",322),Data("미연",100),)

    for((a,b) in list) //내부적으로 a=Component1 ,b=Component2 함수가 실행되어 값이 들어감
    {
        println("${a},${b}")
    }
}