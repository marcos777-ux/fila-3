package com.aadtex.model;

import com.aadtex.model.role.StoreRole;

import java.math.BigDecimal;

public class StoreEmployee extends Employee {

    private StoreRole role;
    private BigDecimal salesBonus;

    public StoreEmployee(
            String id,
            String name,
            String email,
            BigDecimal baseSalary,
            StoreRole role,
            BigDecimal salesBonus
    ) {
        super(id, name, email, baseSalary);
        this.role = role;
        this.salesBonus = salesBonus;
    }

    public StoreRole getRole() {
        return role;
    }

    public BigDecimal getSalesBonus() {
        return salesBonus;
    }

    public void setRole(StoreRole role) {
        this.role = role;
    }

    public void setSalesBonus(BigDecimal salesBonus) {
        this.salesBonus = salesBonus;
    }
}