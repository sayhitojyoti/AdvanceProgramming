package com.Thread;

public class Main {

	public static void main(String[] args) {
		Stock s=Stock.getInstance();
		new UpdateThread(25);
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		new UpdateThread(25); 
		
	}

}
