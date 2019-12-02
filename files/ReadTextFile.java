package files;
import java.io.File;
import java.util.Scanner;
import java.lang.IllegalStateException;
import readFiles.AccountRecord;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
public class ReadTextFile {

	private Scanner s;
	
	public void openFile()
	{
	try
	{
	 s= new Scanner(new File("clients.txt"));
	}
	catch(FileNotFoundException e)
	{
		System.out.println("error in opening");
		System.exit(1);
	}
	}
	
	public void readRecords()
	{
		AccountRecord r=new AccountRecord();
		System.out.println("accountno\tfirst\tlast\tbalance");
		try
		{
		while(s.hasNext())
		{
			r.setAccount(s.nextInt());
			r.setFirst(s.next());
			r.setLast(s.next());
			r.setBalance(s.nextDouble());
			
			System.out.printf("hello\n%d\t%s\t%s\t%.2f",r.getAccount(),r.getFirst(),r.getLast(),r.getBalance());
				
		}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("\nfile wrongly formed");
			s.close();
			System.exit(1);
		}
		catch(IllegalStateException e)
		{
			System.out.println("error!!!");
			System.exit(1);
		}
		
	}
	
	public void closeFile()
	{
		
		if(s!=null)
		{
			s.close();
		}
	}
}
