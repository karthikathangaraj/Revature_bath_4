package Multitheading;

import java.util.LinkedList;

class buffer
{
	private final LinkedList<Integer> l1= new LinkedList<Integer>();
    private final int size=10;
    public synchronized void produce() throws InterruptedException
    {
    	int val=0;
    	while(true)
    	{
    		while(l1.size()==size)
    		{
    			System.out.println("its full");
    			wait();
    		}
    		l1.add(val++);
    		notify();
    		Thread.sleep(500);
    	}
    }
    public synchronized void consumer() throws InterruptedException
    {
    	
    	while(true)
    	{
    		while(l1.isEmpty())
    		{
    			System.out.println("its empty");
    			wait();
    		}
    		int val=l1.removeFirst();
    		System.out.println(val);
    		notify();
    		Thread.sleep(500);
    	}
    }
}
public class pcproblem {

	public static void main(String[] args) {
		buffer b1=new buffer();
		Thread p1=new Thread(
				
				()->
				{
					try {b1.produce();}catch(Exception e){e.printStackTrace();}
				});
Thread c1=new Thread(
				
				()->
				{
					try {b1.consumer();}catch(Exception e){e.printStackTrace();}
				});
		p1.start();
		c1.start();
		
	}

}
