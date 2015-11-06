package game;

public class Fields {
	
	/*When the dice is rolled in the game the amount of points added is pulled from this array. The sum of the roll
	corresponds to each index of the array.
	Index 0 & 1 are only here, so that a rolled value of fx. 2 will corresponds directly to the index of 2. 
	they will therefore never be used since it is not possible to roll 0 and 1. */
	public static int[] field = {0,0,250,-100,100,-20,180,0,-70,60,-80,-50,650};
}
