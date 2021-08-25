import kr.co.testpackage.module.pkg1.TestClass1
import kr.co.testpackage.module.pkg1.TestClass2
import kr.co.testpackage.module.pkg2.TestClass3
import kr.co.testpackage.module.pkg2.TestClass4

// 코틀린은 하나의 프로젝트 -> 다수의 모듈 -> 다수의 패키지 -> 다수의 kt 파일로 구성된다.
// 다만, 모듈은 다 다른 언어가 되도 상관 없다.
// 서로 다른 모듈을 사용하려면 모듈을 사용 등록해야 한다. (Project Structure에서 등록)
fun main() {
    val obj1 = TestClass1()
    val obj2 = TestClass2()
    val obj3 = TestClass3()
    val obj4 = TestClass4()

    obj1.testMethod1()
    obj2.testMethod2()
    obj3.testMethod3()
    obj4.testMethod4()
}