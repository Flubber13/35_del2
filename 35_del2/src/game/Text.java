package game;

import java.util.Random;

public class Text {
	static String enterName1 = "Player 1 enter name";
	static String enterName2 = "Player 2 enter name";

	static String roll = " press OK to roll dice";	

	static String winner = " wins the game!";

	
	public static int randomInteger(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	//The matrix "field" consists of 12 fields, with 4 texts each = field [4][12.
	static String[][] field = {
			//field0 and field1 -- EMPTY
			{"", "", "", ""}, {"", "", "", ""},
			//field2
			{"", "landede på tower 1", "landede på tower 2", "landede på tower 3"},
			//field3
			{"", "landede på crater 1", "landede på cater 2", "landede på crater 3"},
			//field4
			{"", "landede på gates 1", "landede på gates 2", "landede på gates 3"},
			//field5
			{"", "landede på desert 1", "landede på desert 2", "landede på desert 3"},
			//field6
			{"", "landede på city 1", "landede på city 2", "landede på city 3"},
			//field7
			{"", "landede på monestary 1", "landede på monestary 2", "landede på monestary 3"},
			//field8
			{"", "landede på cave 1", "landede på cave 2", "landede på cave 3"},
			//field9
			{"", "landede på mountain 1", "landede på mountain 2", "landede på mountain 3"},
			//field10
			{"", "landede på wherewall 1", "landede på wherewall 2", "landede på wherewall 3"},
			//field11
			{"", "landede på pit 1", "landede på pit 2", "landede på pit 3"},
			//field12
			{"", "landede på goldmine 1", "landede på goldmine 2", "landede på goldmine 3"},

	};
}
