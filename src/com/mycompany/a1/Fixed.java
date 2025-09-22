package com.mycompany.a1;
import com.codename1.charts.models.Point;

public abstract class Fixed extends GameObject {
	
	
	public Fixed(int size, Point location, int color) {
		super(size, location, color);
	}
	
	@Override
	public void setLocation(Point location) {
		// do nothing
		System.out.println("Location cannot change for fixed objects.");
	}

}
