package game;
import java.util.*;


public class Battle {
	private Character p1;
	private Character p2;
	private Skill sk1;
	private Skill sk2;
	public Battle (Character P1, Character P2, Skill Sk1, Skill Sk2){
		p1 = P1;
		p2 = P2;
		determineFirst();
	}
	
	// Determines which character goes first in combat
	public void determineFirst(){
		Random rand = new Random(100);
		int speedRatio = 50;
		speedRatio += p1.getSpeed() - p2.getSpeed();
		int randNum = rand.nextInt();
		if(speedRatio <= randNum){
			// P2 goes first
			battle(p2,p1,sk2,sk1);
		} else {
			// P1 goes first.
			battle(p1,p2,sk1,sk2);
		}
		
	}
	
	public void battle(Character ch1, Character ch2, Skill sl1, Skill sl2){
		sl1.getUsedSkill();
		
	}
	

}
