package multiThreading;
import java.util.Random;

public class PrintTask implements Runnable{

	private final int sleepTime;
	private final String taskName;
	private final static Random r=new Random();
	
	
	public PrintTask(String name)
	
	{
		
		taskName=name;
		sleepTime=r.nextInt(5000);
		
	}
	
	public void run()
	{
		try {
		System.out.printf("\n%s is sleeping %d ",taskName,sleepTime);
		Thread.sleep(sleepTime);
		}
		catch(InterruptedException e){			
			System.out.printf("%s terminated prematurely due to exception",taskName);			
			
		}
		System.out.printf("\n%s done sleeping",taskName);
	}
}
