package oops;

//nested class
class outer
{
	static class inner
	{
		void display()
		{
			System.out.println("welcome");
		}
	}
}
public class demo {
	
	
	public static void main(String[] args)
	
	{
	outer.inner o1=new outer.inner();
	o1.display();
	employee e11=new employee();
	e11.getName();
	}

}
