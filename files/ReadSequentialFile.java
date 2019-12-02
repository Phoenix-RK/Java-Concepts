package files;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;

import java.util.NoSuchElementException;

public class ReadSequentialFile {
	
	private ObjectInputStream i;
	
	public void openFile()
	{
		try
		{
		i=new ObjectInputStream(new FileInputStream("clients1.ser"));
	
		}
		catch(IOException e)
		{
			System.out.println("error");
		}
	
	}
	
	public void readRecord()
	{
		AccountRecordSerializable r;
		System.out.println("the details:");
		
		try
		{
			while(true) 
			{
				r=(AccountRecordSerializable)i.readObject();
				
				System.out.printf("\n%d\t%s\t%s\t%.2f",r.getAccount(),r.getFirst(),r.getLast(),r.getBalance());
			}
			
		}
		catch(IOException e)
		{
			System.out.println("error");
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("\nerroe durin creation");
		}
	/*	catch(EOFException e)
		{
			return;
		
		}
		*/
	}
	
	public void closeFile()
	{
		try {
		if(i!=null)
			i.close();
		}
		catch(IOException e)
		{
			System.out.println("\nerror closing");
		}
	}
		

}
