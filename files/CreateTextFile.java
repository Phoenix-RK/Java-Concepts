package files;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile
{

	private Formatter output;

	public void openFile()
	{
		try
		{
			output=new Formatter("clients.txt");
		}
		catch(SecurityException s)
		{
			System.out.println("No access to write");
			System.exit(1);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(1);
		}

	}
	
	
	public void addRecords()
	{
		AccountRecord r=new AccountRecord();
		Scanner s=new Scanner(System.in);
		
		System.out.println("\nenter the account no,firstname lastname,balance\nenter ctrl z to stop");
		while(s.hasNext())
		{
			try
			{
			r.setAccount(s.nextInt());
			r.setFirst(s.next());
			r.setLast(s.next());
			r.setBalance(s.nextDouble());
			
			
			if(r.getAccount()>0)
			{
				System.out.printf("\naccount-%d\nfirst name-%s\nlast name-%s\nbalance-%.2f",r.getAccount(),r.getFirst(),r.getLast(),r.getBalance());
		
			}
			else
				System.out.println("\nAccount no invalid");
		
			}
			catch(NoSuchElementException e)
			{
				System.out.println("\ninput invalid");
				s.nextLine();
				
			}
			catch(FormatterClosedException e)
			{
				System.out.println("\nerror writing file");
				return;
			}
			
			System.out.println("\nenter acc no,first,last,balance");
		}
	}
	
	
	public void closeFile()
	{
		if(output!=null)
			output.close();
	}
		
}
