package proyectoprog;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CargaUsuario {
 
    static Statement stmt;//modifica sobre la base de dato
    static ResultSet rs;//muestra los resultados
    
    public CargaUsuario(Connection con){
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery("SELECT * FROM dam26_ProyectoPrueba.Usuario");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    static public String[] cargaDatos(){
        
        String[] array = new String[2];
        
        try{
            rs.first();
            for(int i = 0; i < 2; i++){
                
                array[i] = rs.getString(i+1);
            }
            return array;
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}