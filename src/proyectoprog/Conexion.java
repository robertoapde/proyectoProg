/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoprog;

import java.sql.*;

public class Conexion {
    
    private static String servidor = "jdbc:mysql://192.168.48.2:3306/";
    private static String user = "dam26";
    private static String pass = "Mazuecos14";
    private static String driver = "com.mysql.jdbc.Driver";
    private static Connection conexion;
    
    public Conexion() {
        try {
        Class.forName(driver);
        conexion = DriverManager.getConnection(servidor, user, pass);
        System.out.println("Conexion realizada con exito.");
                } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                }
    }
    
    public Connection getConnection() {
        
        return conexion;
        
    }
           
    
}
