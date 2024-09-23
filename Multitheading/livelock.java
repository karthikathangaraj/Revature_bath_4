package Multitheading;
class example
{
	 private boolean locked = false;
	 public synchronized void lock()
	 {
		 while(locked)
		 {
			 System.out.println(Thread.currentThread().getName());
			 Thread.yield();
		 }
		 locked=true;
		 System.out.println(Thread.currentThread().getName()+"locked");
	 }
	 public synchronized void unlock()
	 {
		 
		 locked=false;
		 System.out.println(Thread.currentThread().getName()+"unlocked");
	 }
	 
}
public class livelock {
	public static void main(String[] args) {
		example e1=new example();
		example e2=new example();
		Thread t1=new Thread(()->
		
		{
			while(true)
			{
				e1.lock();
				e2.unlock();
			}
		}
				
				);
Thread t2=new Thread(()->
		
		{
			while(true)
			{
				e2.lock();
				e1.unlock();
			}
		}
				
				);


t1.start();
t2.start();
	}

}
