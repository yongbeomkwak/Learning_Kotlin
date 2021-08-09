
data class Person(val name:String,val age:Int)

fun main(args: Array<String>) {
    val personList=listOf(Person("A",1),Person("A",2),Person("C",3),Person("D",4),)
    
    //associateBy:함수 안에 있는 값을 key로하여 Map을 만들어줌

    println(personList.associateBy { it.age })
    //groupBy:함수 안에 있는 값을 기준으로  묶어 map을 만듬
    println(personList.groupBy { it.name })

    //partition:함수 기준을통해 리스트 2개로 나눔

    val (a,b)=personList.partition { it.age<3 }
    println(a) //여기에 true 인 것들 
    println(b) //여기에 false 인 것들


    val numbers=listOf(1,2,3,4,5)
    //flatMap:해당 연산을 하여 새로운 Collection 리턴
    println(numbers.flatMap{listOf(it*10,it+10)}) //해당 요소마다 *10 하여 하나,+10 하나, 총 2개 씩 새로운 값으로 대체된다
    //10 11, 20,12 ,30,13,40,14,50,15 ...

    //getOrElse:해당 인덱스가 존재하면 그 값을 만약 없다면 함수 안에 있는 default값을 리턴
    println(numbers.getOrElse(1) { 50 })
    println(numbers.getOrElse(5) { 50 })    

    val name=listOf("A","B","C","D","E")
    println(name zip numbers) // name의 리스트 개수를 기준으로 2 collection을 합쳐준다,만약 
}