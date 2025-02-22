package com.Thread;

public class UpdateThread implements Runnable {
	int items;

	public UpdateThread(int items)
	{
		this.items=items;
		new Thread(this).start();
	}

	public void run() {
		System.out.println("Update thread starts");
		Stock.getInstance().update(items);
	}

}
