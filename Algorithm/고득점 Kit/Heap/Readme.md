#   PriorityQueue
-   선언1:PriorityQueue(**compareBy**{ it.second })

             val pq:PriorityQueue<Int> = PriorityQueue(compareBy{it}) //오름차순

              val pq:PriorityQueue<Int> = PriorityQueue(compareBy{-it}) //내림차순
        
             val pq2:PriorityQueue<Int> = PriorityQueue((Comparator.reverseOrder())) //내림차순


-   선언2:data class 사용 시 Comparable<T>를 상속 받아 compareTo 함수를 override를 해줘야함



-   ##  Method

   - 삽입: 
    - add(n) , offer(n)
    -  addAll(List):List의 모든 요소를 삽입한다
  - 삭제: 
    - poll():top 삭제하며 값 반환 (없을 시 예외발생), remove():top 삭제(예외 발생 x)  or remove(n): 원소 n 삭제 
  - 확인
    - isNotEmpty(),isEmpty()
    - size