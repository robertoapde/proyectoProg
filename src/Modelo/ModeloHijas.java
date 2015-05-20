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
        String q1 = "SELECT Nivel, Clase, Experiencia, Oro, PV, PE, PVMaximo, PEMaximo FROM Usuario WHERE Nombre = "+u;
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
            ResultSet res = pstm1.executeQuery();
            res.next();
            int niv = res.getInt("Nivel");
            info[0] = String.valueOf(niv);
            info[1] = res.getString("Clase");
            int exp = res.getInt("Experiencia");
            info[2] = String.valueOf(exp);
            int oro = res.getInt("Oro");
            info[3] = String.valueOf(oro);
            int pv = res.getInt("PV");
            info[4] = String.valueOf(pv);
            int pe = res.getInt("PE");
            info[5] = String.valueOf(pe);
            int pvm = res.getInt("PVMaximo");
            info[6] = String.valueOf(pvm);
            int pem = res.getInt("PEMaximo");
            info[7] = String.valueOf(pem);
            res.close();
            pstm1.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de SQL");
        }
        return info;
    }
}