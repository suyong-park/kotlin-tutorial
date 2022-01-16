fun main() {

    val list0 = listOf<Int>() // 값을 정해주지 않는 경우 Generic를 통해 타입을 정해둬야 함
    val list1 = listOf(10, 20, 30, 40, 50) // 정수만 들어가 있기 때문에 정수 리스트로 타입 추론이 가능함
    val list2 = listOf("문자열1", "문자열2", "문자열3") // 문자열만 들어가 있기 때문에 리스트로 타입 추론이 가능함

    println(list1)
    println(list2)

    val list3 = mutableListOf<Int>() // 가변형 리스트 생성 ==> Generic 명시를 통해 비어 있는 가변형 리스트 생성
    val list4 = mutableListOf("문자열1", "문자열2", "문자열3") // Generic을 사용하지 않는 경우 타입 추론이 가능하도록 해야함
    println(list3)
    println(list4)

    val list5 = emptyList<Int>() // 텅 비어있는 불변형 리스트
    println(list5)

    val list6 = listOfNotNull(10, 20, null, 30, null, 40, 50) // listOfNotNull은 리스트 내의 null 값은 제외하고 list를 생성하게 된다.
    println(list6)

    for(item in list1)
        println(item)

    println(list1.size) // 리스트 크기

    println(list1[0])
    println(list1.get(0))
    // 위 두 방식 모두 리스트에서 값을 가져올 수 있다. 다만, 일반적으로 대괄호를 사용한다.

    val list7 = listOf(10, 20, 30, 10, 20, 30)
    val index1 = list7.indexOf(20) // 30값의 위치가 어디인지 앞부터 찾음
    println(index1)

    val index2 = list7.lastIndexOf(20) // 20값의 위치가 어디인지 뒤부터 찾음
    println(index2)

    val list8 = list1.subList(1, 3) // 리스트의 서브 리스트를 split 함. start부터 dest - 1까지임
    println(list8)

    list3.add(10)
    list3.add(20)
    list3.add(30)
    println(list3)

    list3.addAll(listOf(40, 50, 60)) // 전부 리스트에 삽입함
    println(list3)

    list3.add(1, 100) // 1번 위치에 100을 넣겠다는 뜻
    println(list3)

    list3.addAll(2, listOf(200, 300, 400)) // 2번 인덱스에 200, 300, 400을 모두 추가한다.
    println(list3)

    list3.remove(100) // 100 값을 가진 요소를 삭제한다.
    println(list3)

    list3.removeAll(listOf(200, 300)) // 200과 300을 동시에 삭제한다.
    println(list3)

    list3.removeAt(1) // 1번째 인덱스 값을 삭제함
    println(list3)

    list3.set(1, 200)
    list3[2] = 300
    println(list3)
    // set과 배열처럼 사용하는 것은 사용법이 동일하다

    val list100 = list1.toMutableList() // 가변형 리스트 생성
    list100.add(1000)
    println(list100)

    val list200 = list100.toList() // 불변형 리스트 생성
    println(list200)
}

// Kotlin에서는 불변형, 가변형 리스트가 존재한다.
// 다만, 불변형 리스트를 사용하기를 권장하기 때문에, 가변형에서 작업 후 불변형으로 변환하는 작업을 때때로 하게 된다.