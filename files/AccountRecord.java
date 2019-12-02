package files;

public class AccountRecord {

	private int accountNo;
	private String firstName;
	private String lastName;
	private double balance;
	
	
	public AccountRecord()
	{
		this(0,"","",0.0);
	}
	public AccountRecord(int no,String first,String last,double bal)
	{
	
		setAccount(no);
		setFirst(first);
		setLast(last);
		setBalance(bal);
	}
	
	public void setAccount(int no)
	{
		accountNo=no;
	}
	
	public int getAccount()
	{
		return accountNo;
	}
	
	public void setFirst(String first)
	{
		firstName=first;
	}
	
	public String getFirst()
	{
		return firstName;
	}
	
	public void setLast(String last)
	{
		lastName=last;
	}
	
	public String getLast()
	{
		return lastName;
	}
	public void setBalance(double bal)
	{
		balance=bal;
	}
	
	public double getBalance()
	{
		return balance;
	}

}