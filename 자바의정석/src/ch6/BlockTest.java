package ch6;

public class BlockTest {
    static {
        System.out.println("static");
    }
    {
        System.out.println("{ }");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("bt1");
        BlockTest bt1 = new BlockTest();

        System.out.println("bt2");
        BlockTest bt2 = new BlockTest();
    }
}
