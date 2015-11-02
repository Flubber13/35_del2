package game;

import desktop_resources.GUI;

public class Controller {

	public static void main(String[] args) {
		new Controller().run();
	}

	public void run() {
		
		Player.player1 = GUI.getUserString(Text.enterName1);
		Player.player2 = GUI.getUserString(Text.enterName2);
		
		GUI.addPlayer(Player.player1, Player.p1Balance);
		GUI.addPlayer(Player.player2, Player.p2Balance);
		
		
		
		
	}
}

