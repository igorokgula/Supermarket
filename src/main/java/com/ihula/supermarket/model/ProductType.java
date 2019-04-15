package com.ihula.supermarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductType {
    /**
     * Provides the rare indicator from 0 to 10
     */
    private int rareIndicator;
    private boolean isCountable;

    public String unitOfMeasurement() {
        return isCountable ? "" : " kg";
    }
}

