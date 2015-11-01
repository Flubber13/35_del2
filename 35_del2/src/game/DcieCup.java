package game;

public class DcieCup {

	Dice die1 = new Dice(6); 
	Dice die2 = new Dice(6);

	
	public int roll(){
		die1.roll();
		die2.roll();
		return die1.lastRoll + die2.lastRoll;
	}
}
