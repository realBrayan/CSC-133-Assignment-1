package com.mycompany.a1;
import com.codename1.charts.util.ColorUtil;

public class Ant extends Moveable implements iFoodie {
	
	private int maximumSpeed; 
	private int foodConsumptionRate;
	private int healthLevel;
	private int lastFlagReached;
	private int lives;
	
	
	public Ant() {
		// TODO Auto-generated constructor stub
		
		//    color,           size, speed, heading
		super(ColorUtil.MAGENTA, 10, 15, 0);
		
		
		maximumSpeed = 50;
		foodConsumptionRate = 2;
		healthLevel = 10;
		lastFlagReached = 1;
		lives = 3;
		 
		 // set the position to the first flag. 
		 this.setLocation(100, 100);

		
	}
	
	public int getMaximumSpeed () {
		return maximumSpeed;
	}	
	
	public int getHealthLevel() {
		return healthLevel;
	}
	
	public int getLastFlagReached() {
		return lastFlagReached;
	}
	
	public int getLives() {
		return lives;
	}
	
	
	@Override
	public void setSpeed(int s) {
		
		double healthPercentage = (double) healthLevel / 10.0;
		
		double currentMaxSpeed = maximumSpeed * healthPercentage;
		
		if (s <= currentMaxSpeed) {
			super.setSpeed(s);
		}
	}
	
	@Override
	public void setFoodConsumption(int fc) {
		if (fc >= 0) {
			foodConsumptionRate = fc;
		}
	}
	
	public void setHealthLevel(int hl) {
		if (hl >= 0 && hl <= 10) {
			healthLevel = hl;
			
			if (this.getSpeed() > maximumSpeed * (healthLevel / 10)) {
				this.setSpeed(maximumSpeed * (healthLevel / 10));
			}
		}
	}
	
	public void setLastFlagReached(int f) {
		if ( f > 0 && f == lastFlagReached + 1) {
			lastFlagReached = f;
		}
	}
	
	public void consumeFood() {
		
		int newFoodLevel = this.getFoodLevel() - foodConsumptionRate;
		
		this.setFoodLevel(newFoodLevel);
	}
	
	public void gotStung() {
		
	}
	
	public void collectFood(int amount) {
		
		int newFoodLevel = this.getFoodLevel() + amount;
		this.setFoodLevel(newFoodLevel);
	}
	
	public boolean reachedFlag(int flagNum) {
		
		if ( flagNum == lastFlagReached + 1) {
			return true;
		}
		return false;
	}
	
	public boolean isDead() {
		if (lives == 0) {
			return true;
		}
		
		return false;
	}
	
}
