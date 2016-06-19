package game;

public class Pirate extends Character {
	public Pirate(){
		super();
		health = 960;
		maxHealth = 960;
		power = 1.1;
		defense = 1;
		speed = 55;
		name = "Swashbucklin' Seth";
		sk1 = new Skill("Gash", "Slice at your opponent with your sword.", 
				this.getName() + " slices at his opponent.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk2 = new Skill("Sidestep", "Counter your opponent's move", 
				this.getName() + " sidesteps his opponents move and delivers a counterattack", 0.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		sk3 = new Skill("Sea Legs", "Remove all negative status effects and heal you slightly.", 
				this.getName() + " gains his sea legs.", 0.0, true,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, true, .2);

		sk4 = new Skill("Crippling Strike", "Slow your opponent down while attacking.", 
				this.getName() + " delivers a crippling blow to his opponent, slowing them.", 0.8, false,
				false, false, false, 1.0, 0.7, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk5 = new Skill("Outmaneuver", "Use your opponent’s speed against themself", 
				this.getName() + " uses his opponent’s speed against themselves", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		
	}	

}

