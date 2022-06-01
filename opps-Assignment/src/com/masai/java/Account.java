package com.masai.java;

public class Account {
	private int balance;
	
	void start() {
		System.out.println("Deposite Money");
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		if(balance >= 100) {
			this.balance = balance;
		}
		
	}
	
	
	public void credit(int howMuch) {
		if(howMuch >= 0) {
			this.balance = this.balance + howMuch;
		}
		
	}
	
	
	
	public void debit(int howMuch) {
		if(this.balance - howMuch >= 0 && howMuch > 0) {
			this.balance = this.balance - howMuch;
		}
		
	}
	

}
