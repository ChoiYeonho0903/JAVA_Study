package ch7;

public class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2(10, "HAERT");
        System.out.println(c);
    }
}

class Card2 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

     Card2(int NUMBER, String KIND) {
        this.NUMBER = NUMBER;
        this.KIND = KIND;
    }

    Card2() {
        this(1, "Heart");
    }

    @Override
    public String toString() {
        return KIND + " " + NUMBER;
    }
}