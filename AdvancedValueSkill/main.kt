fun main(args: Array<String>) {
    
    val foodCourt=FoodCourt()
    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)

    val a=LateInitSample()
    println(a.getLateInitText())
    a.text="새로운 값 할당"
    println(a.getLateInitText())


    /*
    lazy: 해당 변수를 사용하기전 까지 초기화를 늦춤(성능 향상)
            첫 사용 시 초기화, 그 이후로는 초기화 진행 하지않음

            lazy함수 안은 람다 형이기 때문에 마지막 값이 리턴 값이며, 여러개의 구문이 들어간다
            문법: var(val) 변수명:type by lazy{}

    */

    println("코드를 시작합니다.")
    val number: Int by lazy{
    println("초기화를 진행합니다.")
    7    
    }
    println(number) //여기가 첫 변수 사용 구문이여서 초기화를 진행합니다 출력됨
    println(number) // 여기서는 초기화를 진행합니다 출력 x,첫 사용이아니라
    

}


/*
    var :객체를 할당하고 다른 객체로 변경가능
    val : 객체를 할당하고 다른 객체로 변경 불가x 단 안의 member,즉 속성은 변경가능
    const val:상수 절대 변경불가, 기본 자료형만 가능(String 포함) 네이밍:대문자+_
*/
class FoodCourt{
    companion object{
        const val FOOD_CREAM_PASTA="크림 파스타"
        const val FOOD_STEAK="스테이크"
        const val FOOD_PIZZA="피자"
    }

    fun searchPrice(foodName:String)
    {
     val price=when(foodName)
     {
         FOOD_CREAM_PASTA->13000
         FOOD_STEAK->15000
         FOOD_PIZZA->18000
         else->0
     }   
     println("${foodName}은 ${price}입니다.")
    }
}

/*
    lateinit keyword
    -초기값 할당 전까지 변수를 사용불가 x
    -기본 자료형에 상요 불가x, String은  가능
    -초기화 되었는지 여부는 ::a.isInitialized를 사용
*/

class LateInitSample{
    lateinit var text:String

    fun getLateInitText():String{
        if(::text.isInitialized) //초기화 되었으면 true
        {
            return text
        }
        return "기본값"
    }
}

