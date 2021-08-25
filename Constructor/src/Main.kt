fun main() {
    val obj1 = TestClass1()
    println("obj1 : $obj1")

    println("-----------------")

    val obj2 = TestClass2()
    println("obj2 : $obj2")
    println("obj2.v1 : ${obj2.v1}")
    println("obj2.v2 : ${obj2.v2}")

    println("-----------------")

    val obj3 = TestClass2(100, 200)
    println("obj2 : $obj3")
    println("obj3.v1 : ${obj3.v1}")
    println("obj3.v2 : ${obj3.v2}")

    println("-----------------")

    val obj4 = TestClass3(100, 200)
    val obj5 = TestClass4(1000, 2000)

    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")

    println("obj5.a1 : ${obj5.a1}")
    println("obj5.a2 : ${obj5.a2}")

    println("-----------------")

    val obj6 = TestClass5(100, 200)
    println("obj6.a1 : ${obj6.a1}")
    println("obj6.a2 : ${obj6.a2}")

    println("-----------------")

    var obj7 = TestClass5(100)
}

class TestClass1 {
    init { // 객체가 생성되면 무조건 동작을 하는 코드 블록이다.
        println("객체가 생성되면 자동으로 동작합니다.")
    }
}

class TestClass2 {

    var v1:Int = 0
    var v2:Int = 0

    constructor() { // 생성자이다.
        println("매개 변수가 없는 생성자")
    }

    constructor(a1:Int, a2:Int) {
        println("매개 변수가 두 개인 생성자")
        v1 = a1
        v2 = a2
    }
    // constructor 키워드를 통해 따로 생성하는 것을 부(혹은 보조) 생성자라 한다.
}

class TestClass3 constructor (var a1:Int, val a2:Int)
// 이를 기본 생성자라 하며, var 같은 데이터 타입을 붙여 주면 멤버 변수까지 생성되는 것이다.
// constructor 키워드는 생략 가능하다

class TestClass4 (var a1:Int, val a2:Int)
// TestClass3, 4와 같이 바로 만드는 것을 주 생성자라 한다.

class TestClass5(var a1:Int, val a2:Int) {
    init {
        println("init 코드 수행")
        println("a1 : $a1")
        println("a2 : $a2")
    }
    // 주생성자가 먼저 실행될까 Init 코드 블록이 먼저 실행될까?
    // 결과적으로는 객체를 생성하면 주생성자가 먼저 수행되고 init 블록이 나중에 수행된다.

    constructor(a1:Int) : this(a1, 100) {
        // 클래스에 이미 주생성자가 있으면 부생성자는 반드시 주생성자로 호출해야 한다.
        println("보조 생성자 호출")

        // 객체 생성시 출력 순서
        // 객체를 생성할 때 매개 변수를 1개만 넘겼으므로 부생성자가 먼저 실행된다.
        // 부생성자에서 this 키워드를 통해 주생성자를 호출했으므로 주생성자가 실행된다.
        // 즉, 부생성자 -> 주생성자 호출 실행 -> Init 코드 블록 실행 -> 부생성자 코드 실행
    }
}
