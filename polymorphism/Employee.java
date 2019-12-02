package polymorphism;

public abstract class Employee {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	public Employee(String first,String last,String ssn)
	{
		firstName=first;
		lastName=last;
		socialSecurityNumber=ssn;
	}

	public void setFirstName(String first)
	{
		firstName=first;
	}
	
	public void setLastName(String last)
	{
		lastName=last;
	}
	
	public void setSsn(String ssn)
	{
		socialSecurityNumber=ssn;
	}
	

	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getSsn()
	{
		return socialSecurityNumber;
	}

	@Override
public String toString()
{
	return String.format("%s %s\nssn:%s",firstName,lastName,getSsn());
}
	
	
	public abstract double earnings();
}
