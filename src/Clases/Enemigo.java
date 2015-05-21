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
    
    public Enemigo(){
        int golpe=0;
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
	int golpe=(int) (Math.random()*(20)+1);
        golpe= golpe+ ataque;
            
}
}