package game;

public class Werewolf extends Character{
	public Werewolf(){
		super();
		health = 990;
		maxHealth = 990;
		power = 1;
		defense = 1;
		speed = 63;
		sk1 = new Skill("Crunch", "Viciously bite your opponent.", 
				"The werewolf crunches down on her opponent.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk2 = new Skill("Howl", "Howl to increase your own power and speed.", 
				"The werewolf’s howl pierces the air.", 0.0, false,
				false, false, false, 1.0, 1.0, 1.2, 1.0, 1.0, 1.0,
				1.2, false, 1.0);

		sk3 = new Skill("Ravenous Bite", "Bite your opponent to restore some health.", 
				"The werewolf sinks her teeth into her opponent.", 0.7, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, true, 1.1);

		sk4 = new Skill("Lunge", "Deal high damage but slow yourself down.", 
				"The werewolf lunges forward into her opponent.", 1.2, false,
				false, false, false, 1.0, 1.0, 0.8, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk5 = new Skill("Momentous Slam", "Use your speed to deal a more powerful strike", 
				"The werewolf slams into her opponent.", 0.8, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);


	}	
	
	
}
