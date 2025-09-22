package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;
import java.util.Random; 

public class Spider extends Moveable {

	private int damageAmount;	
	
	public Spider() {
		
		super(ColorUtil.BLACK, 25, new Random().nextInt(10) + 5, new Random().nextInt(359));
		
	}
	
	public int getDamageAmount() {
		return damageAmount;
	}
	
	public void updateHeading() {
		
	}
	
	@Override
	public void setFoodLevel(int fl) {
		// dont update. Spiders should aren't foodies so they cannot update foodlevels.
		System.out.println("Spiders cannot update their food levels.");
	}
	
	@Override
	public void setColor(int c) {
		// set to black no matter what c is.
		super.setColor(ColorUtil.BLACK);
	}
	
	@Override
	public void setSize(int s) {
		
		// ignore s. We do not change the size to anything other than 25.
		super.setSize(25);
		System.out.println("Spiders cannot change size after creation.");
	}
	
	
	@Override
	public void move() {
		
		Random rand = new Random();
		
		int randomNum = rand.nextInt(10);
		
		int newHeading = this.getHeading() + (-5 + randomNum) ;
		
		this.setHeading(newHeading);
		
		
		// if the spiders center hits the side of the world, it changes heading and does not move out of bounds. 
		if (this.getLocation().getX() <= 0 || this.getLocation().getX() >= 1000 || this.getLocation().getY() <= 0 || this.getLocation().getY() >= 1000) {
			this.setHeading(this.getHeading() - 180);
		}
		
		
		// if the spider gets to the same location as the ant, it decreases the health level by 1
	}
}
