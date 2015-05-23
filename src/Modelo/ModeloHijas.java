package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloHijas extends Database{
    
    public ModeloHijas(){
    }
    
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column){  
            return false;  
        }

    }
    
    public DefaultTableModel getTablaTienda(){
        
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
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
        
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
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
        String[] info = new String[11];
        String q1 = "SELECT Nivel, Clase, Experiencia, Oro, PV, PE, PVMaximo, PEMaximo, Arma, Equipo, ExpMax FROM Usuario WHERE Nombre = '"+u+"'";
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
            info[8] = res.getString("Arma");
            info[9] = res.getString("Equipo");
            info[10] = String.valueOf(res.getInt("ExpMax"));
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
                    JOptionPane.showMessageDialog(null, "Contraseña modificada.");
                    } catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error al modificar.");
                    ex.getStackTrace();
                }
                }else{
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
                }
         }else{
                JOptionPane.showMessageDialog(null, "Error al conectar.");
            } 
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al consultar valores.");
        }
        return res;
    }
    
    public DefaultTableModel getTablaMochila(String u){
        
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
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
  
    public int comprarObjetoTienda(String usuario, String objeto){
        int resu = 0;
        int mochi = 0;
        String nombre = "";
        int precio = 0;
        String tipo = "";
        int efecto = 0;
        int maxId = 0;
        String q1 = "SELECT Nombre, Precio, Tipo, Efecto FROM Tienda WHERE Nombre = '"+objeto+"'";
        String q2 = "SELECT IdMochila FROM Mochila WHERE NombreUsuario = '"+usuario+"'";
        String q3 = "SELECT max(IdObjeto) FROM Objeto";
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            nombre = res1.getString("Nombre");
            precio = res1.getInt("Precio");
            tipo = res1.getString("Tipo");
            efecto = res1.getInt("Efecto");
            res1.close();
            pstm1.close();
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement(q2);
                ResultSet res2 = pstm2.executeQuery();
                res2.next();
                mochi = res2.getInt("IdMochila");
                res2.close();
                pstm2.close();
                try{
                    PreparedStatement pstm3 = this.getConexion().prepareStatement(q3);
                    ResultSet res3 = pstm3.executeQuery();
                    res3.next();
                    maxId = res3.getInt("max(IdObjeto)");
                    maxId = maxId + 1;
                    res3.close();
                    pstm3.close();
                    try{
                        String q4 = "INSERT INTO Objeto (IdObjeto, Nombre, Precio, Tipo, Efecto, IdMochila) "
                                +"VALUES("+maxId+", '"+nombre+"', "+precio+", '"+tipo+"', "+efecto+", "+mochi+")";
                        PreparedStatement pstm4 = this.getConexion().prepareStatement(q4);
                        pstm4.execute();
                        pstm4.close();
                        resu = 1;
                    }catch(SQLException e){
                        JOptionPane.showMessageDialog(null, "Error de SQL al insertar objeto.");
                    }
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Error de SQL al obtener MAX ID de objeto.");
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error de SQL al obtener mochila.");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de SQL al obtener datos de objeto.");
        }
        return resu;
    }
    
    public DefaultTableModel getTablaMochilaVender(String u){
        
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
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
            int p = Integer.parseInt(res.getString("Precio"));
            p = p/5;
            data[i][1] = String.valueOf(p);
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
    public void actualizarBD(String usuario , String nivel , String experiencia, String oro, String pv, String pe, String pvm, String pem, String arma, String equipo, String expmax){
        
        String q = "UPDATE Usuario set Nombre = '"+usuario+"', Nivel = "+nivel+", Experiencia = "+experiencia+", Oro = "+oro+", PV = "+pv+", PE = "+pe+", PVMaximo = "+pvm+", PEMaximo = "+pem+", Arma = '"+arma+"', Equipo = '"+equipo+"', ExpMax = "+expmax+" WHERE Nombre = '"+usuario+"'";
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement(q);
                pstm2.execute();
                pstm2.close();
            } catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al actualizar.");
                ex.getStackTrace();
            }
    }
    
    public DefaultTableModel getTablaMochilaCombate(String u){
        
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        String[] columnNames = {"Nombre","Efecto"};
        int registros = 0;

        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM Objeto WHERE IdMochila = (SELECT IdMochila FROM Mochila WHERE NombreUsuario = '"+u+"') AND Tipo LIKE 'usable_%'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        
        Object[][] data = new String[registros][5];
        
        try{
          
        PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Nombre, Efecto FROM Objeto WHERE IdMochila = (SELECT IdMochila FROM Mochila WHERE NombreUsuario = '"+u+"') AND Tipo LIKE 'usable%'");
        ResultSet res = pstm.executeQuery();
        int i=0;
        while(res.next()){
            data[i][0] = res.getString("Nombre");
            data[i][1] = res.getString("Efecto");
            i++;
        }
        res.close();
        
        tablemodel.setDataVector(data, columnNames);
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }
    
    public boolean venderObjetoMochila(String usuario,int precio,String objeto){
        boolean res = false;
        String q1= "SELECT IdObjeto FROM Objeto WHERE Nombre = '"+objeto+"' limit 1";
        String q2= "SELECT Oro FROM Usuario WHERE Nombre='"+usuario+"'";
        int idObjeto ;
        int oro;
        
        try{
               
                PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
                ResultSet res1 = pstm1.executeQuery();
                res1.next();
                idObjeto= res1.getInt("IdObjeto");
                res1.close();
                pstm1.close();
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement(q2);
                ResultSet res2 = pstm2.executeQuery();
                res2.next();
                oro= res2.getInt("Oro");
                res2.close();
                pstm2.close();
                    try{
                       oro = oro + precio;
                       String q3 = "UPDATE Usuario SET Oro = "+oro+" WHERE Nombre = '"+usuario+"'";
                       PreparedStatement pstm3 = this.getConexion().prepareStatement(q3);
                       pstm3.execute();
                       pstm3.close();
                       
                        try{
                           String q4 = "DELETE FROM Objeto WHERE IdObjeto = "+idObjeto;
                           PreparedStatement pstm4 = this.getConexion().prepareStatement(q4);
                           pstm4.execute();
                           pstm4.close();
                           JOptionPane.showMessageDialog(null, "Objeto vendido.");
                           JOptionPane.showMessageDialog(null, "Has ganado algo de oro.");
                           res=true;
                        } catch(SQLException ex){
                           JOptionPane.showMessageDialog(null, "Error al eliminar.");
                           ex.getStackTrace();
                        }
                    } catch(SQLException ex){
                       JOptionPane.showMessageDialog(null, "Error al modificar.");
                       ex.getStackTrace();
                    }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error de SQL al obtener oro.");
            }
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error de SQL al obtener objeto.");
        }
      return res;
    }
    
    public int soltarObjeto(String objeto, String usuario){
        int resu = 0;
        String q1 = "SELECT IdObjeto FROM Objeto WHERE Nombre = '"+objeto+"' AND IdMochila = (SELECT IdMochila FROM Mochila WHERE NombreUsuario = '"+usuario+"') limit 1";
        int idObjeto;
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            idObjeto= res1.getInt("IdObjeto");
            res1.close();
            pstm1.close();
            try{
                String q4 = "DELETE FROM Objeto WHERE IdObjeto = "+idObjeto;
                PreparedStatement pstm4 = this.getConexion().prepareStatement(q4);
                pstm4.execute();
                pstm4.close();
                resu = 1;
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al eliminar.");
                ex.getStackTrace();
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de SQL al obtener objeto.");
        }
        return resu;
    }
    
    public int equiparEquipo(String objeto, int armadura, String usuario){
        int resu = 0;
        int antiguaArmadura = obtenerArmadura(usuario);
        int nuevaArmadura = antiguaArmadura + armadura;
        String q1 = "UPDATE Usuario SET Equipo = '"+objeto+"', Armadura = "+nuevaArmadura+" WHERE Nombre = '"+usuario+"'";
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
            pstm1.execute();
            pstm1.close();
            resu = 1;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al insertar.");
            ex.getStackTrace();
        }
        return resu;
    }
    
    public int desequiparEquipo(String objeto, String usuario){
        int resu = 0;
        String q1 = "UPDATE Usuario SET Equipo = '', Armadura = (Armadura - (SELECT Efecto FROM Tienda WHERE Nombre = '"+objeto+"')) WHERE Nombre = '"+usuario+"'";
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
            pstm1.execute();
            pstm1.close();
            resu = 1;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al insertar.");
            ex.getStackTrace();
        }
        return resu;
    }
    
    public int equiparArma(String objeto, int daño, String usuario){
        int resu = 0;
        int antiguoDaño = obtenerDaño(usuario);
        int nuevoDaño = antiguoDaño + daño;
        String q1 = "UPDATE Usuario SET Arma = '"+objeto+"', Daño = "+nuevoDaño+" WHERE Nombre = '"+usuario+"'";
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
            pstm1.execute();
            pstm1.close();
            resu = 1;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al insertar.");
            ex.getStackTrace();
        }
        return resu;
    }
    
    public int desequiparArma(String objeto, String usuario){
        int resu = 0;
        String q1 = "UPDATE Usuario SET Arma = '', Daño = (Daño - (SELECT Efecto FROM Tienda WHERE Nombre = '"+objeto+"')) WHERE Nombre = '"+usuario+"'";
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement(q1);
            pstm1.execute();
            pstm1.close();
            resu = 1;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al insertar.");
            ex.getStackTrace();
        }
        return resu;
    }
    
  public int obtenerDaño(String usuario){
        
        String q = "SELECT Daño FROM Usuario WHERE Nombre = '"+usuario+"'";
        int daño=0;
        try{
               
                PreparedStatement pstm1 = this.getConexion().prepareStatement(q);
                ResultSet res1 = pstm1.executeQuery();
                res1.next();
                daño = res1.getInt("Daño");
                res1.close();
                pstm1.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo obtener el daño");
            System.err.println( e.getMessage() );
        }
        return daño;
    }
  
    public int obtenerArmadura(String usuario){
        
        String q = "SELECT Armadura FROM Usuario WHERE Nombre = '"+usuario+"'";
        int armadura=0;
        try{
               
                PreparedStatement pstm1 = this.getConexion().prepareStatement(q);
                ResultSet res1 = pstm1.executeQuery();
                res1.next();
                armadura = res1.getInt("Armadura");
                res1.close();
                pstm1.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo obtener la armadura");
            System.err.println( e.getMessage() );
        }
        return armadura;
    }
     
    public int obtenerAtaque(String usuario){
        
        String q = "SELECT Ataque FROM Usuario WHERE Nombre = '"+usuario+"'";
        int ataque=0;
        try{
               
                PreparedStatement pstm1 = this.getConexion().prepareStatement(q);
                ResultSet res1 = pstm1.executeQuery();
                res1.next();
                ataque = res1.getInt("Ataque");
                res1.close();
                pstm1.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo obtener el ataque");
            System.err.println( e.getMessage() );
        }
        return ataque;
    }
     public int obtenerEquipo(String usuario){
        
        String q = "SELECT Efecto FROM Tienda WHERE Nombre =(SELECT Equipo FROM Usuario WHERE Nombre ='"+usuario+"')" ;
        int efecto=0;
        try{
                PreparedStatement pstm1 = this.getConexion().prepareStatement(q);
                ResultSet res1 = pstm1.executeQuery();
                res1.next();
                efecto = res1.getInt("Efecto");
                res1.close();
                pstm1.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo obtener el Efecto ");
            System.err.println( e.getMessage() );
        }
        return efecto;
    }
    public String[][] datosEnemigo(int nivel){
        String[][] datosE;
        int nivelU = nivel;
        int n1 = nivelU - 1;
        int n2 = nivelU;
        int n3 = nivelU + 1;
        int i;
        if(nivelU == 1){
            datosE = new String[2][8];
            String q = "SELECT * FROM Enemigo WHERE Nivel IN ("+n2+","+n3+")";
            
            try{
                PreparedStatement pstm1 = this.getConexion().prepareStatement(q);
                ResultSet res1 = pstm1.executeQuery();
                i = 0;
                while(res1.next()){
                    datosE[i][0] = res1.getString("Nombre");
                    datosE[i][1] = String.valueOf(res1.getInt("Vida"));
                    datosE[i][2] = String.valueOf(res1.getInt("Nivel"));
                    datosE[i][3] = String.valueOf(res1.getInt("Experiencia"));
                    datosE[i][4] = String.valueOf(res1.getInt("DañoEnemigo"));
                    datosE[i][5] = String.valueOf(res1.getInt("ArmaduraEnemigo"));
                    datosE[i][6] = String.valueOf(res1.getInt("Oro"));
                    datosE[i][7] = String.valueOf(res1.getInt("AtaqueEnemigo"));
                    i++;
                } 
                res1.close();
                pstm1.close();
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }
        }else{
            datosE = new String[3][8];
            String q = "SELECT * FROM Enemigo WHERE Nivel IN ("+n1+","+n2+","+n3+")";
            
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement(q);
                ResultSet res2 = pstm2.executeQuery();
                i = 0;
                while(res2.next()){
                    datosE[i][0] = res2.getString("Nombre");
                    datosE[i][1] = String.valueOf(res2.getInt("Vida"));
                    datosE[i][2] = String.valueOf(res2.getInt("Nivel"));
                    datosE[i][3] = String.valueOf(res2.getInt("Experiencia"));
                    datosE[i][4] = String.valueOf(res2.getInt("DañoEnemigo"));
                    datosE[i][5] = String.valueOf(res2.getInt("ArmaduraEnemigo"));
                    datosE[i][6] = String.valueOf(res2.getInt("Oro"));
                    datosE[i][7] = String.valueOf(res2.getInt("AtaqueEnemigo"));
                    i++;
                } 
                res2.close();
                pstm2.close();
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }
        }
        return datosE;
    }
    
    public void subirNivel(String usuario, String clase){
        String q = "";
        if(clase.equals("Picaro")){
            q = "UPDATE Usuario SET PVMaximo = PVMaximo + 7, PEMaximo = PEMaximo + 2, PV = PVMaximo, PE = PEMaximo, Daño = Daño + 2, Armadura = Armadura + 1, Ataque = Ataque + 2 WHERE Nombre = '"+usuario+"'";
        }else if(clase.equals("Mago")){
            q = "UPDATE Usuario SET PVMaximo = PVMaximo + 5, PEMaximo = PEMaximo + 4, PV = PVMaximo, PE = PEMaximo, Daño = Daño + 3, Armadura = Armadura + 1, Ataque = Ataque + 3 WHERE Nombre = '"+usuario+"'";
        }else if(clase.equals("Guerrero")){
            q = "UPDATE Usuario SET PVMaximo = PVMaximo + 10, PEMaximo = PEMaximo + 1, PV = PVMaximo, PE = PEMaximo, Daño = Daño + 1, Armadura = Armadura + 1, Ataque = Ataque + 1 WHERE Nombre = '"+usuario+"'";
        }
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement(q);
            pstm1.execute();
            pstm1.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al insertar.");
            ex.getStackTrace();
        }
    }
}