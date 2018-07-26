package Payment;

public class CreditCard extends Cards {
	
	private float IntRate=(float) 0.1;
	private final int CreditLim=7000;
	private int point=0;
	
	
	public CreditCard(int point,long CardNo, String HolderN, String PAN, long Contacts)
	{
		super(CardNo, HolderN, PAN, Contacts);
		this.point=point;
		
	}
	
	
	

}
