fun main() {

    val s1 = SubClass1()
    println("s1.subMember1 : ${s1.subMember1}")
    s1.subMember1()

    println("s1.superMember1 : ${s1.superMember1}")
    s1.superMethod1()
    // 부모 클래스는 원래 자식 클래스에 정의된 것처럼 사용하면 된다.


}

open class SuperClass1 {
    // 타 클래스에서 상속을 하길 원하면 open 키워드를 붙여줘야 한다.
    // open 키워드를 붙이지 않으면 Java로 변환될 때 final이 붙는다.
    var superMember1 = 100

    fun superMethod1() {
        println("SuperClass1의 메소드입니다.")
    }
}

class SubClass1 : SuperClass1() {
    // 상속받은 클래스는 반드시 부모 클래스의 생성자를 호출해야 한다.
    val subMember1 = 200

    fun subMember1() {
        println("SubClass1의 메소드입니다.")
    }
}

open class SuperClass2(val a1:Int) {

}

class SubClass2 : SuperClass2(100)

class SubClass3 : SuperClass2 {
    constructor() : super(100)
}
// SubClass2, 3 과 같이 부모 클래스의 생성자를 반드시 호출해야 한다.