fun main() {

    val a1:Int = 10

    // 기본 if 문
    if(a1 == 10)
        println("a1은 10 입니다.")

    if(a1 != 10)
        println("a1은 10이 아닙니다.")

    // else 문
    if(a1 == 20)
        println("a1은 20 입니다.")
    else
        println("a1은 20이 아닙니다.")

    // else if 문
    if(a1 == 5)
        println("a1은 5 입니다.")
    else if(a1 == 10)
        println("a1은 10 입니다.")
    else if(a1 == 20)
        println("a1은 20 입니다.")
    else
        println("a1은 5, 10, 20이 아닙니다.")

    val a2:Int = 10
    val a3:Int = 20
    // 모든 조건 만족하는 경우
    if(a2 == 10 && a3 == 20)
        println("a2는 10, a3는 20 입니다.")

    if(a2 == 10 && a3 == 30)
        println("a2는 10, a3는 30 입니다.")

    // 조건 하나만 만족하는 경우
    if(a2 == 10 || a3 == 30)
        println("a2가 10 이거나 a3가 30 입니다.")
    if(a2 == 20 || a3 == 10)
        println("a2가 20 이거나 a3가 10 입니다.")

    println("------------------------")

    var a4:String = ""
    val a5:Int = 10

    if(a5 == 10)
        a4 = "10 입니다."
    else
        a4 = "10이 아닙니다."

    println("a4 : $a4")

    val a6:String = if (a5 == 10) "10 입니다." else "10이 아닙니다."
    println("a6 : $a6")

    val a7:String = if (a5 == 10) {
        println("블록1 수행")
        "10 입니다." // 이 값이 a7에 저장되게 된다. 최종적으로 마지막에 작성된 값이 등록되는 것이다.
    } else {
        println("블록2 수행")
        "10이 아닙니다."
    }
    println("a7 : $a7")
}