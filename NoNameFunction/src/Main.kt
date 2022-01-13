fun main() {

    testFun1()
    val testFun3 = testFun1()
    testFun3

    val testFun2 = fun() {
        println("testFun2")
    }

    testFun2()
}

fun testFun1() {
    println("testFun1")
}


// 익명 함수의 경우 함수의 이름이 없으며, 함수를 변수에 담아 사용할 때 주로 사용한다.
// 다만, 함수의 이름이 없기 때문에 함수에 직접적으로 접근하는 것은 불가능하다.
// 따라서 해당 함수의 주소를 갖고 있는 변수를 호출하여 해당 함수를 사용할 수 있다.