fun main() {
    val set1 = setOf(1, 5, 10, 1, 5, 10)
    println(set1) // 중복된 값은 모두 사라지게 된다.

    val set2 = mutableSetOf<Int>()
    println(set2)

    for(item in set1)
        println(item)

    println(set1.size) // set 컬렉션의 크기 반환

    println(set2) // 현재 비어 있는 가변형 set
    set2.add(10)
    set2.add(20)
    set2.addAll(listOf(30, 40, 50))
    println(set2)

    set2.add(20) // 이미 있는 요소를 또 추가하는 경우 추가되지 않는다.
    println(set2)

    set2.addAll(listOf(40, 50, 60, 70)) // 이미 있는 요소는 빼고 새로 추가되는 요소만 삽입된다.
    println(set2)

    set2.remove(30) // set은 순서가 없기 때문에 인덱스를 지정할 수 없다.
    println(set2) // remove를 사용하면 해당 값을 삭제한다는 의미로 받아들이면 된다.

    /*
    List ==> Set으로 변경하는 경우 (중복 제거를 원하는 경우)
    Set ==> List로 변경하는 경우
    다만, List를 Set으로 변경 후, 다시 List로 변경했을 때 그 순서가 그대로인 것을 보장할 수는 없다.
     */

    val set3 = set1.toMutableSet()
    set3.add(1000)
    println(set3)

    val set4 = set3.toSet() // 불변형 Set

    val list100 = listOf(10, 20, 30, 10, 20, 30)
    println(list100)

    val set5 = list100.toSet() // 불변형 Set으로 변경
    val set6 = list100.toMutableSet() // 가변형 Set으로 변경

    println(set5)
    println(set6)

    val set7 = set5.toList()
    val set8 = set5.toMutableList()
    println(set7)
    println(set8)
}

// Set은 객체를 이름이나 순서 등으로 관리하는 주체가 없다.
// 중복된 객체를 담을 수 없다.
// 순서에 관계 없고, 중복이 없다.
// set은 객체를 직접 가져오는 메서드는 없다. 따라서, 반복문을 통해 직접 순회해야 한다.
