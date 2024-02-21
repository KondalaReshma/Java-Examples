package queue;

class Task1 extends Thread{
	   public void run() {
		 //task1
			
			for(int i =101; i<= 199;i++)
			{
				System.out.println(i + " ");
			}
			
			System.out.println("\n Task1 completed");
}
}

class Task2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("task2 started");
		for(int i =201; i<=299;i++)
		{
			System.out.println(i + " ");
		}
		System.out.println("\n Task2 completed");
		
		
	}
	
	
	
}

public class ThreadsBasicsRunner {
   
	
	public static void main(String[]  args) throws InterruptedException {
		
	Task1 task1 = new Task1();
	task1.start();
	task1.setPriority(1);
	
	
	Task2 task2 = new Task2();
	Thread task2thread = new Thread(task2);
	task2thread.start();
	task2thread.setPriority(10);
	
	
	
		
		//task1
		
		
		//task2
		
		
		//task3 
	task1.join();
		
		for(int i =301; i<= 399;i++)
		{
			System.out.println(i + " ");
		}
		System.out.println("\n Task3 completed");
		System.out.println(" Main Task completed");
		
	}	
}
