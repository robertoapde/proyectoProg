package Clases;

public class Picaro {
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
      protected int Huir;
    
         
 public Picaro (int PV,int PE,int Armadura,int daño,int ataque,int oro, int experiencia){
      this.PV = PV;
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
    } 
   
    public void subirNivel(){
     int  armadura = this.Armadura + 1;
     int pv = this.PV +6;
     int pe = this.PE +2;
     int daño = this.daño +2;
     int ataque = this.ataque +2;
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
    
    public void Huir(){
        int s=(int) (Math.random()*(3)+1);     
    }
}
