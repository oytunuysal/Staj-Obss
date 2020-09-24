/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.contactapp;

import static com.mycompany.contactapp.ContactAppTest.printRs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Oytun
 */
public class ContactRepository {

    public static void updateNumber(String old, String recent) {
        try {
            PreparedStatement preparedStatement = ConnectorSingleton.getInstance().prepareStatement("UPDATE contacts SET contactNumber= ? WHERE contactNumber = ? ");
            preparedStatement.setString(1, recent);
            preparedStatement.setString(2, old);
            preparedStatement.execute();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void deleteByNumber(String uniqueNumber) {
        try {
            PreparedStatement preparedStatement = ConnectorSingleton.getInstance().prepareStatement("DELETE FROM contacts WHERE contactNumber = ?");
            preparedStatement.setString(1, uniqueNumber);
            preparedStatement.execute();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void insert(String name, String uniqueNumber) {
        try {
            PreparedStatement preparedStatement = ConnectorSingleton.getInstance().prepareStatement("INSERT INTO contacts(name,contactNumber) VALUES (?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, uniqueNumber);
            preparedStatement.execute();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static ResultSet queryLike(String columnName, int underscorecount) {
        String underscore = "";
        Connection dbConnection = ConnectorSingleton.getInstance();
        for (int i = 0; i < underscorecount; i++) {
            underscore += "_";
        }
        try {
            PreparedStatement preparedStatement = dbConnection.prepareStatement(String.format("SELECT * FROM contact.contacts where %s LIKE ?", columnName));
            preparedStatement.setString(1, underscore);
            preparedStatement.execute();

            ResultSet results = preparedStatement.executeQuery();
            System.out.println("Initial state");
            printRs(results);

            //return preparedStatement.executeQuery();
        } catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }

}
