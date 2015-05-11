
package MVC;
public class Guerrero {
    private int PV;
    private int PE;
    private int Armadura;
    private int daño;
    private int ataque;
    
  public Guerrero (){
      this.PV = 10;
      this.PE= 2;
      this.Armadura = 18;
      this.daño=5;
      this.ataque=1;
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
