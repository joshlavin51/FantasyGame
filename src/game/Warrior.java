package game;

public class Warrior extends Character{
	
	public Warrior(){
		super();
		health = 105;
		maxHealth = 105;
		mana = 35;
		maxMana = 35;
		power = 1;
		defense = 1.1;
		speed = 4;
	}	
	// Slam
	public void skill1(Character target){
		target.takeDamage((int)(10 * getPower() / target.getDefense()));
	}
	public void skill2(Character target){
		
	}
	public void skill3(Character target){
		
	}
	public void skill4(Character target){
		
	}
	public void skill5(Character target){
		
	}
}
