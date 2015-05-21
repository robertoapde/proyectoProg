/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

    public class Mago{
        protected int PV;
        protected int PE;
        protected int Armadura;
        protected int daño;
        protected int ataque;
        protected int Arma;
        protected int Oro;
        protected int Experiencia;
        protected boolean turno;
        protected int golpe;
        protected int Defensa;
        protected int Nivel;
    
      public Mago (){
      this.PV = 4;
      this.PE= 6;
      this.Armadura = 10;
      this.daño=10;
      this.ataque=1;
      this.golpe=0;
      this.Defensa=0;
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
    
    public int getPV(){
        return PV;  
    }
    public int getPE(){
        return PE;  
    }
    public int getOro(){
        return Oro;  
    }
    public int getExperiencia(){
        return Experiencia;  
    }
    public int getgolpe(){
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
    public int getArma(){
        return Arma;  
    }
    public void setPV( int pv){
      this.PV = pv;
    }    
    public void setPE( int pe){
      this.PE = pe;
    }
    public void setOro( int o){
      this.Oro = o;
    }
    public void setExperiencia( int px){
      this.Experiencia = px;
    }
    public void setgolpe( int gp){
      this.golpe = gp;
    }
    public void setNivel(int nv){
      this.Nivel=nv;
    }
    public void setArmadura( int armadura){
      this.Armadura = Armadura;
    }
    public void setDaño( int daño){
      this.daño = daño;
    }
    public void setAtaque( int ataque){
      this.ataque = ataque;
    }
    public boolean getTurno(){
        return turno;
    }
    public void setTurno (boolean t){
         turno=t;
    }
    public void indicarTurno(){   
        if(getTurno()==true){
            System.out.println("Es tu turno heroe");
        }else 
            System.out.println("El enemigo se dispone a atacar");
    }
    public void Atacar() {
	int golpe=(int) (Math.random()*(20)+1);
        golpe= golpe+ ataque;        
    }
    
    public void Defensa(){
        if(Defensa<=4){
        ataque=ataque-2;
        Defensa=Defensa+2;
        Armadura=Armadura+Defensa;
        }else
        System.out.println("Tu DEFENSA esta al MÁXIMO");
    }
    
    public void AtaqueEspecial() {
        if(PE>=4){
	int golpe=(int) (Math.random()*(20)+1);
        golpe= golpe+ ataque;
                PE=PE-4;
        }else
            System.out.println("No tienes suficiente energía");
    }    
}
