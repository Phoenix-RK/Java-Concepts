package multiThreading;

public class SynchronizedBuffer implements Buffer {
	
	private int buffer=-1;
	private boolean occupied= false;
	
	public synchronized void set(int value) throws InterruptedException
	{
		while(occupied)
		{
			System.out.println("producer tries to write");
			displayState("Buffer full.producer waits");
			wait();
			
		}
		
		buffer=value;
		occupied=true;
		
		displayState("Producer writes "+buffer);
		notifyAll();		
	}

	
	public synchronized int get() throws InterruptedException
	{
		while(!occupied)
		{
			System.out.println("Consumer tries to read.");
			displayState("Buffer empty .consumer waits");
			wait();			
		}
		
		occupied =false;
		displayState("Consumer reads"+buffer);
		notifyAll();
		return buffer;
	}
		
		public void displayState(String operation)
		{
				System.out.printf("%-40s%d\t\t%b\n\n",operation,buffer,occupied);
		}
	
}
