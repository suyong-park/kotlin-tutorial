fun main() {
    val array1 = arrayOf(10, 20, 30, 40, 50)
    println(array1)
    println(array1.contentToString()) // contentToString 메소드를 사용하면 배열 요소를 한번에 확인할 수 있다.

    val array2 = arrayOf(100, 11.11, "문자열", true)
    println(array2.contentToString())

    val array3 = intArrayOf(10, 20, 30, 40, 50)
    val array4 = doubleArrayOf(11.11, 22.22, 33.33)
    // stringArrayOf는 없다. 기본 자료형만 arrayOf가 제공된다. 객체의 경우에는 없고, 사용하고 싶다면 Generic를 사용한다.
    val array5 = arrayOf<String>("문자열1", "문자열2", "문자열3")

    println(array3.contentToString())
    println(array4.contentToString())
    println(array5.contentToString())

    val array6 = Array(5, {0})
    println(array6.contentToString()) // 0을 5개 갖고 있는 배열이 생성된다.

    val array7 = Array(5) {it * 2} // 람다식
    println(array7.contentToString())

    for(item in array1)
        println(item)

    val array8 = arrayOf(arrayOf(10, 20, 30), arrayOf(40, 50, 60), arrayOf(70, 80, 90))
    println(array8.contentToString())
    println(array8.contentDeepToString()) // 2차원 이상의 배열일 때 내부의 값도 한 번에 볼 수 있는 함수이다.

    println(array1[0])
    println(array1.get(0))
    // 위 두 결과는 동일하나, 굳이 get을 사용할 필요 없다.

    array1[0] = 100
    array1.set(1, 200) // 굳이 set이라는 함수를 쓸 필요는 없다.
    println(array1.contentToString())

    println("--------------------------")
    println(array1.contentToString())
    val array10 = array1.plus(60) // plus 함수의 경우 배열의 크기를 늘린 새로운 배열을 만들어 반환하는 것이다.
    println(array10.contentToString())

    val array11 = array1.sliceArray(1..3) // 인덱스 번호 1 ~ 3번에 해당하는 요소를 추출함
    println(array11.contentToString())

    println(array1.first()) // 첫 번째 값
    println(array1.last()) // 마지막 값
    println(array1.indexOf(30)) // 30 값을 가진 인덱스
    println(array1.average()) // 배열의 평균
    println(array1.sum()) // 배열의 합
    println(array1.count()) // 배열 크기
    println(array1.size) // 배열 크기
    println(array1.contains(30)) // 30 값 포함 여부
    println(array1.contains(1000)) // 1000 값 포함 여부
    println(array1.maxOrNull()) // 최대값
    println(array1.minOrNull()) // 최소값

    val array12 = arrayOf(5, 1, 3, 7, 10, 8)
    val array13 = array12.sortedArray() // 오름차순 정렬
    val array14 = array12.sortedArrayDescending() // 내림차순 정렬
    println(array13.contentToString())
    println(array14.contentToString())
}

// Kotlin 에서는 배열에 다양한 타입의 값을 담을 수 있다.
// arrayOf() 메소드를 통해 함수를 생성할 수 있다.
// arrayOf(Generic) 또한 가능하다.
// arrayOf 함수가 아닌 Array 클래스를 통해 직접 객체를 생성할 수도 있다.
