package game;

public class Dwarf extends Character{
	public Dwarf(){
		super();
		health = 1020;
		maxHealth = 1020;
		power = .8;
		defense = 1.2;
		speed = 30;
		name = "The Dwarf";
		sk1 = new Skill("Pound", "Hit your opponent with your hammer.", 
				this.getName() + " pounds his opponent with his hammer.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk2 = new Skill("Forge Armor", "Forge more powerful armor and increase your Defenses.", 
				this.getName() + " makes new armor in preparation for battle.", 0.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.3, 1.0,
				1.0, false, 1.0);

		sk3 = new Skill("Hammer Slam", "Slam your opponent with your hammer and lower their defense.", 
				this.getName() + " slams his opponent with his hammer, lowering their defense.", 0.8, false,
				false, false, false, 1.0, 1.0, 1.0, 0.7, 1.0, 1.0,
				1.0, false, 1.0);

		sk4 = new Skill("Staggering Blow", "A crippling attack which lowers your opponent's speed.", 
				this.getName() + " staggers his opponent with a crippling blow, lowering their speed.", 0.8, false,
				false, false, false, 1.0, 0.7, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk5 = new Skill("Feed the Fire", "Remove your extra armor and deal damage based on how much you removed.", 
				this.getName()+ " melts down his extra armor to fuel a powerful attack.", 0.8, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

	}	
	
	

}

