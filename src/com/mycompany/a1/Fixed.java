package com.mycompany.a1;
import com.codename1.charts.models.Point;

public abstract class Fixed extends GameObject {
	
	
	public Fixed(int color, Point location, int size) {
		super(color, size, location);
	}
	
	@Override
	public void setLocation(Point location) {
		// do nothing
		System.out.println("Location cannot change for fixed objects.");
	}

}
