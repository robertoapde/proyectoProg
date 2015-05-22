package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloRegistro extends Database{
    
    public ModeloRegistro(){}
    
    public boolean nuevoPicaro(String u, String c, String e){
        boolean resu = false;
        int confi = 0;
        int vi = 0;
        int en = 0;
        int ar = 0;
        int at = 0;
        int da = 0;
        try{
            String q1 = "SELECT PV, PE, Armadura, Ataque, Daño FROM Personaje WHERE Nombre = 'Picaro'";
            try{
                PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
                ResultSet res = pstm1.executeQuery();
                res.next();
                vi = res.getInt("PV");
                en = res.getInt("PE");
                ar = res.getInt("Armadura");
                at = res.getInt("Ataque");
                da = res.getInt("Daño");
                res.close();
                pstm1.close();
                confi = 1;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al consultar valores");
            }
            if(confi == 1){
                String q2 = "INSERT INTO Usuario VALUES ('"+u+"','"+c+"',0,'"+e+"','Picaro',0,1,0,"+vi+","+en+","+vi+","+en+","+ar+","+at+","+da+",'','')";
                try{
                    PreparedStatement pstm2 = this.getConexion().prepareStatement(q2);
                    pstm2.execute();
                    pstm2.close();
                    resu = true;
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Nombre en uso o demasiado largo.");
                    ex.getStackTrace();
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error de consulta");
        }
        return resu;
    }
    
    public boolean nuevoMago(String u, String c, String e){
        boolean resu = false;
        int confi = 0;
        int vi = 0;
        int en = 0;
        int ar = 0;
        int at = 0;
        int da = 0;
        try{
            String q1 = "SELECT PV, PE, Armadura, Ataque, Daño FROM Personaje WHERE Nombre = 'Mago'";
            try{
                PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
                ResultSet res = pstm1.executeQuery();
                res.next();
                vi = res.getInt("PV");
                en = res.getInt("PE");
                ar = res.getInt("Armadura");
                at = res.getInt("Ataque");
                da = res.getInt("Daño");
                res.close();
                pstm1.close();
                confi = 1;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al consultar valores");
            }
            if(confi == 1){
                String q2 = "INSERT INTO Usuario VALUES ('"+u+"','"+c+"',0,'"+e+"','Mago',0,1,0,"+vi+","+en+","+vi+","+en+","+ar+","+at+","+da+",'','')";
                try{
                    PreparedStatement pstm2 = this.getConexion().prepareStatement(q2);
                    pstm2.execute();
                    pstm2.close();
                    resu = true;
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Nombre en uso o demasiado largo.");
                    ex.getStackTrace();
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error de consulta");
        }
        return resu;
    }
    
    public boolean nuevoGuerrero(String u, String c, String e){
        boolean resu = false;
        int confi = 0;
        int vi = 0;
        int en = 0;
        int ar = 0;
        int at = 0;
        int da = 0;
        try{
            String q1 = "SELECT PV, PE, Armadura, Ataque, Daño FROM Personaje WHERE Nombre = 'Guerrero'";
            try{
                PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
                ResultSet res = pstm1.executeQuery();
                res.next();
                vi = res.getInt("PV");
                en = res.getInt("PE");
                ar = res.getInt("Armadura");
                at = res.getInt("Ataque");
                da = res.getInt("Daño");
                res.close();
                pstm1.close();
                confi = 1;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al consultar valores");
            }
            if(confi == 1){
                String q2 = "INSERT INTO Usuario VALUES ('"+u+"','"+c+"',0,'"+e+"','Guerrero',0,1,0,"+vi+","+en+","+vi+","+en+","+ar+","+at+","+da+",'','')";
                try{
                    PreparedStatement pstm2 = this.getConexion().prepareStatement(q2);
                    pstm2.execute();
                    pstm2.close();
                    resu = true;
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Nombre en uso o demasiado largo.");
                    ex.getStackTrace();
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error de consulta");
        }
        return resu;
    }
}