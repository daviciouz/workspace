package net.javavideotutorials.example;

import java.util.Calendar;
import java.util.Date;

public class WhileLoops {

	public static void main (String[] args) throws InterruptedException
	{
		// while loops
		// not finite 
		
		// this will be the date/time right when it's executed
		Date today = new Date();
		System.out.println(today);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2012, 10, 26, 17, 14, 0);
		
		while (today.before(cal.getTime()))
		{
			System.out.println("Waiting");
			today = new Date();
			Thread.sleep(1000);
			System.out.println(today);
		}
		
		System.out.println("Done");
	}
}

