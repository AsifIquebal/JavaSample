package com.company;

import org.testng.annotations.Test;

import java.sql.*;

public class DatabaseConnection {

    @Test
    public void test01() throws ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // Replace server name, username, and password with your credentials
        String connectionUrl =
                "jdbc:sqlserver://ASUS.master.windows.net:1433;"
                        + "database=TutorialDB;"
                        + "user=asif@ASUS;"
                        + "password=asif1234;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            connection.getMetaData();
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

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

    // MySQL
    @Test
    public void mySQL01() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", "root", "asif1234");) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employees");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  "
                        + rs.getString(2) + "  "
                        + rs.getString(3));

        }
    }

    @Test
    public void mySQL02() {
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String username = "root";
        String password = "root";
        String query = "SELECT VERSION()";
        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            if (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Test
    public void mySQL03() {
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String username = "root";
        String password = "root";
        String query = "select * from employees";
        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i < columnsNumber; i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
