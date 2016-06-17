package game;

public class Knight extends Character {
	public Knight() {
		super();
		health = 90;
		maxHealth = 90;
		mana = 40;
		maxMana = 40;
		power = .9;
		defense = 1;
		speed = 8;
		sk1 = new Skill("goodasfkjdslkjh", "A quick slash of the sword.", 
				"The bandit slashes with his sword!", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		sk2 = new Skill("Bash", "A fancy slash of the sword.", 
				"The bandit slashes with his sword!", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		sk3 = new Skill("Smash", "A swag slash of the sword.", 
				"The bandit slashes with his sword!", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		sk4 = new Skill("Dash", "A posh slash of the sword.", 
				"The bandit slashes with his sword!", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		sk5 = new Skill("Rash", "A dumb slash of the sword.", 
				"The bandit slashes with his sword!", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		
	}
	

}


