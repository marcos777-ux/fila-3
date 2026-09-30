package com.aadtex.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void shouldCreateEmployeeWithCommonData() {
        Employee employee = new TestEmployee(
                "EMP-001",
                "Ana García",
                "ana@aadtex.com",
                new BigDecimal("2500.00")
        );

        assertEquals("EMP-001", employee.getId());
        assertEquals("Ana García", employee.getName());
        assertEquals("ana@aadtex.com", employee.getEmail());
        assertEquals(new BigDecimal("2500.00"), employee.getBaseSalary());
    }

    @Test
    void shouldUpdateEmployeeData() {
        Employee employee = new TestEmployee(
                "EMP-001",
                "Ana García",
                "ana@aadtex.com",
                new BigDecimal("2500.00")
        );

        employee.setName("Ana López");
        employee.setEmail("ana.lopez@aadtex.com");
        employee.setBaseSalary(new BigDecimal("2700.00"));

        assertEquals("Ana López", employee.getName());
        assertEquals("ana.lopez@aadtex.com", employee.getEmail());
        assertEquals(new BigDecimal("2700.00"), employee.getBaseSalary());
    }

    private static class TestEmployee extends Employee {

        private TestEmployee(
                String id,
                String name,
                String email,
                BigDecimal baseSalary
        ) {
            super(id, name, email, baseSalary);
        }
    }
}