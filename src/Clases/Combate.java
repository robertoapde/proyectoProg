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
       
        
        do{

            if(g.getTurno()==true){
                
                try{
                    System.out.println("---------Tu Turno----------");
                    System.out.println("1.Ataque");
                    System.out.println("2.Ataque Especial");
                    System.out.println("3.Defensa");
                    System.out.println("4.Mochila");
                    System.out.println("5.Huir");

                    Scanner entrada = new Scanner(System.in);
                    int menu = entrada.nextInt();

                    switch (menu) {
                        case 1:          
                            g.Atacar();
                            if (g.golpe > e.Armadura) {
                                     System.out.println("Le has dado campeon.");
                                    e.PV = e.PV - g.daño;
                                     System.out.println("Daño Hecho:"+ g.daño);
                                    System.out.println("Enemigo: " + e.info());
                                if(e.PV<=0){
                                    g.Oro=g.Oro+e.Oro;
                                    g.Experiencia=g.Experiencia+e.Experiencia;
                                }
                              
                            }else{
                                    System.out.println("Has fallado el ataque.");
                                    System.out.println("Enemigo: " + e.info());
                                }
                              g.setTurno(false);
                        break;

                        case 2:
                            g.AtaqueEspecial();                 
                            if (g.golpe > e.Armadura) {
                                System.out.println("¿Eso era personal?BOOM.");
                                e.PV = e.PV - g.daño;
                                System.out.println("Daño Hecho:"+ g.daño);
                                System.out.println("Enemigo: " + e.info());
                                if(e.PV<=0){
                                    g.Oro=g.Oro+e.Oro;
                                    g.Experiencia=g.Experiencia+e.Experiencia;
                                 }
                             
                            }else{
                                    System.out.println("Has fallado el ataque");
                                    System.out.println("Enemigo: " + e.info());
                                }
                              g.setTurno(false);
                        break;

                        case 3:
                         if(g.Defensa<4){
                                g.Defensa();
                                System.out.println("DURO como la PIEDRA");
                                System.out.println("Guerrero: "+ g.info());
                                g.setTurno(false); 
                                
                         }else{
                               System.out.println("Tu DEFENSA esta al MÁXIMO");
                               g.setTurno(true);
                               System.out.println("Guerrero: "+ g.info());
                         }
                          
                            
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
               
            }else{ 
                System.out.println("---------Turno Enemigo----------");
                System.out.println("El enemigo se dispone a atacar");
                e.Atacar();
                if (e.golpe > g.Armadura) {
                    System.out.println("El enemigo ha impactado el ataque");
                    g.PV = g.PV - e.daño;
                    System.out.println("Daño Hecho:"+ e.daño);
                    System.out.println("Guerrero: "+ g.info());
                        if(g.PV<=0){
                            g.Experiencia=g.Experiencia-(25*g.Nivel*3);
                            g.Oro=g.Oro-(5*4*g.Nivel);
                            if(g.Experiencia<0 ){
                                g.Experiencia=0;
                                
                            }
                            if (g.Oro<0){
                                g.Oro=0;
                            }
                        }
                }else{
                    System.out.println(" ");
                    System.out.println("El enemigo ha fallado el ataque");
                    System.out.println("Guerrero: "+ g.info());
                }
                 g.setTurno(true);
            }
            
        }while(g.PV>0 && e.PV>0 && g.Huir != 1);
            if(g.PV == 0){
                System.out.println("Has perdido.");
            }else if(e.PV == 0){
                System.out.println("Has ganado.");
        }
    }
}