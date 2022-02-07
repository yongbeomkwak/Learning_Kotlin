
import java.lang.Integer.min

class Solution {
    fun solution(genres: Array<String>, plays: IntArray) =
        plays.withIndex().groupBy { genres[it.index] }.values
            .sortedByDescending { v -> v.sumBy { it.value } }
            .map { v -> v.sortedByDescending { it.value }.map { it.index } }
            .fold(intArrayOf()) { acc, v -> acc + v.subList(0, min(2, v.size)) }
            
          /**
          withIndex():(Index,value)를 갖는 List 형태로 리턴
          groubBy{genres[it.index]} : 
          genres[it.index]를 key로  이전 plays.withIndex를 value로 갖는 LinkedHashMap 리턴
          .values -> HashMap에서 value들만 가져옴
          .sortedByDescending{v -> v.sumBy{it.value}}:
          v:는 (Index,value)를 담은 List
          v.sumBy{it.value} -> 해당 List의 value를 모두 더한 후
          .sortedByDecending:내림차순(큰거 먼저) ,  장르별 노래 재생 횟수 큰것 
          
          .map:각 원소를 원하는 형태로 변환하는 기능을 하며, 변환한 결과를 모아서 새 컬렉션을 만듭니다. ,원본의 결과는 바꾸지 않음
          .map{v->v.sortedByDescending{it.value}.map{it.index}}
           v.sortedByDescending{it.value}:value:재생횟수 내림차순
          .map{it.index}:재생횟수로 내림차순하며 인덱스 값만 담아둔다
          
          fold(초기값){tmp,v-> tmp와 v를 이용한 연산}:
          tmp의 초기값을 지정하고 해당 연산을 모두 진행한 후 최종 tmp를 리턴
          
          subList(fromIndex,toIndex): 시작인덱스 부터  toIndex 전까지 자른 리스트를 반환
          단 참조 값이므로 원본 리스트가 바뀌면 역시 바뀜
          
          .fold(intArrayOf()) { acc, v -> acc + v.subList(0, min(2, v.size))
          acc의 초기값을 빈 intArrayOf이고
          이제 각 장르 별로 두 곡 씩 앨범에 수록해봅시다. 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
          
          
          plays.withIndex().groupBy { genres[it.index] }.values
            .sortedByDescending { v -> v.sumBy { it.value } }
            .map { v -> v.sortedByDescending { it.value }.map { it.index } }
            .fold(intArrayOf()) { acc, v -> acc + v.subList(0, min(2, v.size)) }
          
          
          
          */  
            
            
            
}