package com.mycompany.a1;
import com.codename1.charts.models.Point;
import com.codename1.charts.util.ColorUtil;
import java.util.Random;

public class GameObject {
	
	private int size;
	private Point location;
	private int color;
	
	public GameObject() {
		
		Random rand = new Random();
		
		float randomX = 50 + (rand.nextFloat() * 900);
		float randomY = 50 + (rand.nextFloat() * 900);
		
		location.setX(randomX);
		location.setY(randomY);
		
	}
	
	public GameObject(int childColor, int childSize) {
		
		setColor(childColor);
		setSize(childSize);
		
		Random rand = new Random();
		
		float randomX = 50 + (rand.nextFloat() * 900);
		float randomY = 50 + (rand.nextFloat() * 900);
		
		location.setX(randomX);
		location.setY(randomY);
	}
	
	public int getSize() {
		return size;
	}
	
	public Point getLocation() {
		return location;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setLocation(float x, float y) {
		
		if (x <= 0.0 && x >= 1000.0) {
			location.setX(x);	
		}
		
		if (y <= 0.0 && y >= 1000.0) {
		location.setY(y);
		}
	}
	
	public void setColor(int c) {
		color = c;
	}
	
	public void setSize(int s) {
		if (s > 0 && s < 100) {
			size = s;
		}
	}
	
	public void draw() {
		// might remove
	}
	
}
