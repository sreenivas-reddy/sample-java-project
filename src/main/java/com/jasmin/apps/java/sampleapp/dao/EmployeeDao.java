package com.jasmin.apps.java.sampleapp.dao;

import com.jasmin.apps.java.sampleapp.beans.Employee;
import com.jasmin.apps.java.sampleapp.utils.H2DatabaseUtils;

import java.util.List;

public class EmployeeDao {
    private H2DatabaseUtils h2DatabaseUtils;

    public EmployeeDao() {
        super();
        this.h2DatabaseUtils = H2DatabaseUtils.getInstance();
        this.h2DatabaseUtils.createEmployeeTable();
    }

    public void insertEmployee(Employee employee) {
        this.h2DatabaseUtils.insertRecord(employee.getId(),
                employee.getName(),
                employee.getDateOfBirth(),
                employee.getDesignation(),
                employee.getSalary());
    }

    public Employee getEmployee(int id) {
        return null;
    }

    public List<Employee> getEmployees(int id) {
        return null;
    }
}
