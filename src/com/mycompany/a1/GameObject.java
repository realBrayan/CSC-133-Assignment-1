package com.mycompany.a1;
import com.codename1.charts.models.Point;
import com.codename1.charts.util.ColorUtil;
import java.util.Random;

public abstract class GameObject {
	
	private int size;
	private Point location;
	private int color;
	
//	public GameObject() {
//		
//		Random rand = new Random();
//		
//		float randomX = 50 + (rand.nextFloat() * 900);
//		float randomY = 50 + (rand.nextFloat() * 900);
//		
//		location.setX(randomX);
//		location.setY(randomY);
//		
//	}
//	
//	public GameObject(int childColor, int childSize) {
//		
//		setColor(childColor);
//		setSize(childSize);
//		
//		Random rand = new Random();
//		
//		float randomX = 50 + (rand.nextFloat() * 900);
//		float randomY = 50 + (rand.nextFloat() * 900);
//		
//		location.setX(randomX);
//		location.setY(randomY);
//	}
//	
//	public GameObject(int childColor, int childSize, Point childLocation) {
//		setColor(childColor);
//		setSize(childSize);
//		setLocation(childLocation);
//	}
	
	public GameObject(int size, Point location, int color) {
		this.size = size;
		this.location = location;
		this.color = color;
	}
	
	
	public int getSize() {
		return this.size;
	}
	
	public Point getLocation() {
		return this.location;
	}
	
	public int getColor() {
		return this.color;
	}
	
//	public void setLocation(float x, float y) {
//		
//		if (x >= 0.0 && x <= 1000.0) {
//			this.location.setX(x);	
//		}
//		
//		if (y >= 0.0 && y <= 1000.0) {
//		this.location.setY(y);
//		}
//	}
	
	public void setLocation(Point newLocation) {
		
		if (newLocation.getX() >= 0.0f && newLocation.getX() <= 1000.0f && newLocation.getY() >= 0.0f && newLocation.getY() <= 1000.0f) {
            this.location = newLocation;
        }
	}
	
	public void setColor(int newColor) {
		this.color = newColor;
	}
	
//	private void setSize(int s) {
//		if (s > 0 && s < 100) {
//			this.size = s;
//		}
//	}
	
	@Override
	public String toString() {
		
		double roundedX = Math.round(location.getX() * 10.0) / 10.0;
		double roundedY = Math.round(location.getY() * 10.0) / 10.0;
		
		String colorStr = "color=[" + ColorUtil.red(color) + "," + ColorUtil.green(color) + "," + ColorUtil.blue(color) + "]";
		
		return "loc=" + roundedX + "," + roundedY + " " + colorStr + " " + "size=" + size;
		
	}
	
}
