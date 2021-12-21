package ch8;

public class ExceptionEx13 {
    public static void main(String[] args) throws Exception {
        method1();
    }
    static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("method1에서 예외처리");
            e.printStackTrace();
        }
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
