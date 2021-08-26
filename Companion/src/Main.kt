fun main() {
    val obj1 = TestClass()
    println("obj1.a1 : ${obj1.a1}")
    obj1.testFun1()

    val obj2 = TestClass()
    println("obj2.a1 : ${obj2.a1}")
    obj2.testFun1()

    obj1.a1 = 200
    println("obj1.a1 : ${obj1.a1}")
    println("obj2.a1 : ${obj2.a1}")

    // 객체를 만들기 싫다면 companion object를 통해서 정적으로 선언한 다음 아래와 같이 접근하면 된다.
    println("TestClass.a2 : ${TestClass.a2}")
    TestClass.testFun2()

    val obj3 = JavaMain() // 자바에서 작성한 코드를 코틀린에서 동작시킬 수 있다.
    println("obj3.javaA1 : ${obj3.javaA1}")
    obj3.javaMethod1()

    println("JavaMain.javaA2 : ${JavaMain.javaA2}")
    JavaMain.javaMethod2()
    // 자바에서 static 으로 선언한 것은 코틀린과 마찬가지로 객체 없이 사용할 수 있다.
}

class TestClass {
    var a1 = 100

    companion object {
        // companion object는 정적 멤버이다.
        // 이들에 대해서는 참조 변수로 접근할 수 없다.
        // 즉, 객체 생성 없이 클래스의 이름을 통해 직접적으로 접근해 사용한다.
        var a2 = 1000

        @JvmStatic var a3 = 2000
        // 위와 같은 annotation을 사용하면 자바쪽에서 사용할 때 Companion을 붙여주지 않아도 사용할 수 있다.

        fun testFun2() {
            println("testFun2")
            //println("a1 : $a1")
            /*
            companion object 외부에 있는 것은 사용할 수 없다.
            왜나면 a1은 객체를 생성해야만 사용할 수 있는 변수이다. 하지만 companion object는 그렇지 않다.
            따라서, companion object에서 a1을 사용하는 시점에서 그 객체가 이미 생성되어 있는지에 대한 보장을 받을 수 없기 때문이다.
            */
            println("a2 : $a2")
        }

        @JvmStatic fun testFun3() {
            println("testFun3")
        }
    }

    fun testFun1() {
        println("testFun1")
        println("a1 : $a1")
        println("a2 : $a2")
        testFun2()
        // 다만, companion object는 객체를 생성하지 않아도 메모리에 자리 잡고 바로 생성되기 때문에 외부에서 호출이 가능하다.
    }
}