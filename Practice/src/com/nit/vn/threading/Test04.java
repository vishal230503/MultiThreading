package com.nit.vn.threading;

class BankAccount {
	
	private long accNum;
	private String accHName;
	private double balance;
	
	public BankAccount(long accNum,String accHName,double balance) {
		this.accNum = accNum;
		this.accHName = accHName;
		this.balance  = balance;
		
	}
	
	public void deposit(double amt) {
		this.balance = this.balance + amt ;
	}
	
	public void withdraw(double amt) {
		this.balance = this.balance - amt;
	}
	
	public void currentBalance() {
		System.out.println(balance);
	}
	
	public long getAccNum() {
		return accNum;
	}
	
}

class DepositorThread extends Thread {
	
	private BankAccount acc;
	private double amt;
	
	public DepositorThread(BankAccount acc,double amt) {
		this.acc = acc;
		this.amt = amt;
	}
	
	@Override
	public void run() {
		acc.deposit(amt);
		System.out.println(getName() + "deposited " + amt + " in the account" + acc.getAccNum());
	}
	
}

class WithdraweeThread extends Thread {
	
	private BankAccount acc;
	private double amt;
	
	public WithdraweeThread(BankAccount acc , double amt) {
		this.acc = acc;
		this.amt = amt;
	}
	
	@Override
	public void run() {
		acc.withdraw(amt);
		System.out.println(getName() + "withdrawn " + amt + " from the account" + acc.getAccNum());
	}
	
}
public class Test04 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Bank Start");
		
		BankAccount acc1 =  new BankAccount(1234,"c1",10000);
		BankAccount acc2 =  new BankAccount(5678,"c2",20000);
		BankAccount acc3 =  new BankAccount(4321,"c3",30000);
		BankAccount acc4 =  new BankAccount(4567,"c4",40000);
		
		DepositorThread dt1 = new DepositorThread(acc1, 5000);
		DepositorThread dt2 = new DepositorThread(acc2, 7000);
		WithdraweeThread wt1 = new WithdraweeThread(acc3, 5000);
		WithdraweeThread wt2 = new WithdraweeThread(acc4, 7000);
		
		dt1.start();
		dt2.start();
		wt1.start();
		wt1.start();
		
		Thread.sleep(1000);
		
		System.out.println("acc1 balance: "); acc1.currentBalance();
		System.out.println("acc2 balance: "); acc2.currentBalance();
		System.out.println("acc3 balance: "); acc3.currentBalance();
		System.out.println("acc3 balance: "); acc4.currentBalance();
		
		
		System.out.println("Bank end");
		
	}
}
