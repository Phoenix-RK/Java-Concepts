package multiThreading;
import java.util.concurrent.*;
public class BlockingBuffer implements Buffer {

	private  ArrayBlockingQueue<Integer> buffer;
	
	public  BlockingBuffer()
	{
		
		buffer=new ArrayBlockingQueue<Integer>(1);
	}
	
	public void set(int value) throws InterruptedException
	{		
		buffer.put(value);
		System.out.printf("%s%2d\t%s%d\n","producer writes",value,"buffer cells occupied:",buffer.size());
	}
	
	public int get() throws InterruptedException
	{
		int readvalue=buffer.take();
		System.out.printf("%s %2d\t%s%d\n","consumer reads",readvalue,"buffer cells occupied: ",buffer.size());
		
		return readvalue;
	}
	

}
