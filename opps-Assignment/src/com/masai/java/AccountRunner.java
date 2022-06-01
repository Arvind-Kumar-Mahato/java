package com.masai.java;

public class AccountRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Account ram = new Account();
     Account rohit = new Account();
     ram.start();
     rohit.start();
     
     
     ram.setBalance(100);
     rohit.setBalance(50);
     
     ram.credit(500);
     ram.debit(200);
     
     rohit.credit(100);
     rohit.debit(50);
     
     System.out.println("ram "+ ram.getBalance());
     System.out.println("rohit "+ rohit.getBalance());
	}
	

}
