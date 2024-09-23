package Multitheading;
class mul1 implements Runnable
{

	@Override
	public void run() {
		System.out.println("thread is running...");  
		
	}
	
}
public class thread2 {

	public static void main(String[] args) {
//		mul1 m1=new mul1();
//		Thread t1=new Thread(m1);
		Runnable r1=new mul1();
		Thread t1=new Thread(r1,"dat1");
		t1.start();

	}

}
