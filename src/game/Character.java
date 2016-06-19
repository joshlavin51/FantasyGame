package game;

public abstract class Character {
// Character info	
	protected int health;
	protected int maxHealth;
	protected double power;
	protected double defense;
	protected double speed;
	protected Skill sk1;
	protected Skill sk2;
	protected Skill sk3;
	protected Skill sk4;
	protected Skill sk5;
	


// Constructor
	public Character(){
		
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
	
	public double getPower(){
		return power;
	}
	public double getDefense(){
		return defense;
	}
	public double getSpeed(){
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
	public void restoreHealth(double amount){
		health += maxHealth * (1 - amount) ;
		if(health > maxHealth){
			health = maxHealth;
		}
	}
	
	
		
	// Decreases Character health by set amount
	public void takeDamage(double amount){
		health -= amount;
		/*if (health <= 0){
			Character dies. Game Over.
		}
		*/
	}
	
	// Increases character's total power by set amount
	public void alterPower(double amount){
		power *= amount;
	}
	public void setPower(double amount){
		power = amount;
	}
	public void alterSpeed(double amount){
		speed *= amount;
	}
	public void setSpeed(double amount){
		power = amount;
	}
	public void alterDefense(double amount){
		defense *= amount;
	}
	public void setDefense(double amount){
		power = amount;
	}

	
	
	
	
}
