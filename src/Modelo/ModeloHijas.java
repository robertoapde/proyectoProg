package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloHijas extends Database{
    
    public ModeloHijas(){
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
    
    public String[] getInfoInterfaz(String u){
        String[] info = new String[8];
        String q1 = "SELECT Nivel, Clase, Experiencia, Oro, PV, PE, PVMaximo, PEMaximo FROM Usuario WHERE Nombre = '"+u+"'";
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
            ResultSet res = pstm1.executeQuery();
            res.next();
            info[0] = String.valueOf(res.getInt("Nivel"));
            info[1] = res.getString("Clase");
            info[2] = String.valueOf(res.getInt("Experiencia"));
            info[3] = String.valueOf(res.getInt("Oro"));
            info[4] = String.valueOf(res.getInt("PV"));
            info[5] = String.valueOf(res.getInt("PE"));
            info[6] = String.valueOf(res.getInt("PVMaximo"));
            info[7] = String.valueOf(res.getInt("PEMaximo"));
            res.close();
            pstm1.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de SQL para el usuario "+u);
        }
        return info;
    }
    
    public boolean CambiarContraseña(String u,String ca, String cn){
        boolean res = false;
        int conf = 0;
        String c = "SELECT Contraseña FROM Usuario WHERE Nombre = '"+u+"'";
        
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement(c);
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            String Con = res1.getString("Contraseña");
            res1.close();
            conf=1;
            if(conf ==1 ){
                if(Con.equals(ca)){
                    String contra = "UPDATE Usuario set Contraseña = '"+cn+"' WHERE Nombre = '"+u+"'";
                    try{
                    PreparedStatement pstm2 = this.getConexion().prepareStatement(contra);
                    pstm2.execute();
                    pstm2.close();
                    res= true;
                    JOptionPane.showMessageDialog(null, "Contraseña Modificada");
                    } catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error al modificar");
                    ex.getStackTrace();
                }
            }else{
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                }
         }else{
                JOptionPane.showMessageDialog(null, "Error al conectar");
            } 
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al consultar valores");
        }
        return res;
    }
    
    public DefaultTableModel getTablaMochila(String u){
        
        DefaultTableModel tablemodel = new DefaultTableModel();
        String[] columnNames = {"Nombre","Precio","Tipo","Efecto"};
        int registros = 0;

        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM Objeto WHERE IdMochila = (SELECT IdMochila FROM Mochila WHERE NombreUsuario = '"+u+"')");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        
        Object[][] data = new String[registros][5];
        
        try{
          
        PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Objeto WHERE IdMochila = (SELECT IdMochila FROM Mochila WHERE NombreUsuario = '"+u+"')");
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
}