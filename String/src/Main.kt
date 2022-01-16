fun main() {
    val str1 = "안녕하세요."
    println(str1[0])
    println(str1[1])

    val str2 = str1.substring(1..3) // 1 ~ 3번째 글자를 잘라서 가져온다.
    println(str2)

    val str3 = "Hello World"
    val str4 = "hello World"

    // compareTo 메소드는 문자열이 동일한 경우 0을 리턴한다.
    // Kotlin에서 문자열을 비교할 때 compareTo, contentEquals를 사용할 수 있다.
    println(str3.compareTo(str4))
    println(str3.compareTo(str4, true)) // true를 넘길 경우 대소문자 구분을 무시한다.
    println(str3.contentEquals(str4)) // false 리턴
    println(str3.contentEquals(str4, true)) // 대소문자 구분 무시

    val str5 = "ab cd ef gh"
    val r1 = str5.split(" ")
    println(r1)

    val str6 = "abc"
    val str7 = str6 + "def"
    println(str6)
    println(str7) // 이런 방식은 새로운 문자열이 계속 생성되는 방식이다.

    val buffer1 = StringBuffer()
    buffer1.append("abc")
    buffer1.append(100)
    buffer1.append(11.11)
    println(buffer1) // 문자열을 직접 조작하여 하나의 문자열을 만들어낼 수 있다.

    buffer1.insert(3, "테스트")
    // 문자열 도중에 값을 삽입하는 경우
    // 3번째 offset 직전에 값을 삽입한다.
    println(buffer1)

    buffer1.delete(3, 6) // 3 ~ 5 인덱스의 문자열을 삭제한다.
    println(buffer1)
}

// Kotlin은 문자열을 배열 형태로 관리한다.
// 따라서, 문자열의 글자를 0부터 시작하는 인덱스로 관리할 수 있다.
// 다만, 문자열은 Read Only 이다.
// 따라서, 문자열을 + 연산자를 통해 문자열을 합치면 문자열 객체가 계속 생성된다.
// StringBuffer을 사용하면 관리하는 문자열을 직접 조작할 수 있다.
// String은 지속적인 문자열 연산을 사용하면 메모리를 많이 사용하지만 원본이 유지된다.
// StringBuffer은 메모리를 절약할 수 있지만 원본을 유지할 수 없다.