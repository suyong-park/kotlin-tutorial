fun main() {

    val obj1 = TestClass1()
    val obj2 = TestClass2()
    testFun1(obj1)
    testFun2(obj2)

    // val obj3 = Inter1()
    // 인터페이스는 클래스가 아니기 때문에 객체를 생성할 수 없다.

    println("---------------------")

    val obj3 = TestClass3()
    val obj4 = TestClass4()

    testFun3(obj3)
    testFun4(obj4)

    println("---------------------")

    val obj5 = TestClass5()
    testFun3(obj5)
    testFun4(obj5)
}

open abstract class AbstractClass1 {
    open abstract fun abstractMethod1()
}

open abstract class AbstractClass2 {
    open abstract fun abstractMethod2()
}

fun testFun1(obj1:AbstractClass1) {
    obj1.abstractMethod1()
}

fun testFun2(obj2:AbstractClass2) {
    obj2.abstractMethod2()
}

class TestClass1 : AbstractClass1() {
    override fun abstractMethod1() {
        println("TestClass1의 abstractMethod1")
    }
}

class TestClass2 : AbstractClass2() {
    override fun abstractMethod2() {
        println("TestClass2의 abstractMethod2")
    }
}

// 추상 클래스를 생성하는 만큼에 비례해서 클래스를 생성하는 것은 낭비이다.
// 따라서, 다중 상속을 해야 하는데 코틀린은 다중 상속을 지원하지 않는다.
// 따라서, 여러 개의 추상 클래스를 사용하기 위해 인터페이스를 사용하는 것이다.
// 인터페이스는 클래스가 아니므로 객체를 생성할 수 없다.

interface Inter1 {
    fun inter1Method1() {
        println("Inter1의 inter1Method1")
    }

    fun inter1Method2()
}

interface Inter2 {
    fun inter2Method1() {
        println("Inter2의 inter1Method1")
    }

    fun inter2Method2()
}

fun testFun3(obj1:Inter1) {
    obj1.inter1Method1()
    obj1.inter1Method2()
}

fun testFun4(obj1:Inter2) {
    obj1.inter2Method1()
    obj1.inter2Method2()
}

class TestClass3 : Inter1 {
    override fun inter1Method2() {
        println("TestClass3의 interMethod2 입니다.")
    }
}

class TestClass4 : Inter2 {
    override fun inter2Method2() {
        println("TestClass4의 interMethod2 입니다.")
    }
}

class TestClass5 : Inter1, Inter2 {
    // 하나의 클래스에서 두 개의 인터페이스를 상속 받아 사용하는 모습이다.

    override fun inter1Method2() {
        println("TestClass5의 inter1Method2")
    }
    override fun inter2Method2() {
        println("TestClass5의 inter2Method2")
    }
}