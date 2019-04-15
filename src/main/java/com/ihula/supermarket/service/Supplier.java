package com.ihula.supermarket.service;

import com.ihula.supermarket.model.Product;
import io.reactivex.Observable;

public interface Supplier {
    Observable<Product> sellProducts(String name, int quantity);

    Observable<Product> offerNewProducts();
}
