package com.company.exceptions;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        int n;
        //String n;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            n = bufferedReader.read();
        }
        System.out.println(n);
    }

    @Test
    public void example01() throws IOException {
        System.out.println("Enter a number: ");
        int n;
        //String n;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            n = bufferedReader.read();
        }
        System.out.println(n);
    }

    @Test
    public void mySQL() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", "root", "asif1234");) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employees");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  "
                        + rs.getString(2) + "  "
                        + rs.getString(3));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
