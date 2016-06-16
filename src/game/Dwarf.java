package game;

public class Dwarf extends Character{
	public Dwarf(){
		super();
		health = 105;
		maxHealth = 105;
		mana = 45;
		maxMana = 45;
		power = 1;
		defense = 1.2;
		speed = 3;
	}	
	// Hammer Slammer
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

