package com.ihula.supermarket.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@NoArgsConstructor
@ToString
public class Dish extends Product {
    private Set<Ingredient> ingredients;
    // Approximate duration of time needed to make dish
    private int duration;
    // in hours
    private int expirationDuration;

    public Dish(String name, int quantity, Set<Ingredient> ingredients, int minCount, int maxCount) {
        super(name, quantity, new ProductType(0, false), minCount, maxCount);
        this.ingredients = ingredients;
    }
}