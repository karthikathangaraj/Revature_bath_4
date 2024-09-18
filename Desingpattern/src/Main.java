class Singleton
{
	private static final Singleton s1=new Singleton();
	
	private Singleton()
	{
		
	}
	public static Singleton getinstance()
	{
		return s1;
	}
	public void display() {
		
		System.out.println("helooooo");
	}
	
}
public class Main {

	public static void main(String[] args) {
		Singleton s2=Singleton.getinstance();
		s2.display();

	}

}
