/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mysqlconnector;

import java.sql.*;
import java.util.Properties;

/**
 *
 * @author Oytun
 */
public class ConnectorTest {

    public static void main(String args[]) {

        Connection dbConnection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/?serverTimezone=UTC";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "07030607");
            dbConnection = DriverManager.getConnection(url, info);
            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database test");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred while connecting MySQL databse");
            ex.printStackTrace();
        }

    }
}
