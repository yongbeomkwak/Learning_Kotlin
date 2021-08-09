
/*
    1.List: 수정 불가 , listOf(....) 사용
    2.MutableList:수정 가능, mutableListOf(....) 시용

    a)추가
        add(데이터): 가장 뒤 
        add(인덱스,데이터): 해당 위치에 추가]
    
    b)삭제
        remove(데이터)
        removeAt(인덱스)
    
    c)정렬
        shuffle():무작이 섞기
        sort():정렬

*/


fun main(args: Array<String>) {
    val a=listOf(1,2,3,4,5)
    println(a[1])

    for(num in a)
    {
        print("${num}-")
    }
    println()
    
    val b=mutableListOf(6,4,3)
    println(b)
    b.add(4)
    println(b)
    b.add(2,8)
    println(b)
    b.removeAt(1)
    println(b)
    b.shuffle()
    println(b)
    b.sort()
    println(b)
    b.remove(4)
    println(b)
}