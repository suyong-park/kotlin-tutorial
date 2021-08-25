fun main() {

    val obj1:TestClass1 = TestClass1()
    println("obj1 : $obj1")

    val obj2:TestClass1 = TestClass1()
    println("obj2 : $obj2")

    val obj3 = obj1
    println("obj3 : $obj3")

    val obj4:TestClass2 = TestClass2()
    println("obj4 : $obj4")

    val obj5:TestClass3 = TestClass3()
    println("obj5.a1 : ${obj5.a1}")
    println("obj5.a2 : ${obj5.a2}")

    //obj5.a1 = 100 // a1 멤버 변수는 val로 선언했기 때문에 Read Only 이다.
    obj5.a2 = 100
    println("obj5.a2 : ${obj5.a2}")

    obj5.testMethod1()
    obj5.testMethod2()
}

class TestClass1 {

}

class TestClass2 // 클래스 안에 아무것도 코드가 없다면 중괄호 생략이 가능하다.

class TestClass3 {
    // 멤버 변수
    val a1 = 0
    var a2 = 0

    // 멤버 메소드
    fun testMethod1() {
        println("testMethod1")
    }

    fun testMethod2() {
        println("testMethod2")
    }
}