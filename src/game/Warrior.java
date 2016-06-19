package game;

public class Warrior extends Character{
	
	public Warrior(){
		super();
		health = 1050;
		maxHealth = 1050;
		power = 1.1;
		defense = .9;
		speed = 48;
		sk1 = new Skill("Bash", "Bash your opponent with your weapon.", 
				"The orc warrior bashes his opponent.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk2 = new Skill("Regeneration", "Heal back some of your health.", 
				"The orc warrior heals some of his health.", 0.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, true, 1.3);

		sk3 = new Skill("Dangerous Blow", "Deal more damage with your weapon but leave yourself exposed.", 
				"The orc warrior deals heavy damage to his opponent, leaving himself vulnerable.", 1.2, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 0.8, 1.0,
				1.0, false, 1.0);

		sk4 = new Skill("Rage", "Become enraged to increase your power, defense, and speed.", 
				"The orc warrior becomes enraged.", 0.0, false,
				false, false, false, 1.0, 1.0, 1.1, 1.0, 1.1, 1.0,
				1.1, false, 1.0);

		sk5 = new Skill("Giant Slayer", "Deal extra damage to more powerful opponents.", 
				"The orc warrior attacks his giant opponent.", 0.8, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

	}	
	
}
