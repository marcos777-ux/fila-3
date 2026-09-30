package com.aadtex.model;

import com.aadtex.model.role.StoreRole;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreEmployeeTest {

    @Test
    void shouldCreateStoreEmployee() {
        StoreEmployee employee = new StoreEmployee(
                "STORE-001",
                "Laura Martín",
                "laura@aadtex.com",
                new BigDecimal("1800.00"),
                StoreRole.CLERK,
                new BigDecimal("150.00")
        );

        assertEquals("STORE-001", employee.getId());
        assertEquals("Laura Martín", employee.getName());
        assertEquals("laura@aadtex.com", employee.getEmail());
        assertEquals(new BigDecimal("1800.00"), employee.getBaseSalary());

        assertEquals(StoreRole.CLERK, employee.getRole());
        assertEquals(new BigDecimal("150.00"), employee.getSalesBonus());
    }

    @Test
    void shouldUpdateStoreRoleAndSalesBonus() {
        StoreEmployee employee = new StoreEmployee(
                "STORE-001",
                "Laura Martín",
                "laura@aadtex.com",
                new BigDecimal("1800.00"),
                StoreRole.CLERK,
                new BigDecimal("150.00")
        );

        employee.setRole(StoreRole.SHOP_MANAGER);
        employee.setSalesBonus(new BigDecimal("300.00"));

        assertEquals(StoreRole.SHOP_MANAGER, employee.getRole());
        assertEquals(new BigDecimal("300.00"), employee.getSalesBonus());
    }
}