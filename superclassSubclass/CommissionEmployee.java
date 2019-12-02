package superclassSubclass;

public class CommissionEmployee {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	
	
	
	public CommissionEmployee(String first,String last,String ssn,double sales,double rate) {
		firstName=first;
		lastName=last;
		socialSecurityNumber=ssn;
		setGrossSales(sales);
		setCommissionRate(rate);
			
	}
	
	public void setFirstName(String first) {
		firstName=first;
		}
	public void setLastName(String last) {
	lastName=last;
		}
	public void setSsn(String ssn) {
		socialSecurityNumber=ssn;
		}
	public void setGrossSales(double sales) {
		
		
			if(sales>=0.0)
				grossSales=sales;
			else
				throw new IllegalArgumentException("sales should be positive");
		
		}
	public void setCommissionRate(double rate) {
		
			if(rate>0.0&&rate<1.0) 
				commissionRate=rate;
			else
				throw new IllegalArgumentException("must be between 0.0 to 1.0");
		
		
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
	public double getRate()
	{
		return commissionRate;
	}
	public double getGrossSales()
	{
		return grossSales;
	}
	
	public double earnings()
	{
		return commissionRate*grossSales;
		
	}
	
	
	@Override
	public String toString()
	{
		return String.format("\nemployee : %s %s\nssn: %s\nRate:%.2f\nSales:%.2f",firstName,lastName,getSsn(),getRate(),grossSales);
	}
		
}
