package com.ihula.supermarket.service.impl;

import com.ihula.supermarket.Supermarket;
import com.ihula.supermarket.model.Item;
import com.ihula.supermarket.service.Customer;
import io.reactivex.Completable;

import java.util.List;

public class CustomerImpl implements Customer {
    private Supermarket supermarket;

    public CustomerImpl(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    // todo
    @Override
    public Completable buyItems(List<Item> items) {
        return null;
    }
}
