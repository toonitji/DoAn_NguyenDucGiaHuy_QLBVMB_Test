/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTILS;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Buu
 */
public class ConnectionUtil {
    // Kết nối vào MySQL.
    public static Connection getConnection() throws SQLException,
         ClassNotFoundException {
     String hostName = "localhost";//mặc định
 
     String dbName = "qlkh_test";//tên database
     String Username = "root";//mặc định
     String Password = "";//mặc định
 
     return getConnection(hostName, dbName, Username, Password);
 }
 
    public static Connection getConnection(String hostName, String dbName,
         String Username, String Password) throws SQLException,
         ClassNotFoundException {
 
     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
 
     Connection conn = DriverManager.getConnection(connectionURL, Username,
             Password);
     return conn;
    }
}
