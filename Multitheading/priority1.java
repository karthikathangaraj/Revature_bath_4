package Multitheading;
class p1 extends Thread
{
	private boolean running=true;
	public p1(String name)
	{
		super(name);
	}
	public void run() {
		while(running)
		{
			System.out.println("Thread priority: " + getPriority()+ Thread.currentThread().getName());
		 try
		 {
			 
		 }catch(Exception e)
		 {
			 e.printStackTrace();
			 break;
		 }
		 
		}
        System.out.println("stopped...");
        
	}
	public void stopThread()
	{
		running=false;
	}
}
public class priority1 {
	public static void main(String[] args) {
//		p1 p=new p1();
//		System.out.println(p.getPriority());
//		p.setPriority(Thread.MAX_PRIORITY);
//		System.out.println(p.getPriority());
//		p.start();
		
		p1 pr1=new p1("k1");
		//p1 pr2=new p1("k2");
		//p1 pr3=new p1("k3");
		pr1.setName("karthiak");
//		pr1.setPriority(Thread.NORM_PRIORITY);
//		pr2.setPriority(Thread.MIN_PRIORITY);
//		pr3.setPriority(Thread.MAX_PRIORITY);
		System.out.println(pr1.getState());
		pr1.start();
		System.out.println(pr1.getState());
		pr1.stopThread();
		System.out.println(pr1.isAlive());
//		pr1.getStackTrace();
//		pr2.start();
//		pr3.start();
		
	}
}
