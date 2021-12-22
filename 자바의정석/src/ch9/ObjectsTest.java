package ch9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class ObjectsTest {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D_2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        for (String[] tmp : str2D) {
            System.out.println(Arrays.toString(tmp));
        }
        for (String[] tmp : str2D_2) {
            System.out.println(Arrays.toString(tmp));
        }
        System.out.println(Objects.equals(str2D, str2D_2));
        System.out.println(Objects.deepEquals(str2D, str2D_2));

        System.out.println(Objects.isNull(null));
        System.out.println(Objects.nonNull(null));
        System.out.println(Objects.hashCode(null));
        System.out.println(Objects.toString(null));
        System.out.println(Objects.toString(null, ""));

        Comparator c = String.CASE_INSENSITIVE_ORDER;
        System.out.println(Objects.compare("aa", "bb", c));
        System.out.println(Objects.compare("bb", "aa", c));
        System.out.println(Objects.compare("ab", "AB", c));
    }
}
