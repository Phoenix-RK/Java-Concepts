package polymorphism;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SalariedEmployee se=new SalariedEmployee("John","Smith","111",800.0);
		CommissionEmployee ce=new CommissionEmployee("R","k","456",1000000.0,.06);
		BasePlusCommissionEmployee be=new BasePlusCommissionEmployee("bob","lewis","568",5000,.04,300);
		
		System.out.println("individually:");

		System.out.printf("%s\n%s: $%.2f\n\n",se,"earned",se.earnings());
		System.out.printf("%s\n%s: $%.2f\n\n",ce,"earned",ce.earnings());
		System.out.printf("%s\n%s: $%.2f\n\n",be,"earned",be.earnings());
		
		
		Employee[] e=new Employee[3];
		e[0]=se;
		e[1]=ce;
		e[2]=be;
		
		
		System.out.println("\npolymorphically:");
		
		
		for(Employee curremp:e)
		{
			System.out.println(curremp);
			System.out.printf("earning:%.2f\nemployee is a %s\n",curremp.earnings(),curremp.getClass().getName());
		
			if (curremp instanceof BasePlusCommissionEmployee)
			{
				BasePlusCommissionEmployee emp=(BasePlusCommissionEmployee)curremp;
				
				emp.setBaseSalary(1.1*emp.getBaseSalary());
				
				System.out.printf("new:%.2f",emp.getBaseSalary());
				System.out.printf("earned:%.2f",curremp.earnings());
				
			}
			
		}
	}

}
