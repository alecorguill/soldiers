package soldiers;
//Implementation of a weak soldier, basicaly receive all dmg
public class WeakSoldier extends Soldier{
    
    public WeakSoldier(int hp, int power,String name){
	this.hp = hp;
	this.power = power;
	this.name = name;
    }
    
    void setterHp(int damage){
	this.hp -= damage; //takes all dmg
    }
    
}

    