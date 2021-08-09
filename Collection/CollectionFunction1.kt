fun main(args: Array<String>) {
    
    var list=listOf("A","B","C","D","E","F")

    //컬렉션 함수 안에서는 it keyword로 요소들에 접근한다
    //forEach: 컬렉션 전용 반복문,

    list.forEach{print(it+" ")}
    println()

    //filter: 해당 조건이 맞는 놈만 실행
    println(list.filter { it.startsWith("A") })
    println()

    //map: 모든 요소에 대하여 map안에 있는 구분을 적용한 컬렉션을 반환
    //ex 밑에는 이름이라는 문자열을 붙혀서 모두 적용 
    println(list.map { "이름: "+ it })
    println()

    //any: 해당 조건에 하나라도 맞는게 있음 true
    println(list.any {it=="A"})
    println()

    //모든 요소가 all의 조건을 만족하는지
    println(list.all{ it.length==1 })
    println()

     //모든 요소가 none의 조건을 만족하지 않는 지
     println(list.all{ it.length==2 })
     println()

     //해당 조건을 만족하는 요소 개수 출력
     println(list.count{ it.length==1 })
     println()
    
     // firstOrNull 해당 조건을 만족하는 첫 번째 요소 찾기 없으면 null
     println(list.firstOrNull(){ it.length==2 })
     println()
     // lastOrNull 해당 조건을 만족하는 마지막 요소 찾기 없으면 null
     println(list.lastOrNull(){ it.length==1 })
     println()



}