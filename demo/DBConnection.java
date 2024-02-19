/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.xemacscode.demo;
import java.sql.*;

/**
 *
 * @author user
 */
public class DBConnection {

    static final String DB_URL="jdbc:mysql://localhost/demo";
    static final String USER = "root";
    static final String PASS ="";
    public static Connection connectDB(){
      Connection conn = null;  
        try{
            //register jdbc not required for newer version of jdk
            //Class.forName("com.mysql.jdbc.Driver");
            //open a connection
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            return conn; 
            
        }catch(Exception ex){
         System.out.println("there were errors while connecting to db");
        return null;
        }
    }
    
}
