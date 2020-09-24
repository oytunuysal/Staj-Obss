/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.contactapp;

import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Oytun
 */
public class ContactAppTest {

    //utility class yaz
    //preparedStatement kullan
    public static void main(String args[]) {
        ConnectionPool connectionPool = new ConnectionPool();
        //Connection dbConnection = ConnectorSingleton.getInstance()
        try (Connection dbConnection = connectionPool.getConnection()) {

            dbConnection.setAutoCommit(false);

            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database test");
            }

            Statement statement = dbConnection.createStatement();
            // statement.executeUpdate("CREATE DATABASE CONTACT");
            DatabaseMetaData dbm = dbConnection.getMetaData();
            ResultSet tables = dbm.getTables(null, null, "contacts", null);

            if (!tables.next()) {
                statement.executeUpdate("CREATE TABLE contacts (name VARCHAR(15), contactNumber VARCHAR(15), PRIMARY KEY(contactNumber))");
                dbConnection.commit();
            } else {
                statement.executeUpdate("DROP TABLE contacts");
                statement.executeUpdate("CREATE TABLE contacts (name VARCHAR(15), contactNumber VARCHAR(15), PRIMARY KEY(contactNumber))");
                dbConnection.commit();
            }

            //statement.executeUpdate("INSERT INTO contacts(name,contactNumber) VALUES ('Ali','10')"); // preparedStatement
            //statement.executeUpdate("INSERT INTO contacts(name,contactNumber) Value ('Mehmet', '11')");
            ContactRepository.insert("Ali", "10");
            ContactRepository.insert("Mehmet", "11");
            dbConnection.commit();
            ContactRepository.queryLike("contactNumber", 2);

            //PreparedStatement preparedStatement = dbConnection.prepareStatement("SELECT * FROM contact.contacts where contactNumber LIKE '__';");
            //PreparedStatement preparedStatement = null;
            //dbConnection.commit();
            //ResultSet results = queryLike("contactNumber", 2);
            //System.out.println("Initial state");
            //printRs(results);
            //delete
            ContactRepository.deleteByNumber("11");
            dbConnection.commit();
            ContactRepository.queryLike("contactNumber", 2);

            //update
            ContactRepository.updateNumber("10", "12");
            dbConnection.commit();
            ContactRepository.queryLike("contactNumber", 2);
            
            //try rollback
            
            
            
            
            /*
                        //delete
            String sql = "DELETE FROM contacts "
                    + "WHERE contactNumber = '11'";
            statement.executeUpdate(sql);
            dbConnection.commit();
            results = preparedStatement.executeQuery();
            System.out.println("After delete");
            printRs(results);

             */
 /*
                        //update
            sql = "UPDATE contacts "
                    + "SET contactNumber='12' WHERE contactNumber = '10'";
            statement.executeUpdate(sql);
            dbConnection.commit();
            results = preparedStatement.executeQuery();
            System.out.println("After update");
            printRs(results);

             */

 /*
                        dbConnection.rollback();
            results = preparedStatement.executeQuery();
            System.out.println("After rollback");
            printRs(results);
             */
        } catch (SQLException ex) {
            System.out.println("An error occurred while connecting MySQL databse");
            ex.printStackTrace();
        }
    }

    public static void printRs(ResultSet rs) throws SQLException {
        //Ensure we start with first row
        rs.beforeFirst();
        while (rs.next()) {
            //Retrieve by column name
            String name = rs.getString("name");
            String contactNumber = rs.getString("contactNumber");

            //Display values
            System.out.print("name: " + name);
            System.out.println(", contactNumber: " + contactNumber);

        }
        System.out.println("");
    }
}
