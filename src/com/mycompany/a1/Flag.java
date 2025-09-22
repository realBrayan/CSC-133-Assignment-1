package com.mycompany.a1;
import com.codename1.charts.util.ColorUtil;

public class Flag extends Fixed {
	
	private int sequenceNumber;
	
	public Flag(int num) {
		
		sequenceNumber = num;
		
		this.setSize(10);
		this.setColor(ColorUtil.BLUE);
		
		this.setLocation(sequenceNumber * 100, sequenceNumber * 100);
	}

	public int getSequenceNumber() {
		return sequenceNumber;
	}
	
	@Override
	public void setColor(int c) {
		// do nothing.
		System.out.println("Cannot change the Flag's colors.");
	}
}
