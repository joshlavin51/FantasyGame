package game;

public class Demon extends Character{
	
	public Demon(){
		super();
		health = 980;
		maxHealth = 980;
		power = 1.3;
		defense = .7;
		speed = 70;
		sk1 = new Skill("Impale", "Stab your opponent with your spear.", 
				"The demon warrior impales its opponent.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		sk2 = new Skill("Decimate", "Deals more damage the closer you are to death.", 
				"The demon warrior deals a deathly blow to its opponent.", 0.8, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk3 = new Skill("Demonic Sacrifice", "Give up some of your own health to deal more damage.", 
				"The demon warrior deals a devastating attack to its opponent.", 1.5, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, true, 0.9);
		sk4 = new Skill("Cowering Glare", "Reduce your opponent’s power and reduce their speed.", 
				"The demon warrior makes its opponent cower in fear, lowering their power and speed.", 0.0, false,
				false, false, false, 1.0, 0.8, 1.0, 1.0, 1.0, 0.8,
				1.0, false, 1.0);
		sk5 = new Skill("Leech Life", "Deals damage to your opponent and heals you slightly.", 
				"The demon warrior drains its opponents health.", 0.6, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, true, 1.1);

	}
	
}
