package game;

public abstract class Character {
// Character info	
	protected int health;
	protected int maxHealth;
	protected int mana;
	protected int maxMana;
	protected double power;
	protected double defense;
	protected int speed;
	protected Skill sk1;
	protected Skill sk2;
	protected Skill sk3;
	protected Skill sk4;
	protected Skill sk5;
	


// Constructor
	public Character(){
		health = 50;
		mana = 20;
		power = 10.0;
		defense = 1.0;
		speed = 3;
	}
// Accessor methods
	public int getHealth(){
		if (health < 0){
			health = 0;
		}
		return health;
	}
	public int getMaxHealth(){
		return maxHealth;
	}
	
	public int getMana(){
		return mana;
	}
	public int getMaxMana(){
		return maxMana;
	}
	public double getPower(){
		return power;
	}
	public double getDefense(){
		return defense;
	}
	public int getSpeed(){
		return speed;
	}
	public Skill SK1(){
		return sk1;
	}
	public Skill SK2(){
		return sk2;
	}
	public Skill SK3(){
		return sk3;
	}
	public Skill SK4(){
		return sk4;
	}
	public Skill SK5(){
		return sk5;
	}

// Action methods
	// Restores character's health by set amount
	public void restoreHealth(int amount){
		health += amount;
		if(health > maxHealth){
			health = maxHealth;
		}
	}
	
	// Restores character's mana by set amount
		public void restoreMana(int amount){
			mana += amount;
			if(mana > maxMana){
				mana = maxMana;
			}
		}
		
	// Decreases Character health by set amount
	public void takeDamage(int amount){
		health -= amount;
		/*if (health <= 0){
			Character dies. Game Over.
		}
		*/
	}
	//  Decreases Character Mana by set amount
	public void takeManaDamage(int amount){
		mana -= amount;
		if (mana < 0){
			mana = 0;
		}
		
	}
	// Increases character's total power by set amount
	public void addPower(int amount){
		power += amount;
	}
	
	
	
}
