package Clases;

public class Enemigo {
    protected int PV;
    protected int Armadura;
    protected int daño;
    protected int Experiencia;
    protected int Nivel;
    protected int Oro;
    protected int ataque;
    protected int golpe;
    
    
 public Enemigo(int PV,int Armadura,int daño,int ataque){
      this.PV = PV;
      this.Armadura = Armadura;
      this.daño=daño;
      this.ataque=ataque;  
      this.golpe=0;
  
    }

 public Enemigo() {
      this.PV = 6;
      this.Armadura = 7;
      this.daño=3;
      this.ataque=5;  
      this.golpe=0;
    }
    
    public String info(){
        return "\nPV: " +PV+"\nArmadura: "+Armadura+"\nDaño: "+daño+"\nAtaque: "+ataque;
    }
    
    public int getPV(){
        return PV;  
    }
    public int getOro(){
        return Oro;  
    }
    public int getExperiencia(){
        return Experiencia;  
    }
    public int getGolpe(){
      return golpe;
    }
    public int getNivel(){
      return Nivel;
    }
    public int getArmadura(){
        return Armadura;  
    }
    public int getDaño(){
        return daño;  
    }
    public int getAtaque(){
        return ataque;  
    }
  
    public void setPV( int pv){
      this.PV = pv;
  }
    public void setArmadura( int armadura){
      this.Armadura = armadura;
  }
    public void setDaño( int daño){
      this.daño = daño;
  }
    public void setExperiencia( int experiencia){
      this.Experiencia = experiencia;
   }
    public void setNivel( int nv){
      this.Nivel = nv;
   }
    public void setOro( int money){
      this.Oro = money;
   }
    public void setAtaque( int at){
      this.ataque = at;
   }
  
   public void Atacar() {
       golpe=(int)(Math.random()*(20)+1);
       golpe= golpe+ ataque;        
   }
}