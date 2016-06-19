package game;

public class Cyclops extends Character{
	public Cyclops(){
		super();
		health = 1200;
		maxHealth = 1200;
		power = 1.2;
		defense = .9;
		speed = 20;
		sk1 = new Skill("Clobber", "Clobber your opponent with your massive weapon.", 
				"The cyclops clobbers his opponent.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk2 = new Skill("Club Smash", "Deal damage to your opponent and lower their speed.", 
				"The cyclops smashes his opponent with his club, lowering their speed.", 0.7, false,
				false, false, false, 1.0, 1.0, 0.7, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk3 = new Skill("Enrage", "Become enraged and raise your power and defense.", 
				"The cyclops becomes enraged.", 0.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.1, 1.0,
				1.2, false, 1.0);

		sk4 = new Skill("Thrash", "Deal massive damage but leave yourself exposed.", 
				"The cyclops thrashes around, leaving himself exposed.", 1.3, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 0.7, 1.0,
				1.0, false, 1.0);

		sk5 = new Skill("Skull Crusher", "Possibly deliver a stunning blow to your opponent.", 
				"The cyclops attempts to stun his opponent.", 0.5, false,
				true, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);




	}
	
	
}
