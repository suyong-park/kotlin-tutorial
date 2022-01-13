fun main() {
    println(testFun1(100, 200))
    println(testFun2(100, 200))
    println(testFun3(100, 200))

    val lambda1 : (Int, Int) -> Int = { a1:Int, a2:Int ->
        // 위에 보면 Int 인자 2개, 반환값 Int 1개로 구성되어 있다.
        a1 + a2
    }
    println(lambda1(100, 200))

    val lambda2 = {
        // 인자 타입 생략 ==> 인자 타입 2개에 각각 맞춰지며, 반환값도 자료형에 따라 자동으로 결정됨
        a1:Int, a2:Int -> a1 + a2
    }
    println(lambda2(100, 200))

    val lambda3 : (Int, Int) -> Int = { a1, a2 ->
        a1 + a2
    }
    println(lambda3(100, 200))

    val lambda = {a1:Int, a2:Int ->
        val r1 = a1 + a2
        val r2 = a1 - a2
        r1 * r2 // 람다식의 경우 최종으로 작성한 값이 리턴 타입이 된다.
    }
    println(lambda(100, 200))
}

fun testFun1(a1:Int, a2:Int) : Int {
    return a1 + a2
}

fun testFun2(a1:Int, a2:Int) : Int = a1 + a2

fun testFun3(a1:Int, a2:Int) = a1 + a2