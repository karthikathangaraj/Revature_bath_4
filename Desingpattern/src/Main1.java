class Singleton1
{
	private static  Singleton1 s1;
	
	private Singleton1()
	{
		
	}
	public static synchronized Singleton1 getinstance()
	{
		if(s1 == null)
		{
			synchronized(Singleton1.class)
			{
				if(s1==null)
					s1=new Singleton1(); 
			}
			
		}
		return s1;
	}
	public void display() {
		
		System.out.println("helooooo");
	}
	
}
public class Main1 {

	public static void main(String[] args) {
		Singleton1 s2=Singleton1.getinstance();
		s2.display();

	}

}