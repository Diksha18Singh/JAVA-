package Payment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import Payment.Cards;

public class CardStore {
	
	private static final String DATA_PATH="d:/data/emps.dat";
	static Cards[] cardList=new Cards[100];
	static int counter=0;
	static int i=0;
	
	
	
	public static Cards[] loadCard()
	{
		
		
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(DATA_PATH)))
		{
			Object obj=in.readObject();
			
	
			while(obj!=null)
			{
				cardList[i++]=(Cards)obj;
				obj=in.readObject();
				
			}
			
		}
		catch(IOException | ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		
		

		return cardList;
	}
	
	public static void printl() {
        for (Cards card : cardList) {
            if (card == null)
                break;
            System.out.println(card);
        } // end of for loop
    }// end of add card
        //

	
	public static void add(Cards c)
	{
		cardList[counter++]=c;
		
		
		
	}
	public static void storeCards()
	{
		
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(DATA_PATH)))
		{
			for(Cards e:cardList)
			{
				out.writeObject(e);
				out.flush();
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void print(){
		for(Cards card:cardList){
			if(card==null)
				break;
			System.out.println(card );

}
	}
	
	public static void searchByHolderN(long number)
	{
		
		for(Cards c:cardList)
		{
		if(c!=null)
			{
			if(number==c.getCardNo())
				
			{
				
				c.printNo();
			}
			}
			
		}
	}
	
	public static void searchByHolderName(String n)
	{
		for(Cards c:cardList)
		{
			if(c!=null)
			{
				if(n==c.getHolderN())
				{
					
					c.printName();
				}
			}
			
		}
		
	}
}
