package soldiers;
//Implementation of a weak soldier, basicaly receive all dmg
public class WeakSoldier extends Soldier{
    //Constructor
    public WeakSoldier(int hp, int power,String name){
	this.hp = hp;
	this.power = power;
	this.name = name;
    }

    public void attack(Soldier s){
	s.setterHp(-this.power);
    }
    
}

    