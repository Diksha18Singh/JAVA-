package Payment;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.sql.Timestamp;

import Payment.CardStore;

public class App {
	public static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		char ch='C',i='N';
		CardStore.loadCard();
		CardStore.printl();
		
		
		do
		{
			switch(ch)
			{
				case 'A': addnewCard();
						 
				break;
				case 'F': findCard();
				break;
				case 'L': ListCard();
				break;
				case 'Q': System.out.println("U have quit the application?");
						  ch='Q';	  
						   break;
						  
				default: System.out.println(" ");
			}
			System.out.println("MENU");
			System.out.println("A- ADD NEW CARD");
			System.out.println("F- FIND NEW CARD");
			System.out.println("L- LIST CARDS BY HOLDERNAME");
			System.out.println("Q- QUIT");
			System.out.println("ENTER YOUR CHOICE= ");
			ch=s.next().charAt(0);
			
		}while(ch!='Q');
		
		CardStore.storeCards();
	}
	
	public static void addnewCard()
	{
		long CNo= System.currentTimeMillis();
		String HN, PAN; 
		long C;
		String C1;
		
		CardType n=null;
		CardFactory c= new CardFactory();
		System.out.println("Enter type of card");
		System.out.println("Debit Card \t \t \t Credit Card");
		C1=s.nextLine();
		C1=C1.trim();
		C1=C1.toUpperCase();
		if(C1=="DEBIT")
		{
			n=CardType.DEBIT;
			
		}
		if(C1=="CREDIT")
		{
			n=CardType.CREDIT;
			
		}
			s.nextLine();
			System.out.println("Enter the Name of card holder: ");
			HN=s.nextLine();
			System.out.println("Enter your PAN Number");
			PAN=s.nextLine();
			System.out.println("Enter your Contact Number");
			C=s.nextLong();
			System.out.println("Card Number: "+CNo);
			CardStore.add(c.issueNewCard(n,CNo,HN,PAN,C));
					
						
	}
			
		
		
		
		
		
		
		
		
		
		
	
	public static void findCard()
	{
		
		System.out.println("Enter your Card number:");
		long n=s.nextLong();
		CardStore.searchByHolderN(n);
		
		
		
		
	}
	public static void ListCard()
	{
		System.out.println("Enter the name of Card Holder: ");
		String name=s.nextLine();
		CardStore.searchByHolderName(name);
	}

}
