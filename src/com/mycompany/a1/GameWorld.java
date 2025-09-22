package com.mycompany.a1;
import java.util.ArrayList;
import com.codename1.charts.models.Point;

public class GameWorld {
	
	private int[] gameObjects;
	private int clock;
	private boolean exitConfirmation;
	
	public void init() {
		// code here to create the 
		// initial game objects/setup
		
		Ant ant = new Ant();
		
		Spider spider1 = new Spider();
		Spider spider2 = new Spider();
		
		// TODO fix this. Add locations when creating.
		Flag flag1 = new Flag(1, Point (100, 100));
		Flag flag2 = new Flag(2);
		Flag flag3 = new Flag(3);
		Flag flag4 = new Flag(4);
		
		ArrayList<FoodStation> foodStations = new ArrayList<>();
		foodStations.add(new FoodStation());
		foodStations.add(new FoodStation());
		foodStations.add(new FoodStation());
		foodStations.add(new FoodStation());
		
		// set the initial state of he game
		clock = 0;
		
		
		// then start the game by calling a Game method play()
		play();
		
		// the play() method then accepts keyboard commands from the player 
		// and invokes appropriate methods in GameWorld
		
		
	}
	// additional methods here to 
	// manipulate world objects and 
	// related game state data
	public void  createSounds() {
		
	}
	
	public void createAnt() {
		
	}
	
	public void createSpider() {
		
	}
	
	public void createFlag( int seq) {
		
	}
	
	public void createFoodStation() {
		
	}
	
	public void accelerate() {
		
	}
	
	public void brake() {
		
	}
	
	public void turnLeft() {
		
	}
	
	public void turnRight() {
		
	}
	
	public void collisionWithFlag(Flag f) {
		
	}
	
	public void collisonWithSpider(Spider s) {
		
	}
	
	public void collisionWithFoodStation(FoodStation fs) {
		
	}
	
	public void clockTick() {
		
	}
	
	public void changeFoodConsumption() {
		
	}

	public void map() {
		
	}
	
	public void display() {
		
	}
	
	public boolean exit() {
		
		//change later if necessary. Just added this to quiet the errors
		return false;
	}
	
	public void pretendFlagCollision() {
		
	}
	
	public void pretendSpiderCollision() {
		
	}
	
	public void pretentFoodStationCollision() {
		
	}
	
	public Ant getAnt() {
		Ant a = null;
		return a;
	}
}
