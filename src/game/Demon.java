package game;

public class Demon extends Character{
	
	public Demon(){
		super();
		health = 980;
		maxHealth = 980;
		power = 1.3;
		defense = .7;
		speed = 70;
		name = "Jewathus";
		sk1 = new Skill("Impale", "Stab your opponent with your spear.", 
				this.getName() + " impales its opponent.", 1.0, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);
		sk2 = new Skill("Decimate", "Deals more damage the closer you are to death.", 
				this.getName() + " deals a deathly blow to its opponent.", 0.7, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, false, 1.0);

		sk3 = new Skill("Demonic Sacrifice", "Give up some of your own health to deal more damage.", 
				this.getName() + " deals a devastating attack to its opponent.", 1.4, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, true, -.1);
		sk4 = new Skill("Evil Glare", "Make your opponent cower in fear, lowering their power and speed.", 
				this.getName() + " strikes terror into its opponent, lowering their power and speed.", 0.0, false,
				false, false, false, 1.0, 0.8, 1.0, 1.0, 1.0, 0.8,
				1.0, false, 1.0);
		sk5 = new Skill("Leech Life", "Deals damage to your opponent and heals you slightly.", 
				this.getName() + " drains its opponents life energy.", 0.6, false,
				false, false, false, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, true, .1);

	}
	
}
