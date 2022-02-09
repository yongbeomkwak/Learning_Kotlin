
class Solution {
    fun solution(numbers: IntArray): String {
        var answer = ""
        var tmp=arrayOf<String>()
        
        numbers.forEach{
            tmp+=it.toString() //String르로 추가 
        }
        
     
        
        tmp.sortWith(Comparator<String>{ a,b ->
          
            when{
                //b가 앞 요소 a가 뒷 요소
                //앞+뒤(b+a)가 크면 true 
                //A.compareTo(B): A가 크면 +1, 같으면 0 A가 작으면 -1
                a.length==b.length -> b.compareTo(a)
                else -> (b+a).compareTo(a+b)
            }
            
        })
        
        if(tmp[0]=="0")
        {
            return "0"
        }
        
        tmp.forEach{
            answer+=it
        }
        
        
        
        return answer
    }
}