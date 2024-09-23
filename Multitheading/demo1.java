package Multitheading;

public class demo1 implements Runnable {

	@Override
	public void run() {
		System.out.println("i am a thread"+ Thread.currentThread().getName());
	}
		
		public static void main(String[] args)
	    {
			
//			demo1 d1=new demo1();
//			Thread t1=new Thread(d1);
			
			Runnable r1=new demo1();
			Thread t1=new Thread(r1,"demo1");
			t1.start();
	    }
	}


