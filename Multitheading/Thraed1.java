package Multitheading;
class Multiple extends Thread
{
	public void run()
	{
		System.out.println("Running...");
		
	}
}
public class Thraed1 {

	public static void main(String[] args) {
		Multiple t1= new Multiple(); 
		t1.start();

	}

}
