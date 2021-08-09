/*
    1.length:길이
    2.toLowerCase():소문자
    3.toUpperCase():대문자

    4.split("구분자") : 구분자 기준 잘라서 문자열 List반환

    5.substring(range):해당 범위 만큼 보여준다 , substring(1..5)

    6.isNullOrEmpty:진짜 비어었는지 , null or ""
    7.isNullOrBlank:공백도 포함 ,null or "" or " "
    8.startsWith("문자열") :해당 문자열로 시작하면 true 
    9.endsWith("문자열"): 해당 문자열로 끝나면 true
    10.contains("문자열"): 해당 문자열을 포함하면 true

    
    문자열 리스트(not String)
    1.joinToString("구분자"): 해당 구분자를 사이사이 넣어 배열을 하나의 문자열로 합침,구분자 없을 시 그냥 합침

*/
fun main(args: Array<String>) {

    val test1:String="Test.Kotlin.String"

    println(test1.length)
    println(test1.toUpperCase())
    println(test1.toLowerCase())

    val test2=test1.split(".")
    println(test2)
    println(test2.joinToString())
    println(test2.joinToString("-"))

    println(test1.substring(5..10))

    val nullString:String? =null
    val emptyString=""
    val blankString=" "
    val normalString="A "

    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())
    println("#########################")
    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    val test3="Kotlin.kt"
    val test4="Java.java"
    println("Test3 Test4")
    println(test3.startsWith("Kotlin")) //true
    println(test3.startsWith("kotlin")) //false
    println(test4.startsWith("Java")) //true 
    println(test4.startsWith("java")) //false
    println("#########################")
    println(test3.endsWith("Kt")) //false
    println(test3.endsWith("kt")) //true 
    println(test4.endsWith("Java")) //false
    println(test4.endsWith("java")) // true
    println("#########################")
    println(test3.contains("lin")) //true
    println(test3.contains("Lin")) //flase
    println(test4.contains("ava")) //true 
    println(test4.contains("Asva"))// false

}