package com.ihula.supermarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product extends Item {
    protected ProductType type;
    // minCount is the the indicator for requesting more units of the product from Suppliers
    protected int minCount;
    // maxCount is the the number of units of the product
    protected int maxCount;

    public Product(String name, int quantity, ProductType type, int minCount, int maxCount) {
        super(name, quantity);
        this.type = type;
        this.minCount = minCount;
        this.maxCount = maxCount;
    }
}
