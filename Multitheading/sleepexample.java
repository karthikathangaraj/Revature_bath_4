package Multitheading;

class Testing extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		try
		{	
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName()+" "+i);
		
		}
	}
}
public class sleepexample {

	public static void main(String[] args) {
		Testing t1=new Testing();
		//Testing t2=new Testing();
		t1.run();
		t1.run();

	}

}
