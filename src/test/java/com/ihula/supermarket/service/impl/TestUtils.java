package com.ihula.supermarket.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;
import com.ihula.supermarket.model.Dish;
import com.ihula.supermarket.model.Product;
import com.ihula.supermarket.service.Employee;
import com.ihula.supermarket.service.Supplier;

import java.io.IOException;
import java.util.List;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.io.Resources.getResource;

public class TestUtils {
    public static final ObjectMapper mapper = new ObjectMapper();

    public static List<Product> products() throws IOException {
        String json = Resources.toString(getResource("products.json"), UTF_8);
        return mapper.readValue(json, new TypeReference<List<Product>>() {
        });
    }

    public static List<Supplier> suppliers() throws IOException {
        String json = Resources.toString(getResource("suppliers.json"), UTF_8);
        return mapper.readValue(json, new TypeReference<List<SupplierImpl>>() {
        });
    }

    public static List<Employee> employees() throws IOException {
        String json = Resources.toString(getResource("employees.json"), UTF_8);
        return mapper.readValue(json, new TypeReference<List<EmployeeImpl>>() {
        });
    }

    public static List<Dish> dishes() throws IOException {
        String json = Resources.toString(getResource("dishes.json"), UTF_8);
        return mapper.readValue(json, new TypeReference<List<Dish>>() {
        });
    }
}
