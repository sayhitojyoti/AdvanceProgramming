package com.Thread;

public class Accounttest {

	public static void main(String[] args) {
		Account a1 = new Account();
		new DepositThread(a1, 1000);
		new DepositThread(a1, 1000);
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		a1.displayBal();

	}

}

class DepositThread implements Runnable {
	Account acc;
	int amt;

	DepositThread(Account acc, int amt) {
		this.acc = acc;
		this.amt = amt;
		new Thread(this).start();
	}

	public void run() {

		acc.deposit(amt);
	}

}