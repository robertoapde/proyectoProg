package Clases;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Combate {
    public boolean turno;
    
    public Combate(){
        turno= true; 
    }
   
    public static void main(String[] args) {
        Guerrero g =new Guerrero();
        Mago m= new Mago();
        Enemigo e= new Enemigo();
        Picaro p = new Picaro();
        ArrayList A= new ArrayList();
                
        do{
            
        if(g.getTurno()==true){
            System.out.println("Es tu turno heroe");     
            
        try{
            System.out.println(g.info());
            g.subirNivel();
            System.out.println(g.info());
            
            System.out.println("1.Ataque");
            System.out.println("2.Defensa");
            System.out.println("3.Ataque Especial");
            System.out.println("4.Mochila");
            System.out.println("5.Huir");

            Scanner entrada = new Scanner(System.in);
            int menu = entrada.nextInt();

            switch (menu) {
		case 1:
                    g.Atacar();
                    if (g.golpe > e.Armadura) {
                    e.PV = e.PV - g.daño;
                    if(e.PV<=0){
                    g.Oro=g.Oro+e.Oro;
                    g.Experiencia=g.Experiencia+e.Experiencia;
                    }else
                        System.out.println("Has fallado el ataque");
                    }
		break;
                    
                case 2:
                    g.AtaqueEspecial();
                    if (g.golpe > e.Armadura) {
                    e.PV = e.PV - g.daño;
                    if(e.PV<=0){
                    g.Oro=g.Oro+e.Oro;
                    g.Experiencia=g.Experiencia+e.Experiencia;
                    }else
                        System.out.println("Has fallado el ataque");
                    }
		break;
                    
                case 3:
                    g.Defensa();
		break;
                    
                case 4:
                    //Mochila
		break;
                
                case 5:
                    //btnHuir
		break;
            }
            
        }catch(Exception ex){
         JOptionPane.showMessageDialog(null, "Error");
        }   
        }else 
            System.out.println("El enemigo se dispone a atacar");  
            e.Atacar();
            if (e.golpe > g.Armadura) {
                g.PV = g.PV - e.daño;
                if(g.PV<=0)
                g.Experiencia=g.Experiencia-(25*g.Nivel*3);
                g.Oro=g.Oro-(5*4*g.Nivel);
                if(g.Experiencia<0){
                g.Experiencia=0;
                }else
	System.out.println("Has fallado el ataque");
	}
        }while(g.PV>0||e.PV>0);
    }
}