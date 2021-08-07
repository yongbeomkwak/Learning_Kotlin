fun main(args: Array<String>) {
    
    
    var a=Person("엘", 18)
    var b=Person("라",20)
    a.introduce()
    b.introduce()
}

/*
 문법:class 클래스명(var arg1:Type...){
     method...
 } 
*/
class Person(var name:String,var age:Int)
{
    fun introduce(){
        println("안녕하세요 $age 살 $name 입니다.")
    }
}