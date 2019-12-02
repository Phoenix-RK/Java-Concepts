package multiThreading;
import java.util.concurrent.*;
public class SharedBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService e=Executors.newCachedThreadPool();
		
		Buffer sharedloc=new UnsynchronizedBuffer();
		
		System.out.println("Action\t\tvalue\t\tsum of produced\t\tsum of consumed");
		
		e.execute(new Producer(sharedloc));
		e.execute(new Consumer(sharedloc));
		
		e.shutdown();

	}

}
