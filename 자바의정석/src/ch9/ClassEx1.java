package ch9;

public class ClassEx1 {
    public static void main(String[] args) {
        Card3 c = new Card3("HEART", 3);
        Card3 c2 = new Card3();

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}

final class Card3 {
    String kind;
    int num;

    public Card3() {
        this("SPADE", 1);
    }

    public Card3(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Card3{" +
                "kind='" + kind + '\'' +
                ", num=" + num +
                '}';
    }
}
