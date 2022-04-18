package com.effectivejava.chapter01.item02.builder.lombok;

import lombok.Builder;

@Builder
public class NutritionFacts {
    private final int servingSize;  //필수
    private final int servings;     //필수
    private final int calories;     //선택
    private final int fat;          //선택
    private final int sodium;       //선택
    private final int carbohydrate; //선택

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFactsBuilder()
                .servingSize(100)
                .servings(10)
                .build();
    }
}
