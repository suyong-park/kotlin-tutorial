import kr.co.testpackage.pkg1.TestClass2
import kr.co.testpackage.pkg1.testFunction2
import kr.co.testpackage.pkg2.*
// 패키지명 생략 가능
// 다만, pkg2에 TestClass2가 있다면 패키지명을 명시해야 한다.

// 동일한 기능 혹은 관련 기능을 하나의 패키지로 모으는 것이 중요하다
// 네트워크 패키지, 파일 패키지, 학생 패키지 등등

fun main() {

    val obj1:kr.co.testpackage.pkg1.TestClass1 = kr.co.testpackage.pkg1.TestClass1()
    // 다른 패키지에 있는 클래스이기 때문에 클래스 경로를 표시해 주는 것이다.
    obj1.testMethod1()

    kr.co.testpackage.pkg1.testFunction1()
    // 다른 패키지에 있는 함수 호출하는 방법

    // 다만, 이와 같이 패키지 명을 매번 작성하는 것은 불편하므로, import를 사용하면 된다.
    val obj2:TestClass2 = TestClass2()
    obj2.testMethod2()

    testFunction2()

    val obj3 = TestClass3()
    val obj4 = TestClass4()
    // TestClass3, 4는 pkg2에 정의되어 있음

    obj3.testMethod3()
    obj4.testMethod4()
}