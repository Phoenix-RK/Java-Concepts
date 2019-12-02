package polymorphism;

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	public SalariedEmployee(String first,String last,String ssn,double salary)
	{
		super(first,last,ssn);
		setWeeklySalary(salary);
				
	}
	
	public void setWeeklySalary(double salary) {
		
		weeklySalary=salary;
	}
	
	public double getWeeklySalary()
	{
		return weeklySalary;
	}
	
	@Override
	public double earnings() {
		return weeklySalary;
	}
	
	@Override
	public String toString() {
	return String.format("%s %s\n%s:%.2f","salaried",super.toString(),"Weekly salary:",getWeeklySalary());
	}
	}
	


