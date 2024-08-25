/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gonzaloflorez.gonzalo.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Danilo
 */
public class DatabaseConfig {
    private static final String URL = "jdbc:mysql://localhost:3306/gonzaloflorez";
    private static final String USER = "root";
    private static final String PASSWORD = "9617";

    public static Connection Getconnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
