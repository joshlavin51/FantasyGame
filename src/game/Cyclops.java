package game;

public class Cyclops extends Character{
	public Cyclops(){
		super();
		health = 1100;
		maxHealth = 1100;
		power = 1.1;
		defense = .9;
		speed = 20;
		name = "Dwayde";
		sk1 = new Skill("Clobber", "Clobber your opponent with your massive weapon.", 
				this.getName() + " clobbers his opponent.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk2 = new Skill("Arm Smash", "Deal damage to your opponent and lower their speed.", 
				this.getName() + " smashes his opponent, lowering their speed.", 0.7, false,
				false, false, false, 1.0, 1.0, 0.7, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk3 = new Skill("Enrage", "Become enraged and raise your power and defense.", 
				this.getName() + " becomes enraged.", 0.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.1, 1.0,
				1.2, false, 1.0);

		sk4 = new Skill("Thrash", "Deal massive damage but leave yourself exposed.", 
				this.getName() + " thrashes around, leaving himself exposed.", 1.3, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 0.7, 1.0,
				1.0, false, 1.0);

		sk5 = new Skill("Skull Crusher", "Possibly deliver a stunning blow to your opponent.", 
				this.getName() + " attempts to stun his opponent by bashing them in the head.", 0.5, false,
				true, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);




	}
	
	
}
