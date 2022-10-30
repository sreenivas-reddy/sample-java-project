package com.jasmin.apps.java.sampleapp.beans;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void getId() {
        Employee employee = new Employee(2, "Bruce Wayne", LocalDate.of(1975, Month.DECEMBER, 01), "Lead Superhero", 50000);
        assertEquals(2, employee.getId());
    }

    @Test
    public void getName() {
        Employee employee = new Employee(2, "Bruce Wayne", LocalDate.of(1975, Month.DECEMBER, 01), "Lead Superhero", 50000);
        assertEquals("Bruce Wayne", employee.getName());
    }

    @Test
    public void getDateOfBirth() {
        Employee employee = new Employee(2, "Bruce Wayne", LocalDate.of(1975, Month.DECEMBER, 01), "Lead Superhero", 50000);
        assertEquals(LocalDate.of(1975, Month.DECEMBER, 01), employee.getDateOfBirth());
    }

    @Test
    public void getDesignation() {
        Employee employee = new Employee(2, "Bruce Wayne", LocalDate.of(1975, Month.DECEMBER, 01), "Lead Superhero", 50000);
        assertEquals("Lead Superhero", employee.getDesignation());
    }

    @Test
    public void getSalary() {
        Employee employee = new Employee(2, "Bruce Wayne", LocalDate.of(1975, Month.DECEMBER, 01), "Lead Superhero", 50000);
        assertEquals(50000, employee.getSalary(), 0);
    }

    @Test
    public void setId() {
        Employee employee = new Employee();
        employee.setId(1);
        assertEquals(1, employee.getId());
    }

    @Test
    public void setName() {
        Employee employee = new Employee();
        employee.setName("Clark Kent");
        assertEquals("Clark Kent", employee.getName());
    }

    @Test
    public void setDateOfBirth() {
        Employee employee = new Employee();
        employee.setDateOfBirth(LocalDate.of(1975, Month.JANUARY, 01));
        assertEquals(LocalDate.of(1975, Month.JANUARY, 01), employee.getDateOfBirth());
    }

    @Test
    public void setDesignation() {
        Employee employee = new Employee();
        employee.setDesignation("Superhero");
        assertEquals("Superhero", employee.getDesignation());
    }

    @Test
    public void setSalary() {
        Employee employee = new Employee();
        employee.setSalary(20000);
        assertEquals(20000, employee.getSalary(), 0);
    }
}