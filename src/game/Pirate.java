package game;

public class Pirate extends Character {
	public Pirate(){
		super();
		health = 960;
		maxHealth = 960;
		power = 1.1;
		defense = 1;
		speed = 55;
		sk1 = new Skill("Gash", "Slice at your opponent with your sword.", 
				"The pirate slices at his opponent.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk2 = new Skill("Sidestep", "Counter your opponent's move", 
				"The pirate sidesteps his opponents move and delivers a counterattack", 0.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		sk3 = new Skill("Sea Legs", "Remove all negative status effects and heal you slightly.", 
				"The pirate gains his sea legs.", 0.0, true,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, true, 1.2);

		sk4 = new Skill("Crippling Strike", "Slow your opponent down while attacking.", 
				"The pirate delivers a crippling blow to his opponent, slowing them.", 0.8, false,
				false, false, false, 1.0, 0.7, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk5 = new Skill("Outmaneuver", "Use your opponent’s speed against themself", 
				"The pirate uses his opponent’s speed against themselves", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		
	}	

}

