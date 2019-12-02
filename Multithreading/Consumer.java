package multiThreading;
import java.util.Random;


public class Consumer implements Runnable{

	private final static Random r=new Random();
	private final Buffer sharedLoc;
	
	public Consumer(Buffer x)
	{
		sharedLoc=x;
	}
	
	public void run()
	{
		int sum=0;
		for(int i=1;i<=10;i++) {
		try {
			Thread.sleep(r.nextInt(3000));
			sum+=sharedLoc.get();
		//	System.out.printf(" %d ",sum);block for array blocking queue			
		}
		catch(InterruptedException ex){
			ex.printStackTrace();			
		}
		
		}
		
		System.out.printf("\n%s  %d \n %s\n","consumer read values totalling ",sum,"terminating consumer");
	}
	
	
}
