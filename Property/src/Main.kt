// 캡슐화를 Property 라고 하고, 매개변수를 정의할 때 var, val을 지정하면 Property로 지정된다.
// 쉽게 생각하여, private 라는 접근 제한자를 부여하는 것이다.
// var를 지정하면 자동으로 getter, setter가 생성된다.
// val을 지정하면 getter만 생성된다. (Read Only)
fun main() {

    val obj1 = TestClass1(100, 200)
    println("obj1.a1 : ${obj1.a1}")
    // Intellij에서 개발한 것인데, getter와 setter가 동시에 있으면 변수 밑에 밑줄 생긴다
    println("obj1.a2 : ${obj1.a2}")

    obj1.a1 = 1000
    println("obj1.a1 : ${obj1.a1}")

    println("-------------------")

    val obj2 = TestClass2()
    obj2.v1 = 100
    // obj2.v2 = 1000 // val 이기 때문에 값 재할당 불가능
    println("obj2.v1 : ${obj2.v1}")
    println("obj2.v2 : ${obj2.v2}")

    obj2.v3 = 5000 // 값을 세팅했기 때문에 setter가 호출됨
    println("obj2.v3 : ${obj2.v3}")
}

class TestClass1 (var a1:Int, val a2:Int) {
    // constructor(var a1:Int, val a2:Int, var a3:Int) : this(a1, a2)
    // 보조 생성자에는 var, val 키워드를 붙일 수 없다.
}

class TestClass2() {
    var v1:Int = 0
    val v2:Int = 0
    var v3:Int = 100 // 자바에서 초기값을 지정하지 않았을 경우에 초기값은 정수 0으로 세팅된다.
        //get() = field // field는 v3 변수를 의미한다.
        get() { // v3에 대한 getter
            println("get 호출")
            return field // field는 v3 변수를 의미한다.
        }
        set(value) { // v3에 대한 setter
            println("set 호출")
            field = value
        }
}