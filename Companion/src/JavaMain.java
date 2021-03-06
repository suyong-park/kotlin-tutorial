public class JavaMain {

    public int javaA1 = 100;

    public static int javaA2 = 200;

    public void javaMethod1() {
        System.out.println("javaMethod1");
    }

    public static void javaMethod2() {
        System.out.println("javaMethod2");
    }

    public static void main(String[] args) {

        TestClass t1 = new TestClass();
        System.out.printf("t1.a1 : %d\n", t1.getA1());
        t1.testFun1();

        System.out.printf("TestClass.a2 : %d\n", TestClass.Companion.getA2());
        TestClass.Companion.testFun2();
        // Companion 객체는 위와 같이 사용해야만 사용할 수 있다.

        System.out.printf("TestClass2.a3 : %d\n", TestClass.getA3());
        TestClass.testFun3();
    }
}
