
public interface BankTransaction {
	
	public void withdraw(double amt) throws TransactionDeclineException;
	public void deposit(double amt);
	

}
