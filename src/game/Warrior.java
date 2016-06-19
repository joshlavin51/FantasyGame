package game;

public class Warrior extends Character{
	
	public Warrior(){
		super();
		health = 1050;
		maxHealth = 1050;
		power = 1.1;
		defense = .9;
		speed = 48;
		name = "The Orc Warrior";
		sk1 = new Skill("Bash", "Bash your opponent with your weapon.", 
				this.getName() + " bashes his opponent.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk2 = new Skill("Regeneration", "Heal back some of your health.", 
				this.getName() + " heals some of his health.", 0.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, true, .3);

		sk3 = new Skill("Dangerous Blow", "Deal more damage with your weapon but leave yourself exposed.", 
				this.getName() + " deals heavy damage to his opponent, leaving himself vulnerable.", 1.2, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 0.8, 1.0,
				1.0, false, 1.0);

		sk4 = new Skill("Rage", "Become enraged to increase your power, defense, and speed.", 
				this.getName() + " becomes enraged.", 0.0, false,
				false, false, false, 1.0, 1.0, 1.1, 1.0, 1.1, 1.0,
				1.1, false, 1.0);

		sk5 = new Skill("Giant Slayer", "Deal extra damage to more powerful opponents.", 
				this.getName() + " uses his opponent's power against them.", 0.8, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

	}	
	
}
