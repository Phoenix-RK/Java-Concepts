package multiThreading;

public class UnsynchronizedBuffer implements Buffer{
	
	private int buffer=-1;
	
	public void set(int value) throws InterruptedException
	{
		System.out.printf("\nproducer writes %d ",value);
		buffer=value;
	}
	
	public int get() throws InterruptedException
	{
		System.out.printf("\nconsumer reads  %d ", buffer);
		return buffer;
	}

}
