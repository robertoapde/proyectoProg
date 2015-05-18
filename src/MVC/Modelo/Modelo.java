package MVC.Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import MVC.vista.VentanaCarga;
import MVC.vista.VentanaHijas;
import javax.swing.JOptionPane;

public class Modelo extends Database{
    
    public Modelo(){
    }
    
    public DefaultTableModel getTablaTienda(){
        
        DefaultTableModel tablemodel = new DefaultTableModel();
        String[] columnNames = {"Nombre","Precio","Tipo","Efecto"};
        int registros = 0;

        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM Tienda");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        
        Object[][] data = new String[registros][5];
        
        try{
          
        PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Tienda");
        ResultSet res = pstm.executeQuery();
        int i=0;
        while(res.next()){
            data[i][0] = res.getString("Nombre");
            data[i][1] = res.getString("Precio");
            data[i][2] = res.getString("Tipo");
            data[i][3] = res.getString("Efecto");
            i++;
        }
        res.close();
        
        tablemodel.setDataVector(data, columnNames);
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaTaberna(){
        
        DefaultTableModel tablemodel = new DefaultTableModel();
        String[] columnNames = {"Comida","Precio","Efecto"};
        int registros = 0;

        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM Taberna");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        
        Object[][] data = new String[registros][5];
        
        try{
          
        PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Taberna");
        ResultSet res = pstm.executeQuery();
        int i=0;
        while(res.next()){
            data[i][0] = res.getString("Comida");
            data[i][1] = res.getString("Precio");
            data[i][2] = res.getString("Efecto");
            i++;
        }
        res.close();
        
        tablemodel.setDataVector(data, columnNames);
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }
    
    public boolean login(String u, String p){
        boolean res = false;
        if(u == ""){
            JOptionPane.showMessageDialog(null, "Introduzca un usuario");
        }else if(p == ""){
            JOptionPane.showMessageDialog(null, "Introduzca una contraseña");        
        }else if(u == "" && p == ""){
            JOptionPane.showMessageDialog(null, "Introduzca su usuario y contraseña");
        }else{
            try{
                String pass = "SELECT Contraseña FROM Usuario WHERE Nombre = "+u;
                if(pass.equals(p)){
                    res = true;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de inicio de sesión");
            }
        }
        return res;
    }
    
    public boolean registrar(String u, String p){
        boolean res = false;
        try{
            
        }catch(Exception e){
            
        }
        return res;
    }
}