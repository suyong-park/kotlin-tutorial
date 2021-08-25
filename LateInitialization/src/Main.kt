fun main() {
    val obj1 = TestClass1()
    println("obj1.a1 : ${obj1.a1}")
    println("obj1.a2 : ${obj1.a2}")

    //println("obj1.a3 : ${obj1.a3}")
    obj1.testMethod1()

    println("obj1.a4 : ${obj1.a4}")
}

class TestClass1 {
    //var a1:Int // 값이 초기화되어 있지 않으므로 에러가 발생한다.
    var a1:Int = 100
    var a2:Int
    lateinit var a3:String
    // 값의 초기화를 나중에 진행하겠다! 라는 것임
    // 단, 선언할 때에 초기화가 되어 있지 않더라도 반드시 변수를 사용하기 전에는 초기화가 되어 있어야 한다.

    val a4 : String by lazy {
        // val로 변수를 정의하면 setter가 없다. 따라서, 지연초기화를 위해선 lazy를 사용해야 한다.
        // 다만, lazy는 코드 블록 내에 반드시 초기화 구문이 있어야 한다.
        // 현재 a4 변수에는 아무 값도 없다. 이 변수를 사용하려는 시점에서 변수값 초기화가 진행된다. ==> 메모리를 절약할 수 있다.
        println("a4 init")
        "문자열2"
    }

    init {
        // 다만, 값을 초기화시키지 않고 나중에 할당받고 싶은 경우는 이처럼 사용할 수 있다.
        a2 = 200
    }

    fun testMethod1() {
        if(::a3.isInitialized == false)
        // ::은 Reflection 이라는 것이다. 어떠한 객체를 사용할 때 객체를 생성한 클래스의 정보를 파악하기 위한 것이다
        // a3가 초기화된 적이 있는지를 확인한다.
            a3 = "문자열"
        println("a3 : $a3")
    }
}