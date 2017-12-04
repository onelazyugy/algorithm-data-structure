package com.le.viet.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * A List is backed by an ArrayList which is not thread safe
 * Created by VTL on 12/2/17.
 */
public class ListClient {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

//        employeeList.forEach(employee -> System.out.println(employee));
//        System.out.println(employeeList.get(1));
//        System.out.println(employeeList.isEmpty());
        employeeList.set(1, new Employee("John", "Adams", 4568));
//        employeeList.forEach(employee -> System.out.println(employee));

//        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
