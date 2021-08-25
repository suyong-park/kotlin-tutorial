fun main() {

    val obj1 = SubClass1()
    println("obj1.subA1 : ${obj1.subA1}")
    obj1.subMethod1()

    println("obj1.superA1 : ${obj1.superA1}")
    obj1.superMethod1()

    println("--------------------------")

    val obj2:SuperClass1 = obj1
    // obj1과 obj2는 타입이 서로 다르다.
    // 이것이 가능한 이유는 두 클래스가 상속 관계에 있기 때문이다. 그리고 obj2가 부모 클래스이기 때문에 가능한 것이다.

    println("obj2.superA1 : ${obj2.superA1}")
    obj2.superMethod1()

    //println("obj2.subA1 : ${obj2.subA1}")
    //obj2.subMethod1()
    // 위 코드가 에러나는 이유 : obj1은 SubClass 이다. obj2는 SuperClass 타입이고 여기에 SubClass를 담은 것이다.
    // 그렇지만, 타입이 SuperClass 이기 때문에 부모 클래스 밖에는 접근할 수 없다.

    //결론적으로, 부모 클래스를 상속받은 자식 클래스를 객체로 선언하는 경우 자식 클래스 뿐만 아니라 부모 클래스에 접근이 가능하다.

    println("--------------------------")

    val obj3:SubClass2 = SubClass2()
    obj3.superMethod2()

    val obj4:SuperClass2 = obj3
    obj4.superMethod2()
    // 이 결과로 SuperClass의 superMethod가 호출되는 것이 아니라 SubClass의 superMethod가 호출된다.
    // 즉, 개발자가 오버라이드한 함수를 우선적으로 호출하기 위한 것이다.

    println("--------------------------")

    val obj5:SuperClass3 = SuperClass3()
    overridingTest(obj5)

    println("--------------------------")

    val obj6:SubClass3 = SubClass3()
    overridingTest(obj6)
    // 개발자가 재정의한(오버라이딩) 함수를 우선적으로 호출하게 된다.
}

open class SuperClass1 {

    var superA1 = 100

    fun superMethod1() {
        println("SuperClass1의 superMethod1 입니다.")
    }
}

class SubClass1 : SuperClass1() {

    var subA1 = 200

    fun subMethod1() {
        println("SubClass1의 subMethod1 입니다.")
    }
}

open class SuperClass2 {

    open fun superMethod2() { // 메소드 앞에 open 키워드를 붙이면 자식 클래스에서 오버라이딩이 가능하다
        println("SuperClass2의 superMethod2")
    }
}

class SubClass2 : SuperClass2() {
    override fun superMethod2() {
        println("SubClass2의 superMethod2")
    }
}

open class SuperClass3 {

    open fun superMethod3(){
        println("SuperClass3의 superMethod3")
    }
}

class SubClass3:SuperClass3() {

    override fun superMethod3() {
        super.superMethod3() // super 키워드를 사용하면 부모 클래스의 상속되는 함수를 호출할 수 있다.
        println("SubClass3의 superMethod3")
    }
}

fun overridingTest(obj1:SuperClass3) {
    obj1.superMethod3()
}