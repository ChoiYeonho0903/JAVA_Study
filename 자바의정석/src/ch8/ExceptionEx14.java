package ch8;

public class ExceptionEx14 {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main에서 예외처리");
            e.printStackTrace();
        }

    }
    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
