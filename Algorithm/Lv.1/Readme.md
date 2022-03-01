#   Lv.1

##  3진법 뒤집기.kt
-   str.toInt(n):n 진법 변환
    
           "1010".toInt(2) -> 10
-   int.toString(n):n 진법 변환

            10.toString(2) -> "1010"  

##  문자열 내 마음대로 정렬하기
-   sortedWith(compareBy({ord1},{ord2})) 
    -   compareBy에서 정렬규칙 ord1 그다음 ord2 순으로 정렬함
-   .toTypedArray(): 배열 타입 상관없이 해당 타입에 맞은 배열로 리턴


### 정수 내림차순으로 배치하기
-   String 내림차순 , charArray로 바꾼 후 정렬


        String(
            n.toString().
            toCharArray().
            sortedArrayDescending()
            )
        n을 String(n.toString)으로 변환 후
        toCharArray():Char 배열로
        sortedArrayDescendnig() :내림차순 정렬 휴
        다시 String()으로 감싸 String으로 형변환
        