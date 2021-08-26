fun main() {

    val obj1 = Outer1()
    val obj2 = obj1.Inner1()
    // Inner 클래스는 바로 객체를 생성할 수 없고, 외부 클래스 객체를 먼저 생성한 후에 접근 및 생성이 가능하다.

    obj2.innerMethod2()
    obj1.outerMethod2()

    println("----------------------")

    val t1 = TestClass2() // 추상 클래스
    t1.testMethod1()

    val t2 = TestClass3() // 인터페이스
    t2.interMethod1()

    val t3 = object : TestClass1() { // 익명 중첩 클래스
        // TestClass1 이라는 추상 클래스를 상속받은 이름이 없는 클래스를 만들고 메소드를 오버라이딩 하면서
        // 바로 객체를 생성을 해서 t3에 넣은 것이다.
        // 이는 이름이 없으므로 딱 한번만 사용된다.
        override fun testMethod1() {
            println("익명 중첩 클래스의 testMethod1")
        }
    }

    t3.testMethod1()

    val t4 = object : TestInter1 {
        override fun interMethod1() {
            println("익명 중첩 클래스의 interMethod1")
        }
    }

    t4.interMethod1()
}

class Outer1 {

    val outerMember1 = 100

    fun outerMethod1() {
        println("Outer Method")
    }

    /*
    fun outerMethod2() {
        println("InnerMember1 : $innerMember1")
        innerMethod1()
    }
    이를 사용할 수 없는 것은, Outer 클래스의 객체가 생성되었는지 불확실하기 때문이다.
    Inner Class는 Outer Class의 객체가 생성되어 있을 때 객체를 생성할 수 있기 때문이다.
     */

    fun outerMethod2() {
        // 이 방식은 Inner 객체가 있으므로 가능하다.
        val obj3 = Inner1()
        println("obj3.innerMember1 : ${obj3.innerMember1}")
        obj3.innerMethod1()
    }

    inner class Inner1 { // 클래스 내부의 클래스 이므로 이를 중첩 클래스라 한다.

        val innerMember1 = 1

        fun innerMethod1() {
            println("Inner Method")
        }

        fun innerMethod2() {
            println("outerMember1 : $outerMember1")
            outerMethod1()
        }
    }
}

abstract class TestClass1 {
    abstract fun testMethod1()
}

interface TestInter1 {
    fun interMethod1()
}

class TestClass2 : TestClass1(){
    override fun testMethod1() {
        println("TestClass2의 testMethod1")
    }
}

class TestClass3 : TestInter1 {
    override fun interMethod1() {
        println("TestClass3의 interMethod1")
    }
}