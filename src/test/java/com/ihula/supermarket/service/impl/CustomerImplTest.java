package com.ihula.supermarket.service.impl;

import com.ihula.supermarket.Supermarket;
import com.ihula.supermarket.model.Item;
import com.ihula.supermarket.service.Customer;
import io.reactivex.Completable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.Arrays;

import static com.ihula.supermarket.service.impl.TestUtils.products;
import static io.reactivex.Observable.fromIterable;
import static java.util.Collections.emptyList;

@ExtendWith(MockitoExtension.class)
class CustomerImplTest {
    private Customer customer;

    @BeforeEach
    void init() {
        customer = new CustomerImpl(null);
    }

    @Test
    void buyNoItems() {
        Completable completable = customer.buyItems(emptyList());
        completable.test().assertError(IllegalArgumentException.class);
    }

    @Test
    void buyProduct() throws IOException {
        Supermarket supermarket = new SupermarketBuilder()
                .currentBalance(0L)
                .products(fromIterable(products()))
                .build();

        customer = new CustomerImpl(supermarket);

        Completable completable = customer.buyItems(Arrays.asList(new Item("Tomato", 1)));

        completable.test().assertResult();
    }
}