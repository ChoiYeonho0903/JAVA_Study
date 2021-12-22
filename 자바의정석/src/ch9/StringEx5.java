package ch9;

import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

public class StringEx5 {
    public static void main(String[] args) {
        String str = "가";

        byte[] bArr = str.getBytes(StandardCharsets.UTF_8);

        System.out.println(joinByteArr(bArr));
    }

    static String joinByteArr (byte[] bArr) {
        StringJoiner sj = new StringJoiner(":", "[", "]");

        for (byte b : bArr) {
            sj.add(String.format("%02X", b));
        }
        return sj.toString();
    }
}


