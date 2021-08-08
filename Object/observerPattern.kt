fun main(args: Array<String>) {
    EventPrinter().start()
    EventPrinter2().start()
}
/*
 옵저버 패턴: 이벤트가 발생하는지 감시하고 해당 이벤트가 왔을 때 처리(callback)
        구조: 2개의 class 와 한개의 interface로 구성
            classA(이벤트 수신), classB(이벤트의 발생 및 전달) , 두 클래스를 이어주는것(interface)
*/

interface EventListener{
    fun onEvent(count:Int)
}

class Counter(var listener:EventListener){  //이벤트 발생 클래스
    fun count(){
        for(i in 1..100)
        {
            if(i%5==0) listener.onEvent(i)
        }
    }
}

//익명객체 없이 정석으로 생성
class EventPrinter:EventListener{ //이벤트 수신 클래스,반드시 interface 상속 
    override fun onEvent(count:Int)
    {
        print("${count}-")
    }

    fun start(){
        val counter=Counter(this)//this는 EventPrinter지만 ,Counter는 EventListener를 요구하므로, 
                                //EventPrinter에서 EventListener 구현부만 넘어가게 됨
        counter.count()
    }
}

//익명객체를 사용,인터페이스 상속울하지않고, 해당 필요한 곳에 직접 넣어줌
class EventPrinter2{
    fun start(){
                            //익명객체 부분
        val counter=Counter(object:EventListener{ 
            override fun onEvent(count:Int){
                print("${count}-")                
            }
        })
        counter.count()
    }
}
