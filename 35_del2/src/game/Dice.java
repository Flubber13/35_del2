package game;

public class Dice {

	private int lastRoll; 
	
	private int sides;
	
	public Dice(int sides){ 
		this.sides = sides;
	}
	
	public int roll(){
		setLastRoll((int)Math.floor( (Math.random())*sides ) +1);
		return getLastRoll();
	}
	
	public int getLastRoll(){
		return lastRoll;
	}
	
	public void setLastRoll(int lastRoll){
		this.lastRoll = lastRoll;
	}
	
	
}

