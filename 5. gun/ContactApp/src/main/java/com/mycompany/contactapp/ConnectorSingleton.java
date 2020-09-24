/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.contactapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author Oytun
 */
public class ConnectorSingleton {

    private static Connection dbConnection = null;

    private ConnectorSingleton() {
        try {
            String url = "jdbc:mysql://localhost:3306/contact?serverTimezone=UTC";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "07030607");
            this.dbConnection = DriverManager.getConnection(url, info);
        } catch (Exception e) {
        }
    }

    public static Connection getInstance() {
        if (dbConnection == null) {
            new ConnectorSingleton();
        }
        return dbConnection;
    }
}
