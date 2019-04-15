package com.ihula.supermarket.service;

import com.ihula.supermarket.model.Dish;
import io.reactivex.Observable;

public interface Employee {
    Observable<Dish> makeDish(String dishName, int quantity);
}