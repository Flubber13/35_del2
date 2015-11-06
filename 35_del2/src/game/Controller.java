package game;

import desktop_resources.GUI;

public class Controller {

	public static void main(String[] args) {
		new Controller().run();
	}

	Player player1, player2;
	DiceCup dicecup;

	public void run() {

		player1 = new Player(1000);
		player2 = new Player(1000);
		dicecup = new DiceCup();

		player1.setName(GUI.getUserString(Text.enterName1));
		player2.setName(GUI.getUserString(Text.enterName2));

		GUI.addPlayer(player1.getName(), player1.getAccount().getBalance());
		GUI.addPlayer(player2.getName(), player2.getAccount().getBalance());
		
		while(player1.getAccount().getBalance()<3000 && player2.getAccount().getBalance()<3000){
			playerTurn(player1);
			playerTurn(player2);
		}

		
		if (player1.getAccount().getBalance() >= 3000 && player2.getAccount().getBalance() < 3000)
			GUI.showMessage(">>>" + player1.getName() + Text.winner + "<<<");

		if (player2.getAccount().getBalance() >= 3000 && player1.getAccount().getBalance() < 3000)
			GUI.showMessage(">>>" + player2.getName() + Text.winner + "<<<");

		else 
			GUI.showMessage(">>>" + player1.getName() + " and " + player2.getName() + Text.tie +"<<<");

	}


	private void playerTurn(Player player) {
		int fieldNo;
		do{
			GUI.showMessage(player.getName() + Text.roll );
			fieldNo = dicecup.roll();
			GUI.setDice(dicecup.getDie1().getLastRoll(), dicecup.getDie2().getLastRoll());
			GUI.showMessage(player.getName() + Text.field[fieldNo][Text.randomInteger(0,4)]);
			player.getAccount().addBalance(Fields.field[fieldNo]);

			GUI.setBalance(player.getName(), player.getAccount().getBalance());
		}while (fieldNo==10);
	}


}

