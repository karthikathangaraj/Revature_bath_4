package Multitheading;
class DaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running...");
            try {
                Thread.sleep(500);  // Sleep for 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class daemon {

	public static void main(String[] args) {
		DaemonThread daemonThread = new DaemonThread();
		daemonThread.setDaemon(true);
		daemonThread.start();
		try
		{
			Thread.sleep(2500);
		}catch(Exception e) {e.printStackTrace();}
		 System.out.println("Main thread finished, JVM will exit now.");
	}

}
