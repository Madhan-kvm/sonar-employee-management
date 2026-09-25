package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    @Test
    void shouldAddEmployee() {
        EmployeeService service = new EmployeeService();

        Employee employee =
                new Employee(1, "Madhan", "DevOps", 50000);

        service.addEmployee(employee);

        assertEquals(1, service.getEmployeeCount());
    }

    @Test
    void shouldFindEmployeeById() {
        EmployeeService service = new EmployeeService();

        Employee employee =
                new Employee(1, "Madhan", "DevOps", 50000);

        service.addEmployee(employee);

        Employee result = service.findEmployeeById(1);

        assertNotNull(result);
        assertEquals("Madhan", result.getName());
    }

    @Test
    void shouldReturnNullForUnknownEmployee() {
        EmployeeService service = new EmployeeService();

        Employee result = service.findEmployeeById(999);

        assertNull(result);
    }

    @Test
    void shouldCalculateAverageSalary() {
        EmployeeService service = new EmployeeService();

        service.addEmployee(
                new Employee(1, "Madhan", "DevOps", 50000));

        service.addEmployee(
                new Employee(2, "John", "QA", 60000));

        assertEquals(55000,
                service.calculateAverageSalary());
    }

    @Test
    void shouldReturnZeroAverageSalaryWhenEmpty() {
        EmployeeService service = new EmployeeService();

        assertEquals(0.0,
                service.calculateAverageSalary());
    }
}
