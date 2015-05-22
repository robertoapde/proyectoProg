package Clases;
public class Guerrero{
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
    protected int tempGolpe;
    protected int Huir;
   
    
  public Guerrero (){
      this.PV = 10;
      this.PE= 3;
      this.Armadura = 10;
      this.daño=5;
      this.ataque=1;  
      this.golpe=0;
      this.Defensa=0;
      this.turno=true;
      this.Huir=0;
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
     public boolean getTurno(){
        return turno;
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
        
        if(Defensa<4){
            Defensa=Defensa+2;
            Armadura=Armadura+Defensa;
        }else{       
        }
    }
   
    public void Huir(){
        int s=(int) (Math.random()*(3)+1);     
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
