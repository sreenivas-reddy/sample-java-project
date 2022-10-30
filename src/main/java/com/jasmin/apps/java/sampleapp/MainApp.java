package com.jasmin.apps.java.sampleapp;

import com.jasmin.apps.java.sampleapp.beans.Employee;
import com.jasmin.apps.java.sampleapp.dao.EmployeeDao;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();

        Employee employee1 = new Employee(1, "Clark Kent", LocalDate.of(1975, Month.JANUARY, 01), "Superhero", 20000);
        Employee employee2 = new Employee(2, "Bruce Wayne", LocalDate.of(1975, Month.DECEMBER, 01), "Lead Superhero", 50000);
        employeeDao.insertEmployee(employee1);
        employeeDao.insertEmployee(employee2);

        System.out.println(employeeDao.getEmployee(1));
        System.out.println(employeeDao.getEmployee(2));
        System.out.println();

        List<Employee> employees = employeeDao.getEmployees();
        for (Employee emplyee: employees) {
            System.out.println(emplyee);
        }
    }
}
