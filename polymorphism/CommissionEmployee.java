package polymorphism;

public class CommissionEmployee extends Employee {
	
	private double grossSales;
	private double commissionRate;
	
	
	
	public CommissionEmployee(String first,String last,String ssn,double sales,double rate) {

		super(first,last,ssn);
		setGrossSales(sales);
		setCommissionRate(rate);
			
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

public double getRate()
{
	return commissionRate;
}
public double getGrossSales()
{
	return grossSales;
}

@Override
public double earnings()
{
	return commissionRate*grossSales;
	
}


@Override
public String toString()
{
	return String.format("\nemployee:%s\nRate:%.2f\nSales:%.2f",super.toString(),getRate(),grossSales);
}

}
