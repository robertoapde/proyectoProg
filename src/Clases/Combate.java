package Clases;

import javax.swing.JOptionPane;

public class Combate {
    public char heroe;
    public char enemigo;
    public boolean turno;
    
    
    public Combate(){
        heroe= 'A';
        enemigo= 'B';
        turno= true; 
    }
    
    public void setTurno (boolean t){
         turno=t;
    }
    
    public char getheroe() {
        return heroe;
    }        
    
    public char getenemigo(){
        return enemigo;
    }
    
    public boolean getTurno(){
        return turno;
    }
    
    public void indicarTurno(){   
        if(getTurno()==true){
            System.out.println("Es tu turno heroe");
        }else 
            System.out.println("El enemigo se dispone a atacar");
    }
    
     public char getLucha(){   
        if(getTurno()==true){       
                return heroe;   
        }else         
                return enemigo;      
    }
  
    public static void main(String[] args) {
        Guerrero g =new Guerrero();
        Mago m= new Mago();
        Enemigo e= new Enemigo();
        Picaro p = new Picaro();
        
        /*do{
            
        }while(g.PV>0||e.PV>0);
        */
        try{
            System.out.println(g.info());
            g.subirNivel();
            System.out.println(g.info());
        }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "Error");
    }
    }
}