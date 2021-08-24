fun main() {

    // 정수 리터럴
    println(100)
    println(10000000000) // 자바와 다르게 21억을 넘어가는 정수에 대해 L을 붙이지 않아도 됨.
    println(10000000000L)
    println(938_492_934_823)

    // 실수 리터럴
    println(11.11) // 이런 식으로 하면 double type으로 만들어짐 (8 byte) --> 일반적으로 이렇게 사용함
    println(22.22f) // float type을 통해 메모리를 절약하고 싶으면 자바처럼 f를 붙여주면 됨. (4 byte)

    // 문자 리터럴
    println('A')
    println('가')

    // 문자열 리터럴
    println("문자열")

    // 논리 리터럴
    println(true)
    println(false)

    // Raw String
    println("\n동해물과 백두산이\n마르고 닳도록\n하느님이 보우하사\n우리나라 만세\n")
    println("""동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세
    """.trimMargin()) // OR 연산자(|)를 붙이고 trimMargin 함수를 사용하면 OR 연산자 앞의 공백이 사라짐

    println("----------------------------------")
    // 코틀린은 모든 기본 타입 값을 객체로 만들어 관리한다.

    // 키워드 변수명:자료형 = 값
    val a1:Int = 100
    println("a1 : " + a1) // JAVA
    println("a1 : ${a1}") // Kotlin
    println("a1 : $a1") // 코틀린에서는 중괄호 안에 수식, 연산자를 제외한 변수명만 있다면 중괄호 생략 가능

    // 자료형을 생략하는 경우 들어온 값에 따라 자료형이 자동으로 결정된다.
    val a2 = 100 // 코틀린에서는 자료형을 생략하는 것을 추천하게 된다. 다만, 반드시 명시해야 하는 경우도 있다.
    println("a2 : $a2")

    var a3:Int = 100
    val a4:Int = 100

    println("a3 : $a3")
    println("a4 : $a4")

    // var은 값을 재할당할 수 있다.
    a3 = 200
    println("a3 : $a3")

    //a4 = 200 이는 반드시 에러가 난다. val은 다시 값을 재할당할 수 없다.

    println("----------------------------------")

    var a5:Int = 100 // ? 가 붙어있지 않으면 null 값을 허용하지 않는다.
    var a6:Int? = null // 자료형 뒤에 ? 를 붙이면 null 값을 허용할 수 있다.

    println("a5 : $a5")
    println("a6 : $a6")

    var a7:Int? = a5
    println("a7 : $a7")

    // var a8:Int = a6 // a6은 null 값을 허용하는 변수이다. 이를 null 값을 허용하지 않는 변수에 할당하려 하면 에러가 발생한다.
    //var a8:Int = a6!! // !!를 붙이면 null을 허용하는 변수의 값을 null을 허용하지 않도록 변환해 준다. 다만, 실제로는 null이 들어가 있기 때문에 에러가 발생하게 된다.
}