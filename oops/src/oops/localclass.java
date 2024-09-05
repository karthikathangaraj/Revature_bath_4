package oops;


class outer1
{
	int a=9;
	void getdata()
	{
		class iner
		{
			void display()
			{
//				int a=9;
				System.out.println(a*a);
			}
		}
		iner l1=new iner();
		l1.display();
	}
}
public class localclass {

	public static void main(String[] args) {
		outer1 o1=new outer1();
		o1.getdata();

	}

}
