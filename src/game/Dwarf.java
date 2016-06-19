package game;

public class Dwarf extends Character{
	public Dwarf(){
		super();
		health = 1070;
		maxHealth = 1070;
		power = .9;
		defense = 1.2;
		speed = 3;
		sk1 = new Skill("Pound", "Hit your opponent with your hammer.", 
				"The dwarf pounds his opponent with his hammer", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk2 = new Skill("Forge Armor", "Forge more powerful armor and increase your Defenses.", 
				"The dwarf makes new armor in preparation for battle", 0.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.3, 1.0,
				1.0, false, 1.0);

		sk3 = new Skill("Hammer Slam", "Slam your opponent with your hammer and lower their defense.", 
				"The dwarf slams his opponent with his hammer, lowering their defense.", 0.8, false,
				false, false, false, 1.0, 1.0, 1.0, 0.7, 1.0, 1.0,
				1.0, false, 1.0);

		sk4 = new Skill("Staggering Blow", "A crippling attack which lowers your opponent's speed.", 
				"The dwarf staggers his opponent with a crippling blow, lowering their speed.", 0.8, false,
				false, false, false, 1.0, 0.7, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk5 = new Skill("Feed the Fire", "Remove your extra armor and deal damage based on how much you removed..", 
				"The dwarf removes his extra armor and uses it to damage his opponent.", 0.8, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

	}	
	
	

}

