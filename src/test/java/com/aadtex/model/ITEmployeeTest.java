package com.aadtex.model;

import com.aadtex.model.role.ITRole;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ITEmployeeTest {

    @Test
    void shouldCreateITEmployee() {
        ITEmployee employee = new ITEmployee(
                "IT-001",
                "Carlos Pérez",
                "carlos@aadtex.com",
                new BigDecimal("3200.00"),
                ITRole.DEVELOPER
        );

        assertEquals("IT-001", employee.getId());
        assertEquals("Carlos Pérez", employee.getName());
        assertEquals("carlos@aadtex.com", employee.getEmail());
        assertEquals(new BigDecimal("3200.00"), employee.getBaseSalary());
        assertEquals(ITRole.DEVELOPER, employee.getRole());
    }

    @Test
    void shouldUpdateITRole() {
        ITEmployee employee = new ITEmployee(
                "IT-001",
                "Carlos Pérez",
                "carlos@aadtex.com",
                new BigDecimal("3200.00"),
                ITRole.DEVELOPER
        );

        employee.setRole(ITRole.PROJECT_MANAGER);

        assertEquals(ITRole.PROJECT_MANAGER, employee.getRole());
    }
}