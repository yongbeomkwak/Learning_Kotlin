/*
    내용의 동일성: == 연사자
    객체의 동일성: === 연산자

    하지만 만약 커스텀 클래스 일 경우 내용의 동일성을 다시 구성해줘야함
    최상위 클래스의 Any의 equals 함수를 override 해준다
*/

class Product(val name:String,val price:Int)
{
    override fun equals(other:Any?):Boolean{
        if(other is Product)
        {
            return other.name==name && other.price ==price
        }
        return false
    }
}

fun main(args: Array<String>) {
    var a =Product("사이다",1000)
    var b =Product("사이다",1000)
    var c = a
    var d =Product("콜라",1000)

    println(a==b) //true 
    println(a===b) //false
    println("######")
    println(a==c) //true 
    println(a===c) //true 
    println("######")
    println(a==d) //false
    println(a===d) //false

}