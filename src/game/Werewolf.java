package game;

public class Werewolf extends Character{
	public Werewolf(){
		super();
		health = 100;
		maxHealth = 100;
		mana = 35;
		maxMana = 35;
		power = 1;
		defense = 1;
		speed = 6;
	}	
	// Bite
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
