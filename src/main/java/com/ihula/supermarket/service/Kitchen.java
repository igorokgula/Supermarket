package com.ihula.supermarket.service;

import com.ihula.supermarket.model.Dish;
import io.reactivex.Completable;
import io.reactivex.Observable;

public interface Kitchen {
    Completable requestDish(String dishName, int quantity);

    Observable<Dish> readyDishes();
}
