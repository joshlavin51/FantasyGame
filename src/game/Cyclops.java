package game;

public class Cyclops extends Character{
	public Cyclops(){
		super();
		health = 120;
		maxHealth = 120;
		mana = 25;
		maxMana = 25;
		power = 1.2;
		defense = 1.1;
		speed = 2;
	}	
	// Club Smash
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
