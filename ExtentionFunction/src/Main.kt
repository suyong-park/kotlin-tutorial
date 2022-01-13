fun main() {
    val str1 = "asdf"
    println(str1.getUpperString())
}

fun String.getUpperString(): String {
    return this.uppercase()
}

// 기존 클래스에 새로운 함수를 추가하는 개념이다.
// Kotlin 코드를 보면 기존 클래스에 메소드를 추가해 사용하는 것처럼 보일 수 있으나, 사실 그것이 아니다.
// 객체의 주소 값을 받은 함수가 만들어지고 그 함수를 호출하는 방식으로 동작한다.