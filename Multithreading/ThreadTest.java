package multiThreading;

class A extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
	
	System.out.println("\tFrom THread A :i = "+i);	
}
	System.out.println("exit from A");

}

}

class B extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{

	System.out.println("\tFrom THread B :j = "+j);	
}System.out.println("exit from B");

}

}

class C extends Thread
{
public void run()
{
for(int k=1;k<=5;k++)
{

	System.out.println("\tFrom THread C :k = "+k);	

}System.out.println("exit from C");

}

}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A ThreadA = new A();
			
		B ThreadB= new B();
			
		C ThreadC= new C();
		ThreadA.start();
		ThreadB.start();

		
		ThreadC.start();
		
/*
		new A().start();
		new B().start();
		new C().start();
*/
	}

}
