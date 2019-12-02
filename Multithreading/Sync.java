package multiThreading;
import java.util.concurrent.*;
public class Sync { 
	private static Account account = new Account(); 
	public static void main(String[] args) { 
		      ExecutorService executor = Executors.newCachedThreadPool();// Create and launch 100 threads
		      for (int i = 0; i < 50; i++) {
		    	  executor.execute(new AddAPennyTask());
		    	  }	      
		      executor.shutdown();		      // Wait until all tasks are finished
		      while (!executor.isTerminated()) {
		    	       }
		      		      System.out.println("What is balance? " + account.getBalance());
		          }// A thread for adding a penny to the account
	private static class AddAPennyTask implements Runnable {
		public void run() {
			        account.deposit(100);

		}
		    }
	// An inner class for account
	private static class Account {
		private int balance = 0;
		public int getBalance() {
			return balance;   
			}
		public synchronized void deposit(int amount) {
			int newBalance = balance + amount;
			try {
				          Thread.sleep(5);
				          }
			catch (InterruptedException ex) {				
			}
			balance = newBalance;
			}
		}
			
			// This delay is deliberately added to magnify thecreate executorsubmit taskshut down executorwait for all tasks to terminateFIGURE 30.9AccountWithoutSync contains an instance of Account and 100 threads of AddAPennyTask.1001AddAPennyTask+run(): voidAccountWithoutSync-account: Account+main(args: String[]): void11Account+getBalance(): int+deposit(amount: int): void-balance: int«interface»java.lang.Runnable
	}
	
