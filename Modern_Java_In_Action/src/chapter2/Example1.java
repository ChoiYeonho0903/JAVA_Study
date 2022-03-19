package chapter2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static chapter2.Color.GREEN;
import static chapter2.Color.RED;

public class Example1 {
    static class AppleHeavyWeightPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 150;
        }
    }

    static class AppleGreenColorPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return GREEN.equals(apple.getColor());
        }
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80, GREEN),
                new Apple(155, GREEN),
                new Apple(120, RED));
        List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeightPredicate());
        List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
