package Payment;

import java.util.*;
import java.io.*;
import java.lang.*;

public class CardFactory {
	
	public void CardFactory()
	{
		
	}
	
public static Cards issueNewCard(CardType C,long CardNo, String HolderN, String PAN, long Contacts)
{
	
	if(C==CardType.CREDIT)
	{
		
		int points=10;
		Cards c1=new CreditCard(points,CardNo, HolderN, PAN, Contacts);
		
		return c1;
	}
	
	if(C==CardType.DEBIT)
	{
		Cards c1=new DebitCard(CardNo, HolderN, PAN, Contacts);
		return c1;
	}
	
	return null;
}

}
