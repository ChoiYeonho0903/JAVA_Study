package ch9;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(8080L);
        Person p2 = new Person(8080L);

        if(p1==p2)
            System.out.println("Equals");
        else
            System.out.println("Different");

        if(p1.equals(p2))
            System.out.println("Equals");
        else
            System.out.println("Different");
    }
}

class Person {
    long id;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person)
            return id == ((Person)obj).id;
        else
            return false;
    }

    public Person(long id) {
        this.id = id;
    }
}
