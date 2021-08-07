fun main(args: Array<String>) {
    /*
    1.while: 조건 으로 반복
    2. do while: 일단 한번은 실행 , 그다음 while에 있는 조건 확인 후 실행
    */
    var a=0
    while(a<5){
        print(a++)
        /*0,1,2,3,4 */
    }
    println()
    var b=0
    while(b<5){
        print(++b)
        /*1,2,3,4,5 */
    }
    println()
    var c=0
    do{
        println("c:$c")
    } while(c!=0)
    /*
    일단 한번은 찍힘
     */

     /*
        3. for(i in x..y) -> x부터 y까지 1씩 증가
        -step: 몇 씩 증강 할 지
        -downTo: 감소 ,  i in x downTo y -> x부터 y까지 1씩 감소
        -char 타입도 가능
     */
     for(i in 0..9)
     {
         println(i) /* 0부터 9까지 */
     }
     println("##############")
     for(i in 0..9 step 3)
     {
         println(i)  /*0 3 6 9 */
     }
     println("##############")
     for(i in 5 downTo 0)
     {
         println(i) //5,4,3,2,1,0
     }
     println("##############")

     for(i in 5 downTo 0 step 2)
     {
         println(i) //5,3,1
     }
     println("##############")
     for(i in 'a'..'e')
     {
         println(i)//a,b,c,d,e
     }



}