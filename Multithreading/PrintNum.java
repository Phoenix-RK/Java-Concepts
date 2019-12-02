package multiThreading;
import java.lang.Runnable;

public class PrintNum implements Runnable {

	//private  Exe exe;
	private final int no;
	
	public PrintNum(int n)
	{
		no=n;
	}
	
	public synchronized void run()
	{

		try {
			
		System.out.printf("\n%d",no);
		System.out.printf("\n%d",no);
		Thread.sleep(1000);
		
		}
		catch(InterruptedException e)
		{
			System.out.println("error!!");
		}
	
		
		
	}
}
