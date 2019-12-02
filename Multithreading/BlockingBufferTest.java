package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlockingBufferTest {

	public static void main(String[] args) {
		
	ExecutorService e=Executors.newCachedThreadPool();
	
	Buffer sharedloc=new BlockingBuffer();
		
	e.execute(new Producer(sharedloc));
	e.execute(new Consumer(sharedloc));
	
	e.shutdown();
}
	

}
