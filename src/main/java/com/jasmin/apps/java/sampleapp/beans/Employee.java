package com.jasmin.apps.java.sampleapp.beans;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String designation;
    private float salary;

    public Employee() {
        super();
    }

    public Employee(int id, String name, LocalDate dateOfBirth, String designation, float salary) {
        this();
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
