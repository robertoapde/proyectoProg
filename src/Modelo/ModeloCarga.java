package Modelo;
import java.sql.*;
import javax.swing.JOptionPane;

public class ModeloCarga extends Database{
    
    public ModeloCarga(){}
    
    public int login(String u, String p){
        int resu = 0;
            try{
                String q1 = "SELECT Nombre, Contraseña FROM Usuario WHERE Nombre = '"+u+"'";
                String usu = "";
                String pass = "";
                try{
                    PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
                    ResultSet res = pstm1.executeQuery();
                    res.next();
                    usu = res.getString("Nombre");
                    pass = res.getString("Contraseña");
                    res.close();
                    pstm1.close();
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Error de SQL");
                }
                if(pass.equals(p) && usu.equals(u)){
                    resu = 1;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de inicio de sesión");
            }
        return resu;
    }
    
    public boolean registrar(String u, String p){
        boolean res = false;
        try{
            
        }catch(Exception e){
            
        }
        return res;
    }
}