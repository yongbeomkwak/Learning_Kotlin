/*
    overloading:매개변수가 다르고(개수 or 자료형) 함수이름이 같은이름
*/
fun main(args: Array<String>) {
    read(3)
    read("안녕")

    deliveryItem("짬뽕")
    deliveryItem("책",3)
    deliveryItem("노트북",30,"학교")
    deliveryItem("책",destination="운동장")// named Argument
    sum("Hi",1,2,3,4,5)
}

fun read(x:Int){
    println("숫자 ${x}입니다. ")
}

fun read(x:String){
    println(x)
}

/*
    default Argument: 값 지정 안할 시 기본 값 사용
                매개변수 타입 옆에 = 값 형식
    name Argument:해당 매개변수명=값 형식
    a(count=3) 이런식
*/

fun deliveryItem(name:String,count:Int=1,destination:String ="집")
{
    println("${name} ${count}개를 ${destination}에 배달 하였습니다")
}

/*
    매개변수가 몇개 인지 정해지지 않았을 때 vararg keyword 사용
    반드시 마지막 쪽에 위치해야함 
*/
fun sum(name:String,vararg numbers:Int)
{
    var sum=0
    println(name)
    for (n in numbers)
    {
        sum+=n
    }
    println(sum)
}