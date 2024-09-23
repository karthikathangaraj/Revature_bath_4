package Multitheading;
class count1
{
	private  int count=0;
	public synchronized void increment() {
       
		count++;
    }
	public int getc()
	{
		return count;
	}
}
public class Synchronization11 {

	public static void main(String[] args) throws InterruptedException {
		count1 c1= new count1();
		Thread t1=new Thread(()->
		{
			for(int i=0;i<1000;i++)
			{
				c1.increment();
			}
		});
		Thread t2=new Thread(()->
		{
			for(int i=0;i<1000;i++)
			{
				c1.increment();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		 System.out.println("Final count: " + c1.getc());
	}

}
