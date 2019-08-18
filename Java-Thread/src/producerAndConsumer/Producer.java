package producerAndConsumer;

import java.util.Random;


public class Producer implements Runnable{
	//This class produce a random number

	InterThread g;
	Random no=new Random();
	
	public Producer(InterThread g) {
		this.g = g;
		Thread t=new Thread(this,"Producer");
		t.start();
	}



	public void run()
	{
		for(int i=1;i<=5;i++)
		{	
				try {
					g.setNumber(no.nextInt(10));
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}
		
	}
	
	
	
}

	
	
	

