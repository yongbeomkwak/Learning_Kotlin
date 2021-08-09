/*
    Set: 중복x ,순서 x
    
    특징
        순서가 없어 index 사용 x,contains로 판별
        Set과 MutableSet<T> 존재
        SetOf,mutableSetOf 

        추가 add()
        삭제 remove()
        존재여부 contains()
*/
fun main(args: Array<String>) {
    val a=mutableSetOf("사과","바나나","키위")

    for(item in a)
    {
        println(item)
    }
    a.add("자몽")
    println(a)
    a.remove("사과")
    println(a)
    println(a.contains("자몽"))
}