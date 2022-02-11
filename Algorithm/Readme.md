# Sort

##  1.  [sortedBy() & sortedWith()](https://yuuj.tistory.com/89)
- a.  sorted:원본 리스트를 바꾸지 않고 소팅된 리스트를 리턴한다. 

selector을 지정하면 소팅 기준을 정할 수 있다. 

    var sorted = planedit.sortedBy{it.first}
 
 내림차순으로 정렬할땐 sortedByDescending()을 사용하면 된다. 

- b.sortedWith():역시 원본 리스트를 바꾸지 않고 소팅된 리스트를 리턴한다. 

**sortedBy()와 다른점은 comparator을 지정해서 다중 기준을 둘 수 있다는 점이다.**
    
    var sorted = planedit.sortedWith(compareBy({ it.first }, { it.second }))

##  2.  [ListSort](https://codechacha.com/ko/kotlin-sorting-list/)
- a. sort()와 sorted()차이:
  - sorted(): Immutable List에서 사용 즉 원본 변경안하고 정렬된 것을 리턴 받아 사용
  - sortedDescending(): Immutable List 내림차순 리턴
  - sort(): Mutable List 에서 사용 즉 원본 변경 함
  - sortDescending():Mutable List 내림차순

- b. reserve()와 reserved()차이:
  - reversed() : Immutable 리스트에서 사용합니다. 역순으로 변경된 리스트를 생성하고 리턴합니다.

        val sorted = list.sorted().reversed()

  - reverse() : Mutable 리스트에서 사용되며, 리스트 자신의 요소 순서를 반대로 변경합니다. 

      
        list2.sort().reverse()

- c.  sortedWith(), sortWith()
  
  - sortWith()는 정렬 규칙인 Comparator를 변경합니다. 즉, Comparator를 변경하여 자신이 원하는 방식으로 리스트를 정렬할 수 있습니다.

  - sortedWith() : Immutable list에서 사용

  - sortWith() : Mutable list에서 사용


        tmp.sortWith(Comparator<String>{ a,b ->
          
            when{
                //b가 앞 요소 a가 뒷 요소
                //앞+뒤(b+a)가 크면 true 
                //A.compareTo(B): A가 크면 +1, 같으면 0 A가 작으면 -1
                a.length==b.length -> b.compareTo(a)
                else -> (b+a).compareTo(a+b)
            }
            
        })

- d.  sortedBy(), sortBy()
  - 리스트의 요소가 1개의 데이터 타입으로 이루어지지 않고, 내부에 여러 객체를 갖고 있는 타입일 때, 어떤 객체를 비교하여 정렬할 지 결정할 때 사용합니다.

  - sortedBy({it}) : Immutable list에서 사용
  - sortedByDescending({it}):Immutable list에서 사용 (내림차순)
    
  - sortBy({it}) : Mutable list에서 사용
  - sortByDescending({it}):Mutable list에서 사용(내림차순)
 


#   [queue](https://choheeis.github.io/newblog//articles/2020-10/kotlinQueue)

##  0.  import
    import java.util.*
- LinkedList< T >() 를 사용한다
##  1.  추가
-   add(element: E)

Any type의 element를 **Queue에 추가한다**. Any는 코틀린의 모든 클래스의 최상단 super 클래스로, 결국 어떤 클래스든지 문제없이 사용이 가능하다는 것이다. Queue에 element를 더하는데 성공하면 true를 return하며, 실패시 IllegalStateException을 발생시킨다.

- offer(e: E)

add()와 동일한 기능을 수행하지만, add()와 다르게 용량 관계로 새 element를 queue에 추가할 수 없을 때 IllegalStateException을 던져주지 않는 것으로 보인다.


## 2.   확인

- element() 

element()는 **Queue의 head를 제거하지 않고 head에 어떤 값이 들어가 있는지 알려준다**. Queue의 현재상태를 건드리지 않고, head의 데이터만 확인하고 싶을 때 사용할 수 있을듯.


- peek()

element()와 동일한 기능을 수행하지만, **Queue가 비어있을 경우 null을 return**하는 차이점을 가진다.

## 3.   제거
 

- poll()

Queue에서 일반적으로 사용될 function으로, Queue의 head에 존재하는 element를 return하고, 동시에 element를 Queue에서 제거한다. Queue의 기본 원리와 같이 Queue에 존재하는 element들은 한칸식 당겨져 정렬된다. Queue가 비어있는 경우 null을 return한다.

 

- remove()

poll()과 동일한 기능을 수행하지만, Queue가 비어있는 경우 null을 return하지 않는 차이점이 있다. return 타입이 E로 되어있는 걸 보니 Queue가 비어있을 때 remove를 수행하면 null 데이터로 인해  Kotlin 에러가 발생할듯?

---
#   PriorityQueue

  - 함수는 위 queue와 같음

  - 중요한 점은 data class 사용 시 Comparable<T>를 상속 받아 compareTo 함수를 override를 해줘야함

               val pq:PriorityQueue<Int> = PriorityQueue(compareBy{it}) //오름차순

              val pq:PriorityQueue<Int> = PriorityQueue(compareBy{-it}) //내림차순
        
             val pq2:PriorityQueue<Int> = PriorityQueue((Comparator.reverseOrder())) //내림차순

 

  - 삽입: 
    - add(n) , offer(n)
    -  addAll(List):List의 모든 요소를 삽입한다
  - 삭제: 
    - poll():top 삭제하며 값 반환 (없을 시 예외발생), remove():top 삭제(예외 발생 x)  or remove(n): 원소 n 삭제 
  - 확인
    - isNotEmpty(),isEmpty()
    - size

# [Set](https://lcw126.tistory.com/341)
- HashSet이 속도가 빠른듯


# [Hash Map](https://kkh0977.tistory.com/648)
- 1. HashMap : 코틀린에서 key , value 형태로 데이터를 저장할 수 있습니다
-	2. put(key,value) : 해쉬맵에서 데이터를 추가할때 사용합니다
-	3. containsKey(key) : 해쉬맵에서 특정 key 값이 포함된지 확인합니다
-	4. get(key) : 해쉬맵에서 특정 key 값 데이터를 얻어옵니다(null check)
-	5. for : 반복문을 수행하면서 해쉬맵에 들어있는 데이터를 순차적으로 출력합니다
-	6. remove(key) : 해쉬맵에서 특정 key 값을 삭제합니다
-	7. replace(key,value) : 해쉬맵에서 특정 key 값 데이터를 변경합니다(만약 map에 있는 데이터를 이용시 특히 Int .plus(1) or .plus(-1) 로 해줌 )
-	8. clear : 해쉬맵을 전체 초기화합니다
- 9.  반복문 : 
    - hash.forEach

          hash.forEach{key,value ->
          
          }

    - for문     
            
             for ((key,value) in hash){}

---
# [Stack](https://notepad96.tistory.com/entry/Kotlin-12)

- 1.  LIFO
- 2.  val st=Stack< Type >()
- 3.  Method
  - a) st.push(n):위로 삽입
  - b) st.peek():Top()값을 가르킴
  - c) st.pop():Top() 원소를 반환하며 삭제
  - d) st.size:Size 리턴
  - e) st[n]:해당 원소 리턴(밑에서 부터 0) ,st[st.size-1]:Top원소
  - f) st.add(index,n): 사용 권한x,스택의 기능이 깨지긴 함 , 해당 index에 삽입 ,index 생략시 0번째(밑에 넣음)
  - g) st.search(n): n을 위에서부터 몇번째 있는지 ,만약 n이 없을 시 -1리턴
  - h) st.isNotEmpty(), st.isEmpty()