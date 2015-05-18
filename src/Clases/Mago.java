/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Rob
 */
public class Mago {
     private int PV;
    private int PE;
    private int Armadura;
    private int daño;
    private int ataque;
    
  public Mago (){
      this.PV = 4;
      this.PE= 6;
      this.Armadura = 10;
      this.daño=10;
      this.ataque=1;
  }
   public void subirNivel(){
     int  armadura = this.Armadura + 1;
     int pv = this.PV +4;
     int pe = this.PE +4;
     int daño = this.daño +3;
     int ataque = this.ataque+3;
      setArmadura(armadura);
      setPV(pv);
      setPE(pe);
      setDaño(daño);
       setAtaque(ataque);
  }
   public void setPV( int pv){
      this.PV = pv;
  }
   public void setPE( int pe){
      this.PE = pe;
  }
    public void setArmadura( int armadura){
      this.Armadura = Armadura;
  }
     public void setDaño( int daño){
      this.daño = daño;
  }
       public void setAtaque( int ataque){
      this.daño = ataque;
  }
}
