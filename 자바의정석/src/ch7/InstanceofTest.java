package ch7;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine) {
            System.out.println("FireEngine");
        }

        if(fe instanceof Car) {
            System.out.println("Car");
        }

        if(fe instanceof Object) {
            System.out.println("object");
        }

        System.out.println(fe.getClass().getName());
    }
}
