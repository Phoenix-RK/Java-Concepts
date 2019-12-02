package multiThreading;
import java.util.concurrent.*;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintNum n1=new PrintNum(11);
		PrintNum n2=new PrintNum(22);
		PrintNum n3=new PrintNum(33);
		PrintNum n4=new PrintNum(44);
		ExecutorService e=Executors.newCachedThreadPool();
			
		e.execute(n1);
		e.execute(n2);
		e.execute(n3);
		e.execute(n4);
		
		e.shutdown();
	}

}
