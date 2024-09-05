package oops;
interface GParent1
{

	default void dsipaly()
	{
		System.out.println("welcome");
	}
}
interface Pchild1 extends GParent1
{
	default void dsipaly1()
	{
		System.out.println("welcome to child");
	}
}
class  child11 extends GParent
{
	void dsipaly2()
	{
		System.out.println("welcome to child1");
	}
}
public class hirachical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
