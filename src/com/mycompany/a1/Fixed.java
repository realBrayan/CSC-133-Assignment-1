package com.mycompany.a1;

public class Fixed extends GameObject {
	
	private int sequenceNumber;
	
	public Fixed() {
		// TODO Auto-generated constructor stub
	}
	
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	
	@Override
	public void setLocation(float x, float y) {
		// do nothing
		System.out.println("Location cannot change for fixed objects.");
	}

}
