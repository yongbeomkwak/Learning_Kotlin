fun main() {
    /*1.변수 선언 
    var:일반벅인 변수 (읽기 쓰기 가능 )
    val:선언 시 초기화가능(중간에 변경 x
    */
    

    //문법 var 변수명:타입
    var a:Int =4
    println(a)
    //문법 var 변수명:타입?  ,Nullablet 선언 시
    var b:Int? 
    b=3
    println(b)
    

    /*
    2. 타입
        1)정수형
            -   Byte:8 bits
            -   Short:16 bits
            -   Int:32 bits
            -   long:64 bits : 1023*/
    var intValue:Int=1234
    var longValue:Long=1234L // Long 타입일 때 L
    var intValueByHex:Int =0x1af // 16진수 ,코틀린은 8 진수 지원 안함
    var intValueByBin:Int =0b10101 // 2진수
    println(intValue)
    println(longValue)
    println(intValueByHex)
    println(intValueByBin)

    /*         
        2)실수형
            -   Float:32 bits
            -   Double:64 bits
     */
     var doubleValue:Double=2.34
     var doubleValueWithExp:Double=125.5e10 //지수 표기법
     var floatValue:Float=2.345f
     println(doubleValue)
     println(doubleValueWithExp)
     println(floatValue)

        /*         
        3)문자형
            -   char:16 bits(2Byte)
            -   
        4) 논리형
            - Boolean :true or false
     */
     var charValue:Char='a'
     var booleanValue:Boolean=true
     /*
        5) 문자열
         " " (큰 따옴표) 사용
          """  """ 3개 사용 시 줄 바꿈 및 특수문자 까지 사용가능
      */
    var stringValue="Hello World\n"
    var multistringValue=""" ANnan
    LALA
    ^^
    """
    println(charValue)
    println(booleanValue)
    println(stringValue)
    println(multistringValue)
}