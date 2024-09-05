package oops;
class outer2
{
	static void meth1()
	{
		System.out.println(" iam a outer");
	}
	static class inner
	{
		static void meth2()
		{
			System.out.println(" iam a inner");
			meth1();
		}
	}
}
public class innerclass {

	public static void main(String[] args) {
		outer2.inner.meth2();

	}

}
