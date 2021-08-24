fun main() {

    val a1 = 10
    when(a1) { // when 구문은 Java의 Switch Case 구문과 같다.
        1 -> println("a1은 1 입니다.")
        2 -> {
            println("수행되는 코드")
            println("a1은 2 입니다.")
        }
        3 -> println("a1은 3 입니다.")
        else -> println("a1은 1, 2, 3이 아닙니다.")
    }

    val a2 = 3
    when(a2) {
        1, 2 -> println("a1은 1이거나 2입니다.")
        3, 4 -> println("a1은 3이거나 4입니다.")
        5, 6 -> println("a1은 5이거나 6입니다.")
        else -> println("a1은 1, 2, 3, 4, 5, 6이 아닙니다.")
    }

    val a3 = 55.55
    when(a3) {
        33.33 -> println("a3은 33.33 입니다.")
        55.55 -> println("a3은 55.55 입니다.")
        77.77 -> println("a3은 77.77 입니다.")
        else -> println("a3은 33.33, 55.55, 77.77이 아닙니다.")
    }

    val a4 = "문자열2"
    when(a4) {
        "문자열1" -> println("첫 번째 문자열 입니다.")
        "문자열2" -> println("두 번째 문자열 입니다.")
        "문자열3" -> println("세 번째 문자열 입니다.")
        else -> println("else 문자열 입니다.")
    }

    val a5 = 5
    when(a5) {
        in 1..3 -> println("a5는 1 ~ 3에 포함됩니다.") // in 연산자는 해당 범위 안에 포함되어 있는지를 검사하는 구문이다.
        in 4..6 -> println("a5는 4 ~ 6에 포함됩니다.") // 여기서 해당 문장이 출력된 후 아래 case에 해당되더라도 when 구문은 종료된다.
        in 1..6 -> println("a5는 1 ~ 6에 포함됩니다.")
        else -> println("a5는 1 ~ 6 사이의 숫자가 아닙니다.")
    }

    val str1 = setValue(1)
    val str2 = setValue(2)
    val str3 = setValue(3)
    println("str1 : $str1")
    println("str2 : $str2")
    println("str3 : $str3")
}

fun setValue(a1 : Int) = when(a1) { // 반환 타입을 when 구문으로 설정함으로써 매개변수 값에 따라 다르게 반환되는 함수 작성
    1 -> "문자열1"
    2 -> {
        println("setValue 두 번째 경우")
        "문자열2"
    }
    else -> "그 외의 문자열"
}