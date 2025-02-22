package com.Thread;

public class Stock {
	private int elements;
	private int items;
	private static Stock obj = null;

	private Stock() {

	}

	public static Stock getInstance() {
		if (obj == null)
			obj = new Stock();
		return obj;
	}

	synchronized public void update(int n) {
		int items = n;
		System.out.println("Stock is updated" + items + "items");
		notify();
	}

	synchronized public void Consume(int n) {
		while (items < n) {
			System.out.println("Stock is less,waiting for update");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			items -= n;
			System.out.println(n + "items are consumed");
		}
	}

}
