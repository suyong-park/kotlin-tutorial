import kr.co.testpackage.module.pkg2.PublicClass3
import kr.co.testpackage.module.pkg2.TestClass3
import kr.co.testpackage.pkg1.*

// 코틀린에서는 기본적으로 선언하는 모든 변수가 private로 선언된다. 이는 자바 코드로 디컴파일 했을 때 확인할 수 있다.
// obj.a1 등을 통해서 직접 접근하는 것 같아도 자바 코드에서는 getter를 통해 접근하게 된다.

/* 변수와 메소드
private     : 외부에서 접근 불가
public      : 외부에서 접근 자유로움
protected   : 상속 관계일 경우에만 접근 가능
internal    : 모듈이 같을 경우에만 접근 가능
*/
/* 클래스
private     : 외부에서 객체 생성 불가
public      : 외부에서 객체 생성 가능(default)
protected   : 클래스에 지정할 수 없음
internal    : 모듈이 같을 경우에만 객체 생성 가능
*/
fun main() {

    // private class는 외부에서 사용이 불가능. 상속도 불가능
    val obj1 = PrivateClass1()
    val obj2 = PublicClass1()
    val obj3 = InternalClass1()

    // private class는 외부에서 사용이 불가능.
    val obj4 = PrivateClass2()
    val obj5 = PublicClass2()
    val obj6 = InternalClass2()

    val obj7 = PrivateClass3()
    val obj8 = PublicClass3()
    // Internal Class는 다른 모듈에서는 사용할 수 없다.
    val obj9 = InternalClass3()

    val t1 = TestClass1()
    // private 멤버는 외부에서 접근 불가능
    println("t1.private1 : ${t1.private1}")
    println("t1.public1 : ${t1.public1}")
    // protected 멤버는 상속 관계에서만 사용 가능
    println("t1.protected1 : ${t1.protected1}")
    println("t1.internal1 : ${t1.internal1}")

    val t2 = TestClass2()
    // private 멤버는 외부에서 접근 불가능
    println("t2.private2 : ${t2.private2}")
    println("t2.public2 : ${t2.public2}")
    // protected 멤버는 상속 받은게 아니면 사용 불가능
    println("t2.protected2 : ${t2.protected2}")
    println("t2.internal2 : ${t2.internal2}")

    val t3 = TestClass3()
    // private 멤버는 외부에서 접근 불가능
    println("t3.private3 : ${t3.private3}")
    println("t3.public3 : ${t3.public3}")
    // protected 멤버는 상속 받은게 아니므로 사용 불가능
    println("t3.protected3 : ${t3.protected3}")
    // internal 멤버는 같은 모듈이 아니므로 사용 불가능
    println("t3.internal3 : ${t3.internal3}")
}

class SubClass1 : TestClass1() {

    fun subMethod1() {
        // private 멤버는 외부에서 사용 불가
        println("private1 : $private1")
        println("public1 : $public1")
        println("protected1 : $protected1")
        println("internal1 : $internal1")
    }
}

class SubClass2 : TestClass2() {

    fun subMethod2() {
        println("private2 : $private2")
        println("public2 : $public2")
        println("protected2 : $protected2")
        println("internal2 : $internal2")
    }
}

class SubClass3 : TestClass3() {

    fun subMethod3() {
        // private 멤버는 외부에서 접근 불가
        println("private3 : $private3")
        println("public3 : $public3")
        // 상속 관계이므로 protected 멤버는 사용 가능
        println("protected3 : $protected3")
        // internal 멤버는 모듈이 다르므로 사용 불가
        println("internal3 : $internal3")
    }
}