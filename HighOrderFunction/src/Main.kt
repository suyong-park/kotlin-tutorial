fun main() {

    val t1 = fun(x1:Int, x2:Int) : Int {
        return x1 + x2
    }

    testFun2(t1,100, 200)
    // 그냥 함수를 넘길 수 있는 것이 아니라 익명 함수만 넘길 수 있다.

    testFun2(fun(x1:Int, x2:Int):Int {
        return x1 - x2
    }, 100, 200)
    // 어차피 익명함수이기 때문에 인자에 바로 함수를 정의해 사용할 수 있다.

    val lambda1 = {x1:Int, x2:Int -> x1 * x2}
    testFun2(lambda1, 100, 200)
    // 람다를 만들어 전달할 수 있다.

    testFun2({x1:Int, x2:Int -> x1 / x2}, 200, 100)
    // 람다를 인자에서 직접 만들어 작성할 수도 있다.

    val t2 = testFun3()
    println(t2(100, 200))

    val t3 = testFun4()
    println(t3(100, 200))

    testFun5({x1:Int -> x1 + 100}, 200)
    testFun5({it + 100}, 200) // 고차함수의 매개변수가 1개밖에 없을 경우 it 만을 통해서 사용 가능하다.

    testFun6(100, 200) { x1: Int, x2: Int ->
        x1 + x2
    }

    testFun7 { x1:Int ->
        println(x1)
    }
}

fun testFun1(a1:Int, a2:Int, m1:() -> Unit) { // m1은 매개변수가 없고 반환타입이 없는 함수이다.

}

fun testFun2(m2:(Int, Int) -> Int, a1:Int, a2:Int) {
// m2은 Int 매개변수 2개, 반환타입 Int 1개 이다.

    val r1 = m2(a1, a2)
    println(r1)
}

fun testFun3() : (Int, Int) -> Int {
    return fun(x1:Int, x2:Int): Int {
        return x1 + x2
    }
}

fun testFun4() : (Int, Int) -> Int {
    return {x1:Int, x2:Int -> x1 - x2} // 람다의 결과값을 리턴함
}

fun testFun5(m1:(Int) -> Int, a1: Int) {
    val r1 = (m1(a1))
    println(r1)
}

fun testFun6(a1:Int, a2:Int, m1:(Int, Int) -> Int) {
    val r1 = m1(a1, a2)
    println(r1)
}

fun testFun7(m1:(Int) -> Unit) {
    m1(100)
}

// 고차함수는 함수를 매개변수로 받거나 반환 타입이 함수인 것을 고차 함수라고 한다.
// 함수 호출시 전달하는 함수와 반환하는 함수는 람다식을 사용할 수도 있다.