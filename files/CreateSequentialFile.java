package files;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class CreateSequentialFile {
	
	private ObjectOutputStream o;
	
	public void openFile()
	{
		try
		{
			o=new ObjectOutputStream(new FileOutputStream("clients1.ser"));
		}
		catch(IOException e)
		{
			System.out.println("\nerror opening");
		}
	}
	
	public void addRecords()
	{
		AccountRecordSerializable r;
		int no;
		String first;
		String last;
		double bal;
		
		Scanner s=new Scanner(System.in);
		System.out.println("\nenter the data");
		
		while(s.hasNext())
		{
			try
			{
				no=s.nextInt();
				first=s.next();
				last=s.next();
				bal=s.nextDouble();
				
				r=new AccountRecordSerializable(no,first,last,bal);
				o.writeObject(r);
			}
			catch(IOException e)
			{
				System.out.println("error in writing");
				System.exit(1);
			}
			catch(NoSuchElementException e)
			{
				System.out.println("\ninvalid");
			}
			
			System.out.println("enter the data");
		}
	}
	
	public void closeFile()
	{
		try
		{
			if(o!=null)
			{
				o.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("\nerror closing");
			System.exit(1);
		}
	}

}
