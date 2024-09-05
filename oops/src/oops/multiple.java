package oops;
interface Father
{
	final int id=9;
	final String name=" ";
	default void dsipaly()
	{
		System.out.println("welcome");
	}
}
interface Mother 
{
	default void dsipaly1()
	{
		System.out.println("welcome to child");
	}
}
class  child1 implements Father ,Mother
{
	void dsipaly2()
	{
		System.out.println("welcome to child1");
	}
}
public class multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
