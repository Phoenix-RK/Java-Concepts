package multiThreading;
import java.util.concurrent.*;

public class SharedBufferTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService e=Executors.newCachedThreadPool();
		
		Buffer b= new SynchronizedBuffer();
		
		System.out.printf("%-40s%s\t\t%s\n%-40s%s\n\n","operation","Buffer","occupied","--------","-----------\t\t--------------");
		
		e.execute(new Producer(b));
		e.execute(new Consumer(b));

	}

}
