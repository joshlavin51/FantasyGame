package game;

public class Wizard extends Character{

	public Wizard() {
		super();
		health = 930;
		maxHealth = 930;
		power = 1.2;
		defense = .9;
		speed = 52;
		name = "The Wizard";
		sk1 = new Skill("Fireball", "Shoots a powerful ball of flame at the opponent.", 
				this.getName() + " blasts his opponent with fire.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk2 = new Skill("Winter’s Breath", "Freeze your opponent in their tracks.", 
				this.getName() + " blows icy winds on their opponent, slowing them.", 0.6, false,
				false, false, false, 1.0, 0.7, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk3 = new Skill("Nature’s touch", "Remove all negative status effects and heal you slightly.", 
				this.getName() + " becomes one with nature.", 0.0, true,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, true, .2);

		sk4 = new Skill("Thunder Jolt", "Channel lightning to shock your opponent and lower their power.", 
				this.getName() + " shocks his opponent with lightning, reducing their power.", 0.6, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 0.8,
				1.0, false, 1.0);

		sk5 = new Skill("Drain Life", "Deals damage to your opponent and heals you slightly.", 
				this.getName() + " drains his opponent’s health.", 0.6, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, true, .1);
	}

	

}
