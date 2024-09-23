package Multitheading;
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}
}
public class Multi {

	public static void main(String[] args) {
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		MyThread m3=new MyThread();
		m1.start();
		m2.start();
		m3.start();
		Thread t1=new Thread("hi");
		t1.start();
		System.out.println(t1.getName());
		

	}

}
