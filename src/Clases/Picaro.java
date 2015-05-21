package Clases;

public class Picaro {
    private int PV;
    private int PE;
    private int Armadura;
    private int daño;
    private int ataque;
    private int Arma;
    
    public Picaro (){
      this.PV = 10;
      this.PE= 4;
      this.Armadura = 10;
      this.daño=8;
      this.ataque=1;
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
    public void setAtaque( int ataque){
      this.ataque = ataque;
    }
    
    public void Atacar() {
	int golpe=(int) (Math.random()*(20)+1);
        golpe= golpe+ ataque;
            if (golpe > Armadura/*Enemigo.Armadura*/) {
                PV = PV - daño;//(daño+ Arma)
                /*if(Enemigo.PV<=0){
                Oro=Oro+Recompensa;
                Experiencia=Experiencia+px;*/
            }else
	System.out.println("Has fallado el ataque");
	}
    
    public void Defensa(){//Duracion 2 turnos, después del combate debería restaurarse
        /*Defensa=0;
        if(Defensa<=4){*/
        ataque=ataque-2;
        //Defensa=Defensa+2;
        //Armadura=Armadura+Defensa;
        /*}
        else
        System.out.println("No puedes utilizar mas veces DEFENSA");
        */
    }
    
    public void AtaqueEspecial1() {
        /*if(PE>=2){*/
	int golpe=(int) (Math.random()*(20)+1);
        golpe= golpe+ ataque;
            if (golpe > Armadura) {/*Enemigo.Armadura*/
                PV = PV - (daño+5);//(daño+ Arma)
                PE=PE-2;
                /*if(Enemigo.PV<=0){
                Oro=Oro+Recompensa;
                Experiencia=Experiencia+px;
                Defensa=0*/
            }else      
	System.out.println("Has fallado el ATAQUE ESPECIAL!!!");
        /*}else
            System.out.println("No tienes suficiente energía");*/
    }
    
    public void AtaqueEspecial2() {
        /*if(PE>=4){*/
	int golpe=(int) (Math.random()*(20)+1);
        golpe= golpe+ ataque;
            if (golpe > Armadura) {/*Enemigo.Armadura*/
                PV = PV - (daño+10);//(daño+ Arma)
                PE=PE-4;
                /*if(Enemigo.PV<=0){
                Oro=Oro+Recompensa;
                Experiencia=Experiencia+px;
                Defensa=0*/
            }else
	System.out.println("Has fallado el ATAQUE ESPECIAL!!!");
            /*}else
            System.out.println("No tienes suficiente energía");*/
	}
    
    public void AtaqueEspecial3() {
	/*if(PE>=8){*/
        int golpe=(int) (Math.random()*(20)+1);
        golpe= golpe+ ataque;
            if (golpe > Armadura) {/*Enemigo.Armadura*/
                PV = PV - (daño+15);//(daño+ Arma)
                PE=PE-8;
                /*if(Enemigo.PV<=0){
                Oro=Oro+Recompensa;
                Experiencia=Experiencia+px;
                Defensa=0*/
            }else
	System.out.println("Has fallado el ATAQUE ESPECIAL!!!");
            /*}else
            System.out.println("No tienes suficiente energía");*/
	}
    
    public void AtaqueEspecial4() {
	/*if(PE>=11){*/
        int golpe=(int) (Math.random()*(20)+1);
        golpe= golpe+ ataque;
            if (golpe > Armadura) {/*Enemigo.Armadura*/
                PV = PV - (daño+25);//(daño+ Arma)
                PE=PE-11;
                /*if(Enemigo.PV<=0){
                Oro=Oro+Recompensa;
                Experiencia=Experiencia+px;
                Defensa=0*/
            }else
	System.out.println("Has fallado el ATAQUE ESPECIAL!!!");
            /*}else
            System.out.println("No tienes suficiente energía");*/
	}
}
