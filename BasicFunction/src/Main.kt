fun main() {
    // 코틀린 코드에서는 자동으로 main 함수를 찾아 먼저 실행하게 된다.
    test1()
    test2(100, 11.11)

    val k1:Int = 100
    val k2:Double = 11.11
    test2(k1, k2)

    test2(a2=66.66, a1=600) // 코틀린에서는 이런 식으로 직접 매개변수를 지정하여 함수를 호출할 수도 있다. 매개변수의 순서는 중요하지 않다.

    // test3 함수의 경우 매개변수 기본값이 지정되어 있기 때문에 아래와 같은 함수 호출이 가능하다.
    // 매개변수 값을 지정하지 않으면 함수 매개변수를 정의했을 때 기본값으로 함수가 실행된다.
    test3(100, 11.11)
    test3(200)
    test3(a2=33.33)

    val r1:Int = test4(100, 200)
    val r2:Int = test4(1000, 2000)
    println("r1 : $r1")
    println("r2 : $r2")
    println("---------------------")

    test5()
    test6()

    test7()
    test7(100)
    test7(11.11)
    test7(100, 200)

    test8()
}

fun test1() {
    println("test1 함수 호출")
    println("---------------------")
}

fun test2(a1:Int, a2:Double) {
    println("test2 함수 호출")
    println("a1 : $a1")
    println("a2 : $a2")
    println("---------------------")
}

fun test3(a1:Int = 0, a2:Double = 0.0) {
    println("test3 함수 호출")
    println("a1 : $a1")
    println("a2 : $a2")
    println("---------------------")
}

fun test4(a1:Int, a2:Int) : Int {
    println("test4 함수 호출")
    val result:Int = a1 + a2
    return result
}

fun test5() : Unit { // Unit는 Java의 void형을 말한다. 생략이 가능하다.
    println("test5 함수 호출")
    println("---------------------")
}

fun test6() {
    println("test6 함수 호출")
    println("---------------------")
}

// 아래의 test7은 함수 오버로딩 과정이다.
fun test7() {
    println("test7 호출 - 매개변수 없음.")
    println("---------------------")
}

fun test7(a1:Int) {
    println("test7 호출 - 매개변수 1개(Int)")
    println("---------------------")
}

fun test7(a1:Double) {
    println("test7 호출 - 매개변수 1개(Double)")
    println("---------------------")
}

fun test7(a1:Int, a2:Int) {
    println("test7 호출 - 매개변수 2개(Int, Int)")
    println("---------------------")
}

fun test8() {
    // 지역함수 test9는 그 함수를 정의한 함수(test8)에서만 사용 가능하다. test9를 외부에서 호출하면 에러가 발생한다.
    println("test8 호출됨")

    fun test9() {
        println("test9 호출됨")
    }

    test9()
}