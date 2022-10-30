package com.jasmin.apps.java.sampleapp.dao;

import com.jasmin.apps.java.sampleapp.beans.Employee;
import com.jasmin.apps.java.sampleapp.utils.H2DatabaseUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        ResultSet resultSet = this.h2DatabaseUtils.getRecord(id);
        Employee employee = null;
        try {
            if (resultSet.next()) {
                employee = new Employee();
                employee.setId(resultSet.getInt(1));
                employee.setName(resultSet.getString(2));
                employee.setDateOfBirth(resultSet.getDate(3).toLocalDate());
                employee.setDesignation(resultSet.getString(4));
                employee.setSalary(resultSet.getFloat(5));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employee;
    }

    public List<Employee> getEmployees() {
        ResultSet resultSet = this.h2DatabaseUtils.getAllRecords();
        List<Employee> employees = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt(1));
                employee.setName(resultSet.getString(2));
                employee.setDateOfBirth(resultSet.getDate(3).toLocalDate());
                employee.setDesignation(resultSet.getString(4));
                employee.setSalary(resultSet.getFloat(5));
                employees.add(employee);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }
}
