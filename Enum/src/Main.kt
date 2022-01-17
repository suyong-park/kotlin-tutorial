fun main() {
    printDirection(Direction.EAST)
    printDirection(Direction.SOUTH)

    val dir:Direction = Direction.WEST
    printDirection(dir)

    println(Direction.WEST) // 이를 출력하면 그냥 단어 값이 뜬다.
    println(Direction.SOUTH)

    printNumber(Number.TWO)
}

enum class Direction { // 열거형 클래스
    NORTH, SOUTH, WEST, EAST
}

enum class Number(val num:Int, val str:String) {
    ONE(1, "숫자1"), TWO(2, "숫자2"), THREE(3, "숫자3") // 여기서 괄호 안에 작성할 값의 타입은 열거형 클래스 생성자에서 정의하는 것이다.
}

fun printDirection(a1: Direction) {
    when(a1) {
        Direction.NORTH -> println("북쪽")
        Direction.SOUTH -> println("남쪽")
        Direction.WEST -> println("서쪽")
        Direction.EAST -> println("동쪽")
    }
}

fun printNumber(a1:Number) {
    when(a1) {
        Number.ONE -> println("one 입니다.")
        Number.TWO -> println("two 입니다.")
        Number.THREE -> println("three 입니다.")
    }

    when(a1.num) {
        1 -> println("1 입니다.")
        2 -> println("2 입니다.")
        3 -> println("3 입니다.")
    }

    when(a1.str) {
        "숫자1" -> println("일입니다.")
        "숫자2" -> println("이입니다.")
        "숫자3" -> println("삼입니다.")
    }
}

// 특정 그룹 안의 구성 요소를 정의하는 값이 필요할 때 사용한다. 예를 들어, 동 서 남 북 / 남 녀 / 아이 청소년 청년 노인 등
// 열거형은 정의한 단어 자체가 프로그램에서 사용하는 값이 된다.