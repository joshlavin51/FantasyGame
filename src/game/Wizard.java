package game;

public class Wizard extends Character{

	public Wizard() {
		super();
		health = 95;
		maxHealth = 95;
		mana = 50;
		maxMana = 50;
		power = 1.2;
		defense = .8;
		speed = 5;
	}
	// Fireball
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
