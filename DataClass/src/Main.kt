fun main() {

    val obj1 = TestClass1(100, 200)
    val obj2 = TestClass2(100, 200)

    println("obj1.a1 : ${obj1.a1}")
    println("obj1.a2 : ${obj1.a2}")

    println("obj2.a1 : ${obj2.a1}")
    println("obj2.a2 : ${obj2.a2}")

    val obj3 = TestClass1(100, 200, 300)
    val obj4 = TestClass2(100, 200, 300)
    println("obj3.a1 : ${obj3.a1}")
    println("obj3.a2 : ${obj3.a2}")
    println("obj3.a3 : ${obj3.a3}")

    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")
    println("obj4.a3 : ${obj4.a3}")

    obj3.testMethod1()
    obj4.testMethod2()

    println("------------------")

    val obj5 = TestClass1(100, 200, 300)
    val obj6 = TestClass1(100, 200, 300)
    if(obj5 == obj6)
        println("obj5와 obj6은 같은 객체입니다.")
    else
        println("obj5와 obj6은 다른 객체입니다.")
    // TestClass1은 일반 클래스이다. 따라서, Any 클래스를 상속받는데 여기도 equals() 메소드가 있다.
    // 다만, 해당 equals 메소드는 주소값을 비교하는 메소드이다.

    val obj7 = TestClass2(100, 200, 300)
    val obj8 = TestClass2(100, 200, 300)
    if(obj7 == obj8)
        println("obj7와 obj8은 같은 객체입니다.")
    else
        println("obj7와 obj8은 다른 객체입니다.")
    // TestClass2는 data class로, equals, toString, hashCode을 포함한 여러 메소드를 자동으로 상속받는다.
    // 여기에 있는 equals 메소드는 변수값을 비교하기만 한다.
    // 이를 자바로 디컴파일하여 확인해 보면 a1, a2 밖에 없다. 따라서, data class에서 사용하는 모든 변수는 주생성자로 만들어 주는 것이 유리하다.

    println("------------------")

    //val obj9 = obj5.copy() // 이는 copy 메소드를 알 수 없기 때문에 에러 발생
    val obj10 = obj7.copy()
    // TestClass2는 data class로, copy가 정의되어 있음
    // copy 메소드는 객체를 복제하는 메소드이다.
    println("obj10.a1 : ${obj10.a1}")
    println("obj10.a2 : ${obj10.a2}")
    println("obj10.a3 : ${obj10.a3}")
    // 이 때, a3 값은 0이 나온다. 왜냐하면 data class의 주 생성자가 a1, a2이기 때문이다. 그렇기 때문에 a3는 복제되지 않는다.
    // 따라서, data class는 모든 멤버를 주 생성자로 만들어야 유리하다.

    obj10.a1 = 1000
    println("obj7.a1 : ${obj7.a1}")
    println("obj10.a1 : ${obj10.a1}") // 복제된 객체는 독립적인 객체로 괸리된다.

    println("------------------")

    val str1 = obj5.toString()
    val str2 = obj7.toString()
    println("str1 : $str1")
    println("str2 : $str2")
    // data class의 경우 주 생성자에 정의한 결과값이 같이 등장하게 된다.

    println("------------------")

    val num1 = obj7.component1()
    val num2 = obj7.component2()
    println("num1 : $num1")
    println("num2 : $num2")
    // data class에서 주 생성자로 전달한 매개변수값을 알 수 있는 메소드가 componentN 메소드임

    var obj11 = TestClass3(100, 200, 300)
    val num3 = obj11.component1()
    val num4 = obj11.component2()
    val num5 = obj11.component3()
    println("num3 : $num3")
    println("num4 : $num4")
    println("num5 : $num5")

    println("------------------")
    // 이런 component는 객체 분해에 효과가 있다.

    val(num10, num11) = obj7
    // a1의 값이 num10, a2의 값이 num11에 들어간다.
    // 단, componentN 메소드가 정의되어 있어야 한다.
    println("num10 : $num10")
    println("num11 : $num11")

    val(num12, num13, num14) = obj11
    println("num12 : $num12")
    println("num13 : $num13")
    println("num14 : $num14")
    // 객체 분해의 목적으로 componentN 메소드를 사용한다.

    /*
    하지만, data class는 데이터를 관리하기 위한 목적으로만 사용한다.
    상속, 추상 클래스 등의 키워드를 붙일 수 없으므로 그 용도가 필요한 경우 사용할 수 없다.
    다만 굉장히 편리한 점이 많기 때문에 자주 사용하면 좋다.
     */
}

/*
데이터 클래스는 목적 자체가 특정 데이터를 관리하기 위한 클래스이다.
따라서, 데이터 클래스는 반드시 주생성자를 포함해야 한다.
*/

class TestClass1(var a1:Int, var a2:Int) {

    var a3 = 0
    init {
        println("TestClass1의 init")
    }

    constructor(a1:Int, a2:Int, a3:Int) : this(a1, a2) {
        this.a3 = a3
    }

    fun testMethod1() {
        println("TestClass1의 testMethod1")
    }
}

data class TestClass2(var a1:Int, var a2:Int) {
    // 데이터 클래스에는 open, abstract, sealed, inline 등의 키워드를 붙일 수 없다.

    var a3 = 0
    init {
        println("TestClass2의 init")
    }

    constructor(a1:Int, a2: Int, a3: Int) : this(a1, a2) {
        this.a3 = a3
    }

    fun testMethod2() {
        println("TestClass2의 testMethod2")
    }
}

data class TestClass3(var a1:Int, var a2: Int, var a3: Int)
// data class를 작성할 때 정의한 매개변수의 개수만큼 componentN에서 N의 개수가 정해진다.