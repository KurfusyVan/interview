package com.kurfusy.interview.pojo;

import java.math.BigDecimal;

public class Wage {
    private String salaryId;

    private String payYear;

    private String payMonth;

    private BigDecimal salary;

    public String getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(String salaryId) {
        this.salaryId = salaryId;
    }

    public String getPayYear() {
        return payYear;
    }

    public void setPayYear(String payYear) {
        this.payYear = payYear;
    }

    public String getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(String payMonth) {
        this.payMonth = payMonth;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}