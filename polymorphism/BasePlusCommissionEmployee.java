package polymorphism;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	
private double baseSalary;
	
	public BasePlusCommissionEmployee(String first,String last,String ssn,double sales,double rate,double salary)
	{
		super(first,last,ssn,sales,rate);
		setBaseSalary(salary);
				
	}
	
	public void setBaseSalary(double salary) {
		baseSalary=salary;
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	@Override
	public double earnings() {
		return baseSalary+super.earnings();
	}
	
	@Override
	public String toString() {
	return String.format("\n%s %s\n%s:%.2f\n%s:%.2f","basesalaried",super.toString(),"base salary:",baseSalary,"earnings",earnings());
		
	}

}
