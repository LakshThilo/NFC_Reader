package com.lak.uni.controller;

import java.math.BigInteger;
import java.util.List;

import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.CommandAPDU;
import javax.smartcardio.ResponseAPDU;
import javax.smartcardio.TerminalFactory;

public class Tagscan {

	
	static String bin2hex(byte[] data) 
	{
		
	    	return String.format("%0" + (data.length * 2) + "X", new BigInteger(1,data));
	}
	
	
	
	public static List<CardTerminal> getDevices() throws CardException
	{
		
			TerminalFactory factory = TerminalFactory.getDefault();
			return factory.terminals().list();
		
		
	}
	


	public static void readingCards(CardTerminal cardTerminal) throws CardException {
		
			// Use the first terminal
		   CardTerminal terminal = cardTerminal;
		
		   // Connect with the card
		   Card card = terminal.connect("*");
		 
		  // System.out.println("Card: " + card);
		   CardChannel channel = card.getBasicChannel();
		
		   // Send test command
		   ResponseAPDU response = channel.transmit(new CommandAPDU( new byte[] { (byte) 0xFF, (byte) 0xCA, (byte) 0x00, (byte) 0x00, (byte) 0x00 }));
		   //System.out.println("Response: " + response.toString());
		   
		   if (response.getSW1() == 0x63 && response.getSW2() == 0x00) 
		   {
			   System.out.println("Failed");
		   } 
			
		   System.out.println("UID: " + bin2hex(response.getData()));
		   //new CardDetails(bin2hex(response.getData())).getStudentDetails();
		   try {
			new CardDetails(bin2hex(response.getData())).getStudentDetails();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		   
		   
			
		   // Disconnect the card
		   card.disconnect(true);
	}
	
}