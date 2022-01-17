fun main() {
    val v1 = Number.TWO

    checkNumber(v1)

    val v2 = Number2.SealedTwo(1)
    val v3 = Number2.SealedTwo(2) // Sealed 클래스의 경우 객체를 생성할 때 값을 넘겨주면 되는 것이다.
    checkNumber2(v2)
    checkNumber2(v3)

    val v4 = Number2.SealedOne(100, 200)
    val v5 = Number2.SealedThree(100, 11.11)
    checkNumber2(v4)
    checkNumber2(v5)
}

enum class Number(val num:Int) {
    ONE(1), TWO(2), THREE(3)
}

fun checkNumber(a1:Number) {
    when(a1) {
        Number.ONE -> println("1입니다.")
        Number.TWO -> println("2입니다.")
        Number.THREE -> println("3입니다.")
    }

    when(a1.num) {
        1 -> println("1입니다.")
        2 -> println("2입니다.")
        3 -> println("3입니다.")
    }
}

sealed class Number2 { // 클래스 타입을 정의하게 됨
    class SealedOne(val a1:Int, val a2:Int) : Number2()
    class SealedTwo(val a1:Int) : Number2() { // 이들도 클래스이므로 메소드 생성 및 정의가 가능하다.
        fun sealedFun2() {
            println("SealedTwo의 sealedFun2")
        }
    }
    class SealedThree(val a1:Int, val a2:Double) : Number2()
}

fun checkNumber2(a1:Number2) {
    when(a1) {
        is Number2.SealedOne -> {
            println("One 입니다.")
            println(a1.a1)
            println(a1.a2)
        } // 객체 타입을 검사할 땐 반드시 is를 사용해야 한다.
        is Number2.SealedTwo -> {
            println("Two 입니다.")
            println(a1.a1)
            when(a1.a1) {
                1 -> println("1입니다.")
                2 -> println("2입니다.") // 객체가 들어왔을 때 그 객체 내부의 변수 값에 대한 세팅이 가능하다.
            }
            a1.sealedFun2()
        }
        is Number2.SealedThree -> {
            println("Three 입니다.")
            println(a1.a1)
            println(a1.a2)
        }
    }
}

// 열거형은 특정 값을 의미하는 상수들을 모아 관리하는 개념이다.
// Sealed Class는 객체를 모아 관리하는 개념이다.
// 열거형은 상수에 지정된 값을 변경할 수 없다. 다만, Sealed Class는 객체가 갖고 있는 변수 값을 변경할 수 있다.
// 열거형 사용시에는 상수가 의미하는 값을 수시로 변경하고자 할 때 Sealed Class를 사용한다.