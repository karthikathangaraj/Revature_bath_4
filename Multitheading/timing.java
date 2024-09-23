package Multitheading;
class thread extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(100);
			
		}catch(Exception ie)
		{
			ie.printStackTrace();
		}
		System.out.println(Thread.currentThread().getState());
		try
		{
			Thread.sleep(200);
			
		}catch(Exception ie)
		{
			ie.printStackTrace();
		}
	}
}
public class timing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
