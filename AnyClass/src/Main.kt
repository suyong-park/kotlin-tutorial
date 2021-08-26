fun main() {

    val obj1 = TestClass1()
    println("obj1 : $obj1")

    val obj2 = TestClass2()
    val obj3 = TestClass3()

    testFun1(obj2)
    testFun1(obj3)
}

// 코틀린은 상속받는 클래스가 없다면 any 클래스를 상속받는다.
// any 클래스에는 객체에 필수적으로 사용해야 할 메소드들이 정의되어 있다.

class TestClass1 {

    override fun toString(): String {
        return "TestClass1의 객체입니다."
    }
}

class TestClass2 {

    override fun toString(): String {
        return "TestClass2의 객체입니다."
    }
}

class TestClass3 {

    override fun toString(): String {
        return "TestClass3의 객체입니다."
    }
}

fun testFun1(a1:Any) {
    println("a1 : $a1")
}