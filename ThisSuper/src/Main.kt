fun main() {
    var obj1 = TestClass1()
    obj1.testMethod1()

    var obj2 = SubClass()
    obj2.subMethod1()
}

class TestClass1 (var a2:Int){ // 주 생성자 생성

    var a1 = 100

    constructor() : this(100) {
        // 보조생성자를 만들 경우 주 생성자를 반드시 호출해야 한다.

    }

    fun testMethod1() {
        // 본인의 것이 우선이기 때문에 클래스 전역 변수인 a1보다 메소드 내부의 a1 변수가 우선적으로 사용된다.

        var a1 = 200

        println("a1 : $a1")
        println("this.a1 : ${this.a1}") // 메소드에 정의되는 것이 아니라 객체에 정의된 것을 가져온다.

        fun testMethod2() {
            println("testMethod1 내부의 testMethod2")
        }

        testMethod2() // 항상 내부에 있는 것이 우선이므로, 위 함수가 호출된다.
        this.testMethod2() // 클래스에 정의된 메소드가 호출된다.ㅜ
    }

    fun testMethod2() {
        println("testMethod2")
    }
}

open class SuperClass(var a2:Int) {

    open var a1 = 100

    open fun superMethod1() {
        println("SuperClass의 SuperMethod1")
    }
}

class SubClass : SuperClass(100) {

    override var a1 = 1000
    // 자식 쪽에서 부모 쪽의 변수를 재정의하여 사용하고 싶은 경우 부모 클래스의 변수를 open, 자식 변수는 override 하여 사용할 수 있다.

    fun subMethod1() {
        println("a1 : $a1")
        println("super.a1 : ${super.a1}")

        superMethod1() // 무조건 자기 자신이 우선이므로 오버라이드된 함수가 호출된다.
        super.superMethod1()
    }

    override fun superMethod1() {
        super.superMethod1()
        println("SubClass의 SuperMethod1")
    }
}

class SubClass2 : SuperClass { // 여기서 생성자를 만들지 않는 경우
    constructor(a1:Int) : super(a1) {

    }

    constructor(a1:Int, a2:Int) : super(a1) {

    }
}