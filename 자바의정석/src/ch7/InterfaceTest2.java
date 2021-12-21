package ch7;

public class InterfaceTest2 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.autoPlay(new B1());
        a.autoPlay(new C());
    }
}

class A1 {
    void autoPlay(I i) {
        i.play();
    }
}

interface I {
    public abstract void play();
}

class B1 implements I {
    @Override
    public void play() {
        System.out.println("B class");
    }
}

class C implements I{
    @Override
    public void play() {
        System.out.println("C class");
    }
}