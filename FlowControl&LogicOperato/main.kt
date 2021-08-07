fun main(args: Array<String>) {
    
 /*
    contiune 및 break는 다른 언어들과 같은
    레이블링을 중점적을 설명
    
    label명@ for {
        for{

        }
        (흐름제어문,continue or break) @label명
    }
 
    ,즉 위치 명시 할 때는  레이블명@ for
    ,제어 할 때는 @label명, ex) contiune@label , break@label
    */   
    
    loop1@ for (i in 1..9){
        for(j in 1..9){
            if(i==1&&j==2) break@loop1 // 흐름제어문 바로 뒤에 써줌 ,loop1이 지정된 for문을 종료
            println("i:$i j:$j") // i:1 j:1 만 찍힘
        }
    }

    /*
    논리연산자:&&,||,==,!=
    */
}