package game;

public class Bandit extends Character {

	public Bandit() {
		super();
		health = 950;
		maxHealth = 950;
		power = .8;
		defense = 1.1;
		speed = 82;
		name = "The Bandit";
		sk1 = new Skill("Slash", "A quick slash of the sword.", 
				this.getName() + " slashes his opponent with his sword.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		
		sk2 = new Skill("Sandstorm", "Stir up a sandstorm to hinder your opponent.", 
				this.getName() + " stirs up a sandstorm, lowering his opponent's speed and power.", 0.0, false,
				false, false, false, 1.0, 0.8, 1.0, 1.0, 1.0, 0.8,1.0, false, 1.0);
		
		sk3 = new Skill("Critical Strike", "Risk using a weaker attack to possibly deal tons of damage.", 
				this.getName() + " takes a risky strike at his opponent.", 0.7, false, false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0); //deals 1.6 on  times

		sk4 = new Skill("Opening Gambit", "Deal high damage if your opponent is unharmed.", this.getName() + " wastes no time in striking at his opponent.", 0.8, false,
				false, false, true, 1.2, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk5 = new Skill("Counter", "Counter your opponent's move.", 
				"The desert bandit delivers a counterattack.", 0.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		
	}
	

}
