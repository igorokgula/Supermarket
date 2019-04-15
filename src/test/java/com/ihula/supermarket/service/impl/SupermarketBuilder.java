package com.ihula.supermarket.service.impl;

import com.ihula.supermarket.Supermarket;
import com.ihula.supermarket.model.Dish;
import com.ihula.supermarket.model.Product;
import com.ihula.supermarket.service.Employee;
import com.ihula.supermarket.service.Supplier;
import io.reactivex.Observable;

import java.math.BigDecimal;

public class SupermarketBuilder {
    private BigDecimal currentBalance;
    private Observable<Employee> employees;
    private Observable<Supplier> suppliers;
    private Observable<Product> availableProducts;
    private Observable<Dish> availableDishes;

    public SupermarketBuilder currentBalance(Long currentBalance) {
        this.currentBalance = BigDecimal.valueOf(currentBalance);
        return this;
    }

    public SupermarketBuilder employees(Observable<Employee> employees) {
        this.employees = employees;
        return this;
    }

    public SupermarketBuilder suppliers(Observable<Supplier> suppliers) {
        this.suppliers = suppliers;
        return this;
    }

    public SupermarketBuilder products(Observable<Product> availableProducts) {
        this.availableProducts = availableProducts;
        return this;
    }

    public SupermarketBuilder dishes(Observable<Dish> availableDishes) {
        this.availableDishes = availableDishes;
        return this;
    }

    public Supermarket build() {
        return new Supermarket(currentBalance, employees, suppliers, availableProducts, availableDishes);
    }
}
