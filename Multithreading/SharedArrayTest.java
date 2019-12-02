package multiThreading;
import java.util.concurrent.*;
 

public class SharedArrayTest {
	
	public static void main(String []arg) {
		
		SimpleArray s=new SimpleArray(6);
		
		ArrayWriter a1 =new ArrayWriter(1,s);
		ArrayWriter a2=new ArrayWriter(11,s);
		
		ExecutorService e=Executors.newCachedThreadPool();
		
		e.execute(a1);
		e.execute(a2);
		
		e.shutdown();
		
		try {
			boolean tasksEnded = e.awaitTermination(1,TimeUnit.MINUTES);
			if(tasksEnded)
				System.out.println(s);
			else
				System.out.println("timed out while waiting");
		}
		catch(InterruptedException ex) {
			System.out.println("interrupted out while waiting");
		}
		
		
		
		
	}

}
