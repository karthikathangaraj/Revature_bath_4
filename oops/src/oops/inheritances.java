package oops;
class GParent
{
	int id;
	String name;
	void dsipaly()
	{
		System.out.println("welcome");
	}
}
class Pchild extends GParent
{
	void dsipaly1()
	{
		System.out.println("welcome to child");
	}
}
class  child extends Pchild
{
	void dsipaly2()
	{
		System.out.println("welcome to child1");
	}
}
public class inheritances {

	public static void main(String[] args) {
		child c1=new child();
		c1.dsipaly();
		c1.dsipaly1();
		c1.dsipaly2();

	}

}
