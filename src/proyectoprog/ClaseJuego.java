/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoprog;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClaseJuego {
    
    static Statement stmt;
    static ResultSet rs; 
    
    public ClaseJuego(Connection con){
        try {

            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM dam26.Mochila");
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
