package game;

public class Demon extends Character{
	
	public Demon(){
		super();
		health = 85;
		maxHealth = 85;
		mana = 40;
		maxMana = 40;
		power = 1.3;
		defense = .7;
		speed = 7;
	}
	
	// Hell Slash
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
