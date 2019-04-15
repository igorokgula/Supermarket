package com.ihula.supermarket.service;

import com.ihula.supermarket.model.Item;
import io.reactivex.Completable;

import java.util.List;

public interface Customer {
    Completable buyItems(List<Item> items);
}
