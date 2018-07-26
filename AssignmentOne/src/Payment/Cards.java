package Payment;

import java.util.*;
import java.io.*;
import java.lang.*;

public abstract class Cards implements Serializable  {
	
	private long CardNo;
	private String HolderN;
	private String PAN;
	private long Contacts;
	
	
	public Cards(long CardNo, String HolderN, String PAN, long Contacts)
	{
		this.CardNo=CardNo;
		this.HolderN=HolderN;
		this.PAN=PAN;
		this.Contacts=Contacts;
	}


	public long getCardNo() {
		return CardNo;
	}


	


	public String getHolderN() {
		return HolderN;
	}


	


	public String getPAN() {
		return PAN;
	}


	


	public long getContacts() {
		return Contacts;
	}


	@Override
	public String toString() {
		return "Cards [CardNo=" + CardNo + ", HolderN=" + HolderN + ", PAN=" + PAN + ", Contacts=" + Contacts + "]";
		
	}

	public static String printNo()
	{
		return "Cards [CardNo=" + CardNo + ", HolderN=" + HolderN + ", PAN=" + PAN + ", Contacts=" + Contacts + "]";
		
	}
	public static String printName()
	{
		return "Cards [CardNo=" + CardNo + ", HolderN=" + HolderN + ", PAN=" + PAN + ", Contacts=" + Contacts + "]";
		
	}
	
	
	

}
