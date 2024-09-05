package oops;

public class anony {

	public static void main(String[] args) {
		Runnable r1=new Runnable()
				{

					@Override
					public void run() {
						System.out.println("i have no name");
						
					}
			
				};
				new Thread(r1).start();

	}

}
