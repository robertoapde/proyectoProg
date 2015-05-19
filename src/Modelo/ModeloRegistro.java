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
        int vi;
        int en;
        int ar;
        int at;
        int da;
        try{
            String q1 = "SELECT PV, PE, Armadura, Ataque, Daño FROM Personaje WHERE Nombre = Picaro";
            try(PreparedStatement pstm1 = this.getConexion().prepareStatement(q1)){
                ResultSet res = pstm1.executeQuery();
                vi = res.getInt("PV");
                en = res.getInt("PE");
                ar = res.getInt("Armadura");
                at = res.getInt("Ataque");
                da = res.getInt("Daño");
                confi = 1;
                pstm1.close();
            }
            if(confi == 1){
                String q2 = "INSERT INTO Usuario VALUES ('"+u+"','"+c+"',0,'"+e+"','Picaro',0,1,0,"+vi+","+en+","+ar+","+at+","+da+")";
                try(PreparedStatement pstm2 = this.getConexion().prepareStatement(q2)){
                    pstm2.executeQuery();
                    resu = true;
                    pstm2.close();
                }
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de consulta");
        }
        return resu;
    }
    
    public boolean nuevoMago(String u, String c, String e){
        boolean resu = false;
        return resu;
    }
    
    public boolean nuevoGuerrero(String u, String c, String e){
        boolean resu = false;
        return resu;
    }
}