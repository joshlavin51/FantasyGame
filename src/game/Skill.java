package game;

public class Skill {
	private String skillName;
	private String skillDescription;
	private String usedSkill;
	private double damageMultiplier;
	private boolean removeNegStatus;
	private boolean stuns;
	private boolean goesFirst;
	private boolean fullHealth;
	private double fullHealthBonus;
	private double lowersSpeed;
	private double lowersOwnSpeed;
	private double lowersDefense;
	private double lowersOwnDefense;
	private double lowersPower;
	private double lowersOwnPower;
	private boolean restoresHealth;
	private double healthRestore;
	
	public Skill(String SkillName, String SkillDescription, String UsedSkill,
			double DamageMultiplier, boolean RemoveNegStatus, boolean Stuns,
			boolean GoesFirst, boolean FullHealth, double FullHealthBonus, 
			double LowersSpeed, double LowersOwnSpeed, double LowersDefense,
			double LowersOwnDefense, double LowersPower, double LowersOwnPower,
			boolean RestoresHealth, double HealthRestore){
		skillName = SkillName;
		skillDescription = SkillDescription;
		usedSkill = UsedSkill;
		damageMultiplier = DamageMultiplier;
		removeNegStatus = RemoveNegStatus;
		stuns = Stuns;
		goesFirst = GoesFirst;
		fullHealth = FullHealth;
		fullHealthBonus = FullHealthBonus;
		lowersSpeed = LowersSpeed;
		lowersOwnSpeed = LowersOwnSpeed;
		lowersDefense = LowersDefense;
		lowersOwnDefense = LowersOwnDefense;
		lowersPower = LowersPower;
		lowersOwnPower = LowersOwnPower;
		restoresHealth = RestoresHealth;
		healthRestore = HealthRestore;
		
	}
	
	//Assessor methods
	public String getSkillName(){
		return skillName;
	}
	public String getSkillDescription(){
		return skillDescription;
	}
	public String getUsedSkill(){
		return usedSkill;
	}
	public double getDamageMultiplier(){
		return damageMultiplier;
	}
	public boolean getRemoveNegStatus(){
		return removeNegStatus;
	}
	public boolean getStuns(){
		return stuns;
	}
	public boolean getGoesFirst(){
		return goesFirst;
	}
	public boolean getFullHealth(){
		return fullHealth;
	}
	public double getFullHealthBonus(){
		return fullHealthBonus;
	}
	public double getLowersSpeed(){
		return lowersSpeed;
	}
	public double getLowersOwnSpeed(){
		return lowersOwnSpeed;
	}
	public boolean getRestoresHealth(){
		return restoresHealth;
	}
	public double getHealthRestore(){
		return healthRestore;
	}
	public double getLowersOwnPower(){
		return lowersOwnPower;
	}
	public double getLowersPower(){
		return lowersPower;
	}
	public double getLowersOwnDefense(){
		return lowersOwnDefense;
	}
	public double getLowersDefense(){
		return lowersDefense;
	}


	
	

}
