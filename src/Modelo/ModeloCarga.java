package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ModeloCarga extends Database{
    
    public ModeloCarga(){
    }
    
    public int login(String u, String p){
        int resu = 0;
            try{
                String q = "SELECT Nombre, Contraseña FROM Usuario WHERE Nombre = "+u;
                String usu;
                String pass;
                try (PreparedStatement pstm = this.getConexion().prepareStatement(q)) {
                    ResultSet res = pstm.executeQuery();
                    usu = res.getString("Nombre");
                    pass = res.getString("Contraseña");
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