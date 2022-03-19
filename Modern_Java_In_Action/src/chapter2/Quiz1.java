package chapter2;

import java.util.ArrayList;
import java.util.List;

public class Quiz1 {

    static interface AppleFormatter {
        String accept (Apple apple);
    }

    static class AppleFancyFormatter implements AppleFormatter {
        @Override
        public String accept(Apple apple) {
            String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
            return "A " + characteristic + " " + apple.getColor() + " apple";
        }
    }

    static class AppleSimpleFormatter implements AppleFormatter {
        @Override
        public String accept(Apple apple) {
            return "An apple of " + apple.getWeight() + "g";
        }
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(200, Color.RED));
        inventory.add(new Apple(100, Color.GREEN));
        prettyPrintApple(inventory, new AppleFancyFormatter());
    }

}
