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
	private double altersSpeed;
	private double altersOwnSpeed;
	private double altersDefense;
	private double altersOwnDefense;
	private double altersPower;
	private double altersOwnPower;
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
		altersSpeed = LowersSpeed;
		altersOwnSpeed = LowersOwnSpeed;
		altersDefense = LowersDefense;
		altersOwnDefense = LowersOwnDefense;
		altersPower = LowersPower;
		altersOwnPower = LowersOwnPower;
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
	public double getAltersSpeed(){
		return altersSpeed;
	}
	public double getAltersOwnSpeed(){
		return altersOwnSpeed;
	}
	public boolean getRestoresHealth(){
		return restoresHealth;
	}
	public double getHealthRestore(){
		return healthRestore;
	}
	public double getAltersOwnPower(){
		return altersOwnPower;
	}
	public double getAltersPower(){
		return altersPower;
	}
	public double getAltersOwnDefense(){
		return altersOwnDefense;
	}
	public double getAltersDefense(){
		return altersDefense;
	}
	public void setDM(double amount) {
		damageMultiplier = amount;
	}


	
	

}
