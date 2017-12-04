package com.le.viet.lists;

import java.util.List;
import java.util.Vector;

/**
 * Vector is backed by an array but it is thread safe
 * Created by VTL on 12/3/17.
 */
public class VectorClient {
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
    }
}
