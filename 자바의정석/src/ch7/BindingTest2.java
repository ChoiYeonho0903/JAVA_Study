package ch7;

public class BindingTest2 {
    public static void main(String[] args) {
        Parent1 p = new Child3();
        Child3 c = new Child3();

        System.out.println(p.x);
        p.method();
        System.out.println(c.x);
        c.method();
    }
}

class Child3 extends Parent1 {

}
