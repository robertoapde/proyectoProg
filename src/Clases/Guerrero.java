package Clases;
public class Guerrero {
    private int PV;
    private int PE;
    private int Armadura;
    private int daño;
    private int ataque;
    
  public Guerrero (){
      this.PV = 10;
      this.PE= 2;
      this.Armadura = 10;
      this.daño=5;
      this.ataque=1;
  }
  public void subirNivel(){
     int  armadura = this.Armadura + 1;
     int pv = this.PV +10;
     int pe = this.PE +1;
     int daño = this.daño +1;
     int ataque = this.ataque+1;
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
      this.Armadura = armadura;
  }
     public void setDaño( int daño){
      this.daño = daño;
  }
       public void setAtaque( int ataque){
      this.daño = ataque;
  }
}
