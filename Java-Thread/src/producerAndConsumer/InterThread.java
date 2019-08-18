package producerAndConsumer;



public class InterThread {

	private int number;
	boolean set=false;
	
	public synchronized int getNumber() throws InterruptedException {
		while(!set)
		{
			wait();
		}
		set=false;
		notify();
		return number;
	}

	public synchronized void setNumber(int number) throws InterruptedException {
		while(set) {
			wait();
		}
		System.out.println("put: "+number);
		this.number = number;
		set=true;
		notify();

	}
	public static void main(String[] args) {

		InterThread ob=new InterThread();
		Producer t1=new Producer(ob);
		Consumer t=new Consumer(ob);
		
		
	}
	
	
	
}
