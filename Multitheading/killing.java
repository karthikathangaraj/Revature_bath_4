package Multitheading;

class MyThread1 extends Thread {
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(500);  // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted during sleep.");
                Thread.currentThread().interrupt();  // Preserve the interrupt status
                break;  // Exit the loop when interrupted
            }
        }
        System.out.println("Thread stopped.");
    }
}
public class killing {

	public static void main(String[] args) {
		 MyThread1 t1 = new MyThread1();
		 t1.start();
		 try
		 {
			 Thread.sleep(2500);
		 }catch(Exception e) {e.printStackTrace();}
		 t1.interrupt();

	}

}
