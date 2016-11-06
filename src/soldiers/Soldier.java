package soldiers;

//Abstact class decribing a soldier in general

abstract class Soldier {
    protected int hp; //Health points of the soldier
    protected int power; //Ability power of the solider, represents how strong he is
    protected String name;
    
    //Method to attack another soldier.
    protected void attack(Soldier s){
	s.setterHp(this.power);
    }
    //Method that react to the attack based on the special ability of the soldier
    //it is abstract so needs to be implemented for each type of soldier

    abstract void setterHp(int damage);
    
    public int getterHp(){
	return this.hp;
    }
    public int getterPower(){
	return this.power;
    }
    public String getterName(){
	return this.name;
    }


    public String toString(){
	String str = "Name=" + this.name +", HP=" + this.hp + ", POWER=" + this.power;
	return str;
	    }

}
    
    