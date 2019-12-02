package multiThreading;
import java.lang.Runnable;

public class ArrayWriter implements Runnable{
	
	private final SimpleArray s;
	private final int startloc;
	
	public ArrayWriter(int loc,SimpleArray m)
	{
		s=m;
		startloc=loc;		
	}
	
	public void run()
	{
		for(int i=startloc;i<startloc+3;i++)
		{
			s.add(i);
		}
		
	}

}
