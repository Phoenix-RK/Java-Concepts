package superclassSubclass;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasePlusCommissionEmployee employee=new BasePlusCommissionEmployee("Bob","Lewis","9999",5000,.04,300);
		System.out.printf("info:\n %s\n",employee.toString());
		
		System.out.println(employee.getClass());
	}

}
