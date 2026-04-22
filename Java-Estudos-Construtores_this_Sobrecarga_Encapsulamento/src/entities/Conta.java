package entities;

public class Conta {
	
	public Conta() {
	}

	private int number;
	private String holder;
	private double balance;
	
	public Conta(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Conta(int number, String holder, double depositInitial) {
		this.number = number;
		this.holder = holder;
		this.balance = depositInitial;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + 5.0;
	}
}
