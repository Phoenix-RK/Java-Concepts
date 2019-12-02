package multiThreading;


import java.util.Arrays;



public class SimpleArray{
	private final int[] arr;
	private int writeIndex=0;
	
	
	public SimpleArray(int size)
	{
		
	 arr=new int [size];
	}
		public synchronized void add(int k)
	{
		int pos=writeIndex;
		
		try {
			Thread.sleep(100);			
		}
		catch(InterruptedException e) {
			e.printStackTrace();			
		}
		arr[pos]=k;
		
		System.out.printf("\n%s wrote %d to ele %d",Thread.currentThread().getName(),k,pos);
		
		writeIndex++;
		
		System.out.printf("\nnext loc is %d",writeIndex);
		
		
	}
		
		public String  toString()
		{
			return "\ncontents of the array:\n"+Arrays.toString(arr);
		}
	
	
}
