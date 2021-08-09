/*
    Map
        Key와 Value의 쌍
        Map과 MutableMap 존재

        구조: MutableMap.MutableEntry로 저장됨 ,즉 key와 value가 entry안에 있음
        mapOf와 mutableMapOf
        그리고 key와 value는 to keyword를 사용하여 이어주며 넣는다
        추가 put(키,값)
        삭제 remove(키)
*/

fun main(args: Array<String>) {
    var a = mutableMapOf("Red" to "빨강","Blue" to "파랑","Green" to "초록")

    for (entry in a)
    {
        println("${entry.key} : ${entry.value}")
    }

    a.put("Orange","주황")
    println(a)

    a.remove("Red")
    println(a)
    println(a["Bluez"])
    
}