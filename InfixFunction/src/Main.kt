fun main() {
    val r1 = 100 add 50 // 100이 this를 의미하게 되고, a1이 50을 의미하게 된다.
    val r2 = 100 minus 50

    println(r1)
    println(r2)
}

infix fun Int.add(a1:Int):Int {
    return this + a1
}

infix fun Int.minus(a1:Int):Int {
    return this - a1
}
// infix 함수는 함수를 연산자처럼 사용할 수 있는 함수이다.
// 예를 들어, val r1 = 100 add 5