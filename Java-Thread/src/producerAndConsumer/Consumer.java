package producerAndConsumer;


public class Consumer implements Runnable{

	//This class get that random number and print its factorial

	InterThread g;

	public Consumer(InterThread g) {
		this.g = g;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
 public static int fact(int f)
 {
	 
	 if(f==0)
	 {
		 return 1;
	 }
	 else {
		 return fact(f-1)*f;
	 }
 }
	
	public void run()
	{
		while(true)
		{
		try {
		
		System.out.println("Fact: "+fact(g.getNumber()));
		Thread.sleep(100);		

		}
		catch (InterruptedException e) {
			e.printStackTrace();

	}
		}
	}
	

	
	
}
