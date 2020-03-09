package com.lak.uni.model;

import java.util.List;

import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;

public class MultiThreading extends Thread{
	
	private static boolean isRunning = true;
	//private Tagscan tagscan;
	
	
	public boolean isRunning() 
	{
		return isRunning;
	}


	public  void setRunning(boolean isRunning) 
	{
		
		this.isRunning = isRunning;
	}


	@Override
	public void run() 
	{
		System.out.println("Programme Strated....");
		System.out.println("|*|*|*\\*\\       |*|*|    |*|*|*|*|*|*|     |*|*|*|*|*||");
		System.out.println("|*|*| *\\*\\      |*|*|    |*|*|*|*|*|*|    |*|*|*|*|*|*|");
		System.out.println("|*|*|  *\\*\\     |*|*|    |*|*|           *|*|");
		System.out.println("|*|*|   *\\*\\    |*|*|    |*|*|           *|*|");
		System.out.println("|*|*|    *\\*\\   |*|*|    |*|*|*|*|*|*|   *|*|");
		System.out.println("|*|*|     *\\*\\  |*|*|    |*|*|*|*|*|*|   *|*|");
		System.out.println("|*|*|      *\\*\\ |*|*|    |*|*|           *|*|");
		System.out.println("|*|*|       *\\*\\|*|*|    |*|*|           *|*|");
		System.out.println("|*|*|        *\\*|*|*|    |*|*|       	  |*|*|*|*|*|*|");
		System.out.println("|*|*|         *\\|*|*|    |*|*|       	   |*|*|*|*|*||");
		System.out.println("");
		System.out.println("Looking for Device......");
		System.out.println("");
	

		super.run();
		
		
		while(isRunning) {
			
			try {
				
				List<CardTerminal> cardTerminals = Tagscan.getDevices();
			
				for (CardTerminal cardTerminal : cardTerminals) 
					{
				
					Tagscan.readingCards(cardTerminal);
					
					}
			
			System.out.println("Running...");
			Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				//e.printStackTrace();
				System.out.println("Other error");
				
			} catch (CardException e) {
				
				//e.printStackTrace();
				//System.out.println("No card found");
			}
			
		}
		
		
	}

}
