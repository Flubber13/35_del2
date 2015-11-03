package game;

public class BankAccount {
	
	private int balance;
	
	public BankAccount(int balance){
		this.balance = balance;
	}
	
	
	public int getBalance(){
		return balance;
	}
	
	
	public int addBalance(int input){
		if (this.balance + input < 0)
			this.balance = 0;
		else this.balance = this.balance + input;
		return input;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static int player1Balance = 1000;
//	static int player2Balance = 1000;
//	
//	
//	public int player1Balance(){
//		return player1Balance();
//	}
//	
//	public int player2Balance(){
//		return player2Balance();
//	}
}
