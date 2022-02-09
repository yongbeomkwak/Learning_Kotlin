#   PriorityQueue
-   선언1:PriorityQueue(**compareBy**{ it.second })
-   선언2:data class 사용 시 Comparable<T>를 상속 받아 compareTo 함수를 override를 해줘야함
    -   addAll(List):모든 유소를 힙에 삽입