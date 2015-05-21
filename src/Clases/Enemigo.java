package Clases;

public class Enemigo {
    private int PV;
    private int Armadura;
    private int daño;
    private int Experiencia;
    private int Nivel;
    private int Oro;
    private int ataque;
    
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
            if (golpe > Armadura/*Heroe.Armadura*/) {
                PV = PV - daño;
                /*if(Heroes.PV<=0)
                Experiencia=Experiencia-(25*Nivel*3)
                Oro=Oro-(5*4*Nivel)
                Heroe.Defensa=0
                if(Experiencia<0){
                Experiencia=0;
                */
            }else
	System.out.println("Has fallado el ataque");
	}
}
