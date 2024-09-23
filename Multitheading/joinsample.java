package Multitheading;
class threadsample extends Thread
{
	 public void run() {
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Thread running: " + i+" "+ Thread.currentThread().getName());
	        }
	        System.out.println(getPriority());
	    }
}
public class joinsample {

	public static void main(String[] args) {
		
		threadsample t1=new threadsample();
		t1.start();
		try
		{
			
			t1.join(1000);
			 System.out.println("Thread running: " +" "+ Thread.currentThread().getName());
			 System.out.println();
        }
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread finished, resuming main thread.");
	}

}
