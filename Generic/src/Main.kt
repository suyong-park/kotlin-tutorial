fun main() {

    val t1 = TestClass1<Int>() // 여기서 만든 객체는 Integer 이다.
    t1.testMethod1(100)

    val t2 = TestClass1<String>() // 여기서 만든 객체는 String
    t2.testMethod1("문자열")

    println("-------------------")

    val t3 = TestClass2<Int>(100)
    t3.testMethod2(200)

    val t4 = TestClass2<String>("문자열1")
    t4.testMethod2("문자열2")

    println("-------------------")

    var t5 = TestClass3<Int, String>()
    t5.testMethod3(100, "문자열")

    println("-------------------")

    var t6 = TestClass4<Int, Double, String, Boolean>(100, 11.11)
    t6.testMethod4("문자열", true)

    println("-------------------")

    val t7:TestClass5<SubClass1> = TestClass5<SubClass1> ()
    val t8:TestClass5<SubClass2> = TestClass5<SubClass1> ()
    val t9:TestClass5<SuperClass1> = TestClass5<SubClass1> ()
    // t8, t9 에서는 에러가 발생한다. 즉, 아무리 상속 관계에 있다고 하더라도 서로 다른 Generic Type에는 담을 수 없다.
    // 이를 불변성이라 한다.

    val t10:TestClass6<SubClass1> = TestClass6<SubClass1>()
    val t11:TestClass6<SubClass2> = TestClass6<SubClass1>()
    val t12:TestClass6<SuperClass1> = TestClass6<SubClass1>()
    // t11에서는 에러가 발생한다. Generic Type의 부모클래스는 Generic Type으로 가능하다.
    // 이를 공변성이라 한다.

    var t13:TestClass7<SubClass1> = TestClass7<SubClass1>()
    var t14:TestClass7<SubClass2> = TestClass7<SubClass1>()
    var t15:TestClass7<SuperClass1> = TestClass7<SubClass1>()
    // 특별한 경우를 제외하고 잘 사용하지 않는다.
    // t15는 에러가 발생한다. 자식 클래스에는 담을 수 있다.
    // 이를 반 공변성이라 한다.
}

// 같은 내용인데 데이터 타입만 달라지는 경우가 있다.
// 이런 경우에, 클래스 혹은 함수를 여러 개 선언하는 것이 아니라 Generic Type을 사용하면 된다.
// Generic Type은 클래스를 작성할 때 자료형을 결정하지 않고, 객체를 생성할 때 자료형을 결정하게 된다.
class TestClass1 <T> {

    fun testMethod1(a1:T) {
        println("a1 : $a1")
    }
}

class TestClass2 <T> (var a1 : T) {
    fun testMethod2(a2 : T) {
        println("a1 : $a1")
        println("a2 : $a2")
    }
}

class TestClass3 <A, B> { // Generic Type은 여러 개를 설정할 수 있다.
    fun testMethod3(a1:A, a2:B) {
        println("a1 : $a1")
        println("a2 : $a2")
    }
}

class TestClass4 <A, B, C, D> (var a1:A, var a2: B) {
    fun testMethod4(a3:C, a4:D) {
        println("a1 : $a1")
        println("a2 : $a2")
        println("a3 : $a3")
        println("a4 : $a4")
    }
}

open class SuperClass1
open class SubClass1 : SuperClass1()
class SubClass2 : SubClass1()

// 불변성
class TestClass5<A>()

// 공변성
class TestClass6<out A>()
// out을 키워드로 설정하면 같은 generic type 변수에 담을 수 있는 것 뿐만 아니라,
// 부모 클래스형 generic type에 담는 것도 가능하다.
// 많이 사용한다.

// 반공명성
class TestClass7<in A>()
// 자식 클래스를 담을 수 있다.
// 왜냐하면 부모 클래스에서 자식 클래스가 정의되어 있지 않으므로 사용할 수 없는데, 이를 사용하게 되면 에러가 발생하므로 잘 사용하지 않는 것이다.
// 많이 사용하지는 않는다.