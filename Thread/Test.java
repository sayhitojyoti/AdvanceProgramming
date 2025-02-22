package com.Thread;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main() Starts");
		Thread t1 = new PrintNumsThread();
		t1.start();
		Thread t2 = new PrintCharsThread();
		t2.start();
		System.out.println("Main() ends");

	}

}

class PrintNumsThread extends Thread {
	public void run()
	{
		System.out.println("run() of printNums Starts");
		for(int i=1;i<=26;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("run() of PrintNums end");
	}

}
class PrintCharsThread extends Thread {
	public void run()
	{
		System.out.println("run() of printChars Starts");
		for(char c='a';c<='z';c++)
		{
			System.out.println(c);
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("run() of PrintChars end");
	}

}