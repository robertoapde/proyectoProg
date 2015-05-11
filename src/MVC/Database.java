/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rob
 */
public class Database {
    private  String db = "dam26_dbtest";
    private String user = "dam26";
    private String password = "Mazuecos14";
    private String url = "jdbc:mysql://192.168.48.2:3306"+db;
    private Connection conn = null;


public Database(){
        this.url = "jdbc:mysql://192.168.48.2:3306/"+this.db;
       try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection( this.url, this.user , this.password );    
         System.out.println("Conexion realizada con exito.");
      }catch(SQLException e){
         System.out.println("Conexion NO realizada con exito.");
         System.err.println( e.getMessage() );
      }catch(ClassNotFoundException e){
         System.out.println("Conexion NO realizada con exito.");
         System.err.println( e.getMessage() );
      }
       
   }
 public Connection getConexion()
   {
    return this.conn;
   }

}
