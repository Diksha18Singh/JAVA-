
public class Savings extends Account implements BankTransaction {
	
	private final int Withdraw_Limit=10000;
	private final int Min_Balance=1000;
	
	public Savings(int a,int b,int bal)
	{
		super(a,b,bal);
		
	}
	
	@Override
	public void withdraw(double amt) throws TransactionDeclineException
	{
		
		if(amt>=Withdraw_Limit)
		{
			throw new TransactionDeclineException("Amount Greater than limit");
		}
		double temp=bal;
		if(temp<Min_Balance)
		{
			throw new TransactionDeclineException("No Sufficient Balance");
		}
		

	}

	@Override
	public void deposit(double amt) {
		bal+=amt;
		

	}
	
	public static void main(String[] args)
	{
		Savings a=new Savings(3,5,1500);
		a.withdraw(10000);
		a.deposit(600);
		
	}

}
