#   Kotlin 문법 및 재정리
1.  Value&Type
  
     변수 및 타입 정의 방법
---
2.  TypeCasting&Array

    타입 변환 과 배열 선언 및 사용 방법
    
    arr.get(index):해당 인덱스 값 얻기
    arr.set(index,value):해당 인덱스에 값 넣기
    arr.size:크기 받기
---
3. TypeInference&Function

    단일표현함수 ,함수 문법,타입추론
---
4. Conditional&Operator

    조건문(if,when) 및 연산자(is..Comparison Operator)
---
5. loop

    while,do while, for( in ,step,downTo)
---
6. FlowControl&LogicOperator

    문자열안에 변수 사용시 $ 사용  "a:$ a"

    @Labeling,continue,break,
---
7. Class

    beginner.kt:클래스 기본 구조 설명
    
    constructor.kt: init 및 constructor(보조 생성자) 설명

    inheritance.kt: 상속관련 규칙 설명

    override_interface.kt: override,abstract class,interface 설명

    polymorphysm.kt:다형성(up-Casting,down-Casting,as와 is 연산자)
---
8.  Package&import
    
    패캐지 선언(package) 및 외부 패키지 불러오기(import)
---
9. Score&AccessModifier

    Scope.kt:스코프 규칙

    AcessModifier.kt:접근 제한자:public,internal,private,protected
---
10. higherOrderFunction&LambdaFunction

    higher.kt:고차함수 설명

    lambda.kt:람다 함수 설명
---
11.  [ScopeFunction](https://haero.tistory.com/21)

     역할:apply,also || run,let,with

     구조:apply,run ||   also,let || with
---
12. Object

    object.kt:object 및 companion object설명
    observerPattern.kt: 옵저버 패턴 및 익명객체 설명
---
13. Generic

    클래스 제네릭,함수 제네릭 사용방법
---
14. [Collection](https://velog.io/@hwi_chance/Kotlin-2%EC%9E%A5.-%EC%BD%94%ED%8B%80%EB%A6%B0-%EB%AC%B8%EB%B2%95-%EB%B0%B0%EC%97%B4-%EC%BB%AC%EB%A0%89%EC%85%98-%EB%B0%98%EB%B3%B5%EB%AC%B8)

    a)List.kt:콜렉션 리스트 관련 설명
    
    b)Set.kt:Set 설명
    
    c)Map.kt:Map 설명
    
    d)CollectionFunction1:컬렉션 함수 설명(withIndex 추가)
    
    e)CollectionFunction2:심화 과정 
    
---
15. String

    문자열 관련 함수 
---
16. NullCheck
    
    nullCheck.kt:보통 Scope 함수를 와 같이 사용하여 null Check를 함
    Equal.kt:객체와 내용의 동일성 판단
---
17. Argument&infixFunction
    
    argument.kt:다양한 argument와 overloading,vararg keyword 설명
    infix.kt: infix함수 설명

---
18. NestedClass

    중첩클래스와 inner 클래스 차이 
---
19. DataClass&EnumClass

    DataClass.kt:데이터 클래스 설명

    EnumClass.kt:열거형 클래스 설명
---
20. Advanced Value skill

    var,val,const val
    
    lateinit,lazy keyword 
---
21. BitOperation

    비트의 개념과 비트 연산자 설명
    
    Int.toString(2):2진수로 표현
---
22. [Coroutine](https://whyprogrammer.tistory.com/596)

    비동기 처리

23. Algorithm
    
    각 종 Collection 및 입출력을 알고리즘에 최적화 
    -   import java.util.*

    -   [각종 유용한 메소드 정리](https://aonee.tistory.com/28)
    -   [람다함수](https://0391kjy.tistory.com/38)

24. Extra Keyword(그 외)
-  a) until : a until b -> a 부터 b-1까지
    
    
        for(i in 0 until answers.size)

-  b) typealias:typedef 역할
        
        
        typealias P=Pair<Int,Int>

25.  람다함수 및 많이쓰이는 Method

-   1. withIndex():(Index,value)를 갖는 List 형태로 리턴
-   2. xx.groubBy{key} : key값을 key로하고 xx를 value로 갖는 LinkedHashMap 리턴
-   3.  .values -> HashMap에서 value들만 가져옴
-   4.  .sortedByDescending{조건} :해당 조건을 기준으로 내림차순 , .sortedBy{조건}:오름차순
-   
-   5.  sumBy{리스트 같은 컬렉션}:  모든원소를 더한 값
-   6.  .map:각 원소를 원하는 형태로 변환하는 기능을 하며, 변환한 결과를 모아서 *새 컬렉션을 만듭니다.* ,원본의 결과는 바꾸지 않음
-   7.  fold(초기값){tmp,v-> tmp와 v를 이용한 연산}:
          tmp의 초기값을 지정하고 해당 연산을 모두 진행한 후 최종 **tmp를 리턴**

-   8. zip() 함수는 두 컬랙션의 자료들을 조합하여 새로운 자료를 만들 때 사용합니다.
          두 컬렉션 간 자료의 갯수가 달라도 되고 **더 적은 갯수**에 컬랙션쪽으로 따라 갑니다. 
          Pair로 묶은 ArrayList반환
    
        ex) a.zip(b): a가 first,b가 second가 됨
-   9.  [drop()&take()](https://kotlinworld.com/12)
    ### Take
    -   x.take(n): 앞에서 n 선택
        -   ex)(0..10)..toList().take(3)
        -   [0,1,2,3,4,5,6,7,8,9,10]:앞에서 3개 [0,1,2]
    -   x.takeWhile{it조건식}
        -   앞에서 it조건식이 false가 될 때 까지 모든 요소를 담아 List로 리턴
    -   x.takeLast(n)
        -   뒤에서 n개 가져옴
    -   x.takeLastWhile{it조건식}
        -   뒤에서 it조건식이 false가 될 때 까지 요소를 담아 List로 반환
    ### Drop
    -   x.drop(n):앞에서 n개를 제외하고 나머지 요소를 List로 리턴
    -   x.dropWhile(it조건식)
        -   it조건식이 false가 될 때까지 앞에 요소를 버린 후 처음 true가 된 이후 나머지 요소를 List로 리턴
    -   x.dropLast(n)
        -   뒤에서 n개를 제외하고 나머지를 List로 리턴
    -   x.dropLastWhile(it조건식)
        -   뒤에서 부터 it조건식이 false가 될때 까지 뒤에 요소를 버린 후 처음 true가 된 이후 나머지요소를 List로 리턴
-   10. .distinct():중복제거한 값 리턴 (원본 변경안됨)
-   11. list.forEachIndexed:해당 리스트의 index와 함께 forEach 
             
             numbers.forEachIndexed { index, v ->
             }
-   12. str.removeRange(start,end):str에서 start부터 end-1까지 삭제한 것을 리턴 (원본 변경X)


            fun String.removeRange(
            startIndex: Int, 
            endIndex: Int
            ): String
-   13. list.count{it}: 해당 람다식을 만족시키는 요소 개수 리턴

            list.count{
                it>=1
            } //1일상인 요소
-   14. .flatMap{it}
    -   flatMap 함수는 람다를 모든 객체에 적용하고 얻어지는 여러 리스트를 하나의 리스트로 생성합니다.

                val strings = listOf("abc", "de", "de")
                strings.flatMap { it.toList() }.toSet()
                [a, b, c, d, e] //중복제거 O

-   26. [문자열함수](https://rain2002kr.tistory.com/92)
    -   a) str.split(delim): 
        -   delim 기준으로 List< String > 으로 리턴
    -   b)  strList.joinToString("x") 
        -   해당 strList 뒤에 x를 붙여 하나의 문자열로 만듬(마지막 원소에는 안붙힘)
                
                strList=["1","2","3"]
                strList.joinToString("-")
                strList="1-2-3"
    -   c) str.replace("a","b"): a를 b로 대체하기
    -   d) str.substring(0..1): start..end: stat인덱스부터 end인덱스(포함) 자르기
                   