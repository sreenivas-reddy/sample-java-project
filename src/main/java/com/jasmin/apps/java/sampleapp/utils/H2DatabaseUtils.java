package com.jasmin.apps.java.sampleapp.utils;

import java.sql.*;
import java.time.LocalDate;

public class H2DatabaseUtils {

    private static H2DatabaseUtils h2DatabaseUtils;

    private Connection connection;

    private H2DatabaseUtils() {

    }

    private void init () {
        /*
         * String jdbcUrl = "jdbc:h2:~/sampleDB";
         * Connection connection = DriverManager.getConnection(jdbcUrl, "sa", "");
         */

        /*
         * String jdbcUrl = "jdbc:h2:mem:";
         * Connection connection = DriverManager.getConnection(jdbcUrl);
         */
        if(connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:h2:mem:");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static H2DatabaseUtils getInstance() {
        if(h2DatabaseUtils == null) {
            h2DatabaseUtils = new H2DatabaseUtils();
            h2DatabaseUtils.init();
        }
        return h2DatabaseUtils;
    }

    public Connection getConnection() {
        return connection;
    }

    public void createEmployeeTable() {
        String sqlStatement = "CREATE TABLE IF NOT EXISTS EMPLOYEE(ID INT PRIMARY KEY, NAME VARCHAR(255), DATE_OF_BIRTH DATE, DESIGNATION VARCHAR(255), SALARY REAL);";
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute(sqlStatement);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertRecord(int id, String name, LocalDate dateOfBirth, String designation, float salary) {
        String SQL_STATEMENT = "INSERT INTO EMPLOYEE(ID, NAME, DATE_OF_BIRTH, DESIGNATION, SALARY) VALUES (?, ?, ?, ?, ?);";
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_STATEMENT);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setDate(3, Date.valueOf(dateOfBirth));
            preparedStatement.setString(4, designation);
            preparedStatement.setFloat(5, salary);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void printEmployeeTable() {
        String SQL_STATEMENT = "SELECT * FROM EMPLOYEE;";
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_STATEMENT);
            while (resultSet.next()) {
                System.out.println("Employee ID: " + resultSet.getInt(1));
                System.out.println("Employee Name: " + resultSet.getString(2));
                System.out.println("Employee DOB: " + resultSet.getDate(3));
                System.out.println("Employee Designation: " + resultSet.getString(4));
                System.out.println("Employee Salary: " + resultSet.getFloat(5));
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
