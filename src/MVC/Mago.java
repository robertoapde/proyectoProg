/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

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
      this.Armadura = 8;
      this.daño=10;
      this.ataque=0;
  }
   public void subirNivel(){
     int  armadura = this.Armadura + 5;
     int pv = this.PV +5;
     int pe = this.PE +5;
     int daño = this.daño +5;
      setArmadura(armadura);
      setPV(pv);
      setPE(pe);
      setDaño(daño);
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
}
