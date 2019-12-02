package interfaceDemo;

public class PayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payable[] p=new Payable[4];
		
		p[0]=new Invoice("01234","seat",2,375.00);
		p[1]=new Invoice("56789","tyre",4,79.95);
		p[2]=new SalariedEmployee("john","smith","678",800.00);
		p[3]=new SalariedEmployee("Lisa","Barnes","888",1200.0);
		
		System.out.println("invoice and emp:");
		
		for(Payable x:p)
		{
			System.out.printf("%s \npay:%.2f",x.toString(),x.getPayment());
		}
	}

}
