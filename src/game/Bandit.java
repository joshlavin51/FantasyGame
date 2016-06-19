package game;

public class Bandit extends Character {

	public Bandit() {
		super();
		health = 850;
		maxHealth = 850;
		power = .8;
		defense = 1;
		speed = 82;
		sk1 = new Skill("Slash", "A quick slash of the sword.", 
				"The bandit slashes his opponent with his sword.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		
		sk2 = new Skill("Sandstorm", "Stir up a sandstorm to blind your opponent.", 
				"The desert bandit stirs up a sandstorm, lowering his opponents speed and power.", 0.0, false,
				false, false, false, 1.0, 0.8, 1.0, 1.0, 1.0, 0.8,1.0, false, 1.0);
		
		sk3 = new Skill("Critical strike", "Risk using a weaker attack to possibly deal tons of damage.", 
				"The desert bandit takes a risky strike at his opponent.", 0.7, false, false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0); //deals 1.6 on  times

		sk4 = new Skill("Opening Gambit", "Deal high damage if your opponent is unharmed.", "The desert bandit wounds his opponent.", 0.8, false,
				false, false, true, 1.2, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk5 = new Skill("Counter", "Counter your opponent's move.", 
				"The desert bandit delivers a counterattack.", 0.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		
	}
	

}
