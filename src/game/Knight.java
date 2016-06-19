package game;

public class Knight extends Character {
	public Knight() {
		super();
		health = 920;
		maxHealth = 920;
		power = .9;
		defense = 1.2;
		speed = 45;
		sk1 = new Skill("Cut", "Slash at your opponent with your sword.", 
				"The knight slashes at his opponent.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk2 = new Skill("Charge", "Strike before your opponent.", 
				"The knight strikes before his opponent can prepare.", 0.7, false,
				false, true, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk3 = new Skill("Shield Bash", "Possibly deliver a stunning blow to your opponent", 
				"The knight bashes his opponent with his shield in an attempt to stun them.", 0.5, false,
				true, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk4 = new Skill("Joust", "Deal a stronger attack but leave yourself slower.", 
				"The knight jousts with his opponent.", 1.3, false,
				false, false, false, 1.0, 1.0, 0.8, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk5 = new Skill("Dragon Slayer", "Deal higher damage to higher-powered opponents.", 
				"The knight deals heavy damage to his opponent.", 0.8, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		
	}
	

}


