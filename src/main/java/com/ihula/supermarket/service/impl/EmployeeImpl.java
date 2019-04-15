package com.ihula.supermarket.service.impl;

import com.ihula.supermarket.model.Dish;
import com.ihula.supermarket.service.Employee;
import io.reactivex.Observable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString
public class EmployeeImpl implements Employee {
    private String name;

    // todo
    @Override
    public Observable<Dish> makeDish(String dishName, int quantity) {
        return null;
    }
}
