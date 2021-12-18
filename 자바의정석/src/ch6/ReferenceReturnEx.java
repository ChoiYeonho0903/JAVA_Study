package ch6;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println(d);
        System.out.println(d2);
    }

    static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }
}
