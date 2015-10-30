package game;

public class Dice {

	int lastRoll; 
	
	int sides;
	
	public Dice(int i){ 
		sides = i;
	}
	
	public int roll(){
		lastRoll = (int) Math.floor( (Math.random())*sides ) +1;
		return lastRoll;
	}
	
	
	
}

