package com.company;

import org.testng.annotations.Test;

import java.sql.*;

public class DatabaseCpnnection {

    @Test
    public void demo1() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5433/postgres", "postgres", "asif");
        Statement statement = connection.createStatement();
        statement.execute("INSERT into amazon_seller(seller_name,product_url,no_of_products) values ('1','2','3')");
        // if we want to store the data, so we need executeQuery instead of execute;
        ResultSet resultSet = statement.executeQuery("select * from test_table");
        // While Loop to iterate through all data and print results
        while (resultSet.next()) {
            String myName = resultSet.getString(1);
            String myAge = resultSet.getString(2);
            System.out.println(myName + "  " + myAge);
        }
        statement.close();
        connection.close();
    }
}
