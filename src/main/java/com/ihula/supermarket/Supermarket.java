package com.ihula.supermarket;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;
import com.ihula.supermarket.model.Dish;
import com.ihula.supermarket.model.Product;
import com.ihula.supermarket.service.Employee;
import com.ihula.supermarket.service.Supplier;
import com.ihula.supermarket.service.impl.EmployeeImpl;
import com.ihula.supermarket.service.impl.SupplierImpl;
import io.reactivex.Completable;
import io.reactivex.Observable;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.io.Resources.getResource;
import static io.reactivex.Completable.complete;
import static io.reactivex.Observable.empty;
import static io.reactivex.Observable.fromIterable;

public class Supermarket {
    private static ObjectMapper mapper = new ObjectMapper();

    private BigDecimal currentBalance;
    private Observable<Employee> employees;
    private Observable<Supplier> suppliers;
    private Observable<Product> availableProducts;
    private Observable<Dish> availableDishes;

    public Supermarket(BigDecimal currentBalance, Observable<Employee> employees,
                       Observable<Supplier> suppliers,
                       Observable<Product> availableProducts, Observable<Dish> availableDishes) {
        this.currentBalance = currentBalance;
        this.employees = employees;
        this.suppliers = suppliers;
        this.availableProducts = availableProducts;
        this.availableDishes = availableDishes;
    }

    public Observable<Product> products() {
        return empty();
    }

    public Completable cellProduct(String productName, int quantity) {
        return complete();
    }

    public Completable requestProductFromSupplier(String productName, int quantity) {
        return complete();
    }

    public static void main(String[] args) throws IOException {
        List<Product> products = readProducts("products.json");
        List<Supplier> suppliers = readSuppliers("suppliers.json");
        List<Employee> employees = readEmployees("employees.json");
        List<Dish> dishes = readDishes("dishes.json");

        new Supermarket(BigDecimal.valueOf(10000), fromIterable(employees), fromIterable(suppliers),
                fromIterable(products), fromIterable(dishes));
    }

    private static List<Product> readProducts(String filename) throws IOException {
        String json = Resources.toString(getResource(filename), UTF_8);
        return mapper.readValue(json, new TypeReference<List<Product>>() {
        });
    }

    private static List<Supplier> readSuppliers(String filename) throws IOException {
        String json = Resources.toString(getResource(filename), UTF_8);
        return mapper.readValue(json, new TypeReference<List<SupplierImpl>>() {
        });
    }

    private static List<Employee> readEmployees(String filename) throws IOException {
        String json = Resources.toString(getResource(filename), UTF_8);
        return mapper.readValue(json, new TypeReference<List<EmployeeImpl>>() {
        });
    }

    private static List<Dish> readDishes(String filename) throws IOException {
        String json = Resources.toString(getResource(filename), UTF_8);
        return mapper.readValue(json, new TypeReference<List<Dish>>() {
        });
    }
}
