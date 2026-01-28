package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawnLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawnLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawnLimit = withdrawnLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawnLimit() {
		return withdrawnLimit;
	}

	public void setWithdrawnLimit(Double withdrawnLimit) {
		this.withdrawnLimit = withdrawnLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		if (amount > withdrawnLimit) {
			throw new DomainException("The amount exceeds withdraw limit");	
		}
		if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
			balance -= amount;
		
	}

	public String toString() {
		return "New Balance: "
				+
				String.format("%.2f", balance);
	}
}


