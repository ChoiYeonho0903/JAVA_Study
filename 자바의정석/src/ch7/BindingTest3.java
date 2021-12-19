package ch7;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent1 p = new Child4();
        Child4 c = new Child4();

        System.out.println(p.x);
        p.method();
        System.out.println();
        System.out.println(c.x);
        c.method();
    }
}

class Child4 extends Parent1 {
    int x = 200;

    @Override
    void method() {
        System.out.println(x);
        System.out.println(super.x);
        System.out.println(this.x);
    }
}
