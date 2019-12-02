package multiThreading;
import java.util.Random;

public class Producer implements Runnable{
	
	private final static Random r=new Random();
	private final Buffer sharedLoc;
	
	public Producer(Buffer x) {
		sharedLoc=x;
	}
	
	public void run()
	{
		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(r.nextInt(3000));
				sharedLoc.set(i);
				sum+=i;
				//System.out.printf("%d",sum);block for arrayblockingqueue
				
			}
			
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		
		System.out.println("\nproducer done producing\nterminating process");
	}

}
