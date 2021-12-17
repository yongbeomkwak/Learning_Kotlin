#   [queue](https://choheeis.github.io/newblog//articles/2020-10/kotlinQueue)

##  0.  import
    import java.util.*

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



