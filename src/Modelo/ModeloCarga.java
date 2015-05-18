package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import Vista.VentanaCarga;
import Vista.VentanaHijas;
import javax.swing.JOptionPane;

public class ModeloCarga extends Database{
    
    public ModeloCarga(){
    }
    
    public boolean login(String u, String p){
        boolean resu = false;
        if(u == ""){
            JOptionPane.showMessageDialog(null, "Introduzca un usuario");
        }else if(p == ""){
            JOptionPane.showMessageDialog(null, "Introduzca una contraseña");        
        }else if(u == "" && p == ""){
            JOptionPane.showMessageDialog(null, "Introduzca su usuario y contraseña");
        }else{
            try{
                String q = "SELECT Nombre, Contraseña FROM Usuario WHERE Nombre = "+u;
                PreparedStatement pstm = this.getConexion().prepareStatement(q);
                ResultSet res = pstm.executeQuery();
                String usu = res.getString("Nombre");
                String pass = res.getString("Contraseña");
                pstm.close();
                if(pass.equals(p) && usu.equals(u)){
                    resu = true;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de inicio de sesión");
            }
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