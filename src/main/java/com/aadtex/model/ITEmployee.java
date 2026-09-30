package com.aadtex.model;

import com.aadtex.model.role.ITRole;

import java.math.BigDecimal;

public class ITEmployee extends Employee {

    private ITRole role;

    public ITEmployee(
            String id,
            String name,
            String email,
            BigDecimal baseSalary,
            ITRole role
    ) {
        super(id, name, email, baseSalary);
        this.role = role;
    }

    public ITRole getRole() {
        return role;
    }

    public void setRole(ITRole role) {
        this.role = role;
    }
}