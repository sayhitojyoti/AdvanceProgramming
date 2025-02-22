package com.Thread;

public class ConsumerThread implements Runnable {
	int items;

	public ConsumerThread(int items)
	{
		this.items=items;
		new Thread(this).start();
	}

	public void run() {
		System.out.println("Consumer thread starts");
		Stock.getInstance().Consume(items);
	}

}
