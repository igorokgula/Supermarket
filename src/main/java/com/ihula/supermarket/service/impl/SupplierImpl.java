package com.ihula.supermarket.service.impl;

import com.ihula.supermarket.model.Product;
import com.ihula.supermarket.service.Supplier;
import io.reactivex.Observable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class SupplierImpl implements Supplier {
    private String name;

    // todo
    @Override
    public Observable<Product> sellProducts(String name, int quantity) {
        return null;
    }

    // todo
    @Override
    public Observable<Product> offerNewProducts() {
        return null;
    }
}
