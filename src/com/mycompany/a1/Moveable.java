package com.mycompany.a1;

public class Moveable extends GameObject {
	
	private int heading;
	private int speed;
	private int foodLevel;
	
	public Moveable() {
		// TODO Auto-generated constructor stub
		
		foodLevel = 100; // change if runs out too fast.
	}
	
	public Moveable(int childColor, int childSize, int childSpeed, int childHeading) {
		
		super(childColor, childSize);
		
		setSpeed(childSpeed);
		setHeading(childHeading);
		
	}
	
	public int getHeading() {
		return heading;
	}

	public int getSpeed() {
		return speed;
	}
	
	public int getFoodLevel() {
		return foodLevel;
	}
	
	public void setHeading(int h) {
			
		heading = h % 360;

	}
	
	public void setSpeed(int s) {
		if (s >= 0) {
			speed = s;
		}
	}
	
	public void setFoodLevel(int f) {
		if (f > 0) {
			foodLevel = f;
		}
		else if (f == 0) {
			foodLevel = f;
			speed = 0;
		}
	}
	
	public void move() {
		// do math to make it's point move
	}
}
