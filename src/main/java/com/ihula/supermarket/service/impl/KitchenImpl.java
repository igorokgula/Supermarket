package com.ihula.supermarket.service.impl;

import com.ihula.supermarket.model.Dish;
import com.ihula.supermarket.service.Kitchen;
import io.reactivex.Completable;
import io.reactivex.Observable;

public class KitchenImpl implements Kitchen {
    // todo
    @Override
    public Completable requestDish(String dishName, int quantity) {
        return null;
    }

    // todo
    @Override
    public Observable<Dish> readyDishes() {
        return null;
    }
}
