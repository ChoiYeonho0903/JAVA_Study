package com.effectivejava.chapter01.item02.builder;

public class NutritionFacts {
    private final int servingSize;  //필수
    private final int servings;     //필수
    private final int calories;     //선택
    private final int fat;          //선택
    private final int sodium;       //선택
    private final int carbohydrate; //선택

    public static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories (int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat (int fat) {
            this.fat = fat;
            return this;
        }
        public Builder sodium (int sodium) {
            this.sodium = sodium;
            return this;
        }
        public Builder carbohydrate (int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }
}
