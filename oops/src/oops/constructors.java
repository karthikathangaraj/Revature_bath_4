package oops;
class stu
{
	int phone;
	String name;
	{
		System.out.println("i am a aconstructure");
	}
	stu()
	{
		System.out.println("i am a default constructure");
	}
	
	{
		System.out.println("i am a  constructure-1");
	}
	stu(int name)
	{
//		this.name=90;
		System.out.println();
	}
	stu(int a,int b)
	{
		System.out.println(a);
	}
	stu(int a,int b,int c)
	{
		System.out.println(a);
	}


}
public class constructors {

	public static void main(String[] args) {
		stu s1=new stu(10);
		stu s2=new stu();
		s2=s1;
		System.out.println(s2.name);
		
		

	}

}
