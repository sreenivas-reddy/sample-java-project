package com.jasmin.apps.java.sampleapp.beans;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void getId() {
        Employee employee = new Employee();
        employee.setId(1);
        assertEquals(1, employee.getId());
    }

    @Test
    public void getName() {
        Employee employee = new Employee();
        employee.setName("Bruce Wayne");
        assertEquals("Bruce Wayne", employee.getName());
    }

    @Test
    public void getDateOfBirth() {
        Employee employee = new Employee();
        employee.setDateOfBirth(LocalDate.of(1975, Month.DECEMBER, 01));
        assertEquals(LocalDate.of(1975, Month.DECEMBER, 01), employee.getDateOfBirth());
    }

    @Test
    public void getDesignation() {
        Employee employee = new Employee();
        employee.setDesignation("Lead Superhero");
        assertEquals("Lead Superhero", employee.getDesignation());
    }

    @Test
    public void getSalary() {
        Employee employee = new Employee();
        employee.setSalary(20000);
        assertEquals(20000, employee.getSalary(), 0);
    }
}