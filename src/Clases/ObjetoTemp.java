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
public class ObjetoTemp {
    protected int PV;
    protected int PE;
    protected int MaxPV;
    protected int MaxPE;
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
    protected int Huir;
    protected int ExpMax;
    protected int Equipo;
    
  public ObjetoTemp (int PV,int PE, int MPV,int MPE,int Armadura,int daño,int ataque,int oro, int experiencia, int pxMax,int nivel){
      this.PV = PV;
      this.MaxPE= MPE;
      this.MaxPV = MPV;
      this.PE= PE;
      this.Armadura = Armadura;
      this.daño=daño;
      this.ataque=ataque;  
      this.golpe=0;
      this.Defensa=0;
      this.Oro=oro;
      this.Experiencia=experiencia;
      this.turno=true;
      this.Huir=0;
      this.ExpMax=pxMax;
      this.Nivel=nivel;
    } 

    public int getPV(){
        return PV;  
    }
    public int getPE(){
        return PE;  
    }
    public int getMaxPV(){
        return MaxPV;  
    }
    public int getMaxPE(){
        return MaxPE;  
    }
    public int getExpMax(){
      return ExpMax;
    }
    public int getOro(){
        return Oro;  
    }
    public int getEquipo(){
        return Equipo;  
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
    public int getArma(){
        return Arma;  
    }
    public boolean getTurno(){
        return turno;
    }
    public int getDefensa(){
        return Defensa;
    }
    public int getHuir(){
        return Huir;
    }
    public String info(){
       return "\nPV: " +PV+"\nArmadura: "+Armadura+"\nDaño: "+daño+"\nAtaque: "+ataque;
    }
    public void setPV( int pv){
      this.PV = pv;
    }
    public void setPE( int pe){
      this.PE = pe;
    }
    public void setMaxPV(int MPV){
        this.MaxPV=MPV;  
    }
    public void setMaxPE(int MPE){
        this.MaxPE=MPE;  
    }
    public void setOro( int o){
      this.Oro = o;
    }
    public void setExpMax( int px){
      this.ExpMax = px;
    }
    public void setExperiencia( int px){
      this.Experiencia = px;
    }
    public void setGolpe( int gp){
      this.golpe = gp;
    }
    public void setNivel(int nv){
      this.Nivel=nv;
    }
    public void setArmadura( int armadura){
      this.Armadura = armadura;
    }
    public void setDaño( int daño){
      this.daño = daño;
    }
    public void setAtaque( int ataque){
      this.ataque = ataque;
    }
    public void setTurno (boolean t){
      this.turno=t;
    }
     public void setDefensa (int d){
      this.Defensa=d;
    }
    public void indicarTurno(){   
        if(getTurno()==true){
            System.out.println("Es tu turno heroe");
            
        }else        
            System.out.println("El enemigo se dispone a atacar");
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
    public int Atacar() {
	golpe= (int) (Math.random()*(20)+1);
        golpe= golpe+ ataque;     
        return golpe;
    }
    
    public void Defensa(){   
            Defensa=Defensa+2;
            Armadura=Armadura+Defensa;       
    }
   
    public void Huir(){
        int Huir=(int) (Math.random()*(3)+1);     
    }
    public void AtaqueEspecial() {
        if(PE>=4){
            int golpe=(int) (Math.random()*(20)+1);
            golpe= golpe+ ataque;
            PE=PE-4;
        }else{
            System.out.println("No tienes suficiente energía");
            setTurno(true);
        }
    }    
}

