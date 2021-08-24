fun main() {

    val a1 = 1..10 // 1 ~ 10까지 값을 관리하는 객체

    for(item in a1)
        println("a1 : $item")

    println("----------------")

    val a2 = 1..10 step 2
    for(item in a2)
        println("a2 : $item")

    println("----------------")

    //val a3 = 10..1 // 이는 계속 증가하는 것이므로 아무 값도 관리하지 못하는 것이다.
    val a3 = 10 downTo 1
    for(item in a3)
        println("a3 : $item")

    println("----------------")

    val a4 = 10 downTo 1 step 2
    for(item in a4)
        println("a4 : $item")

    println("----------------")

    var a5 = 0
    while(a5 < 10) {
        println("a5 : $a5")
        a5++
    }

    println("----------------")

    var a6 = 10
    do { // do-while은 반드시 1번은 실행된다.
        println("a6 : $a6")
        a6++
    } while (a6 < 10)

    println("----------------")
}