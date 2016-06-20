package game;

public class Knight extends Character {
	public Knight() {
		super();
		health = 920;
		maxHealth = 920;
		power = .9;
		defense = 1.2;
		speed = 45;
		name = "The Knight";
		sk1 = new Skill("Sword Slash", "Slash at your opponent with your sword.", 
				this.getName() + " slashes at his opponent.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk2 = new Skill("Charge", "Strike before your opponent has a chance.", 
				this.getName() + " strikes before his opponent can prepare.", 0.7, false,
				false, true, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk3 = new Skill("Shield Bash", "Possibly deliver a stunning blow to your opponent.", 
				this.getName() + " bashes his opponent with his shield in an attempt to stun them.", 0.5, false,
				true, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, .5);

		sk4 = new Skill("Heroic Strike", "Deal a stronger attack but leave yourself slower.", 
				this.getName() + " uses all of his strength to strike at his opponent.", 1.3, false,
				false, false, false, 1.0, 1.0, 0.8, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk5 = new Skill("Dragon Slayer", "Deal higher damage to higher-powered opponents.", 
				this.getName() + " deals heavy damage to his opponent.", 0.8, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		
	}
	

}


