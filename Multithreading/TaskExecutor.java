package multiThreading;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class TaskExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PrintTask a1 =new PrintTask ("task1");
PrintTask a2 =new PrintTask("task2");
PrintTask a3= new PrintTask("task3");

System.out.println("starting executor");

ExecutorService e=Executors.newCachedThreadPool();

e.execute(a1);
e.execute(a2);
e.execute(a3);

e.shutdown();
System.out.println("tasks started,main ends");
	}

}
