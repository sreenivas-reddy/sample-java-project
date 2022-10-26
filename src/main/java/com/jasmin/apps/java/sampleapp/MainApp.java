package com.jasmin.apps.java.sampleapp;

import com.jasmin.apps.java.sampleapp.utils.H2DatabaseUtils;

import java.time.LocalDate;
import java.time.Month;

public class MainApp {
    public static void main(String[] args) {
        H2DatabaseUtils h2DatabaseUtils = H2DatabaseUtils.getInstance();
        h2DatabaseUtils.createEmployeeTable();
        h2DatabaseUtils.insertRecord(1, "Clark Kent", LocalDate.of(1975, Month.JANUARY, 01), "Superhero", 20000);
        h2DatabaseUtils.insertRecord(2, "Bruce Wayne", LocalDate.of(1975, Month.DECEMBER, 01), "Lead Superhero", 50000);
        h2DatabaseUtils.printEmployeeTable();
    }
}
