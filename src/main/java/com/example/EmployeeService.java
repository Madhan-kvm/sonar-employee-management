package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }

        return null;
    }

    public int getEmployeeCount() {
        return employees.size();
    }

    public double calculateAverageSalary() {
        if (employees.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;

        for (Employee employee : employees) {
            total += employee.getSalary();
        }

        return total / employees.size();
    }
}
