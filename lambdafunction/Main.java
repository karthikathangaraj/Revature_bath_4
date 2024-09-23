package lambdafunction;

import java.util.function.Function;

public class Main {
	public static String toupper(String s1)
	{
		return s1.toUpperCase();
	}
	public static void main(String[] args) {
		int a=5;
		int b=10;
		Demolambda add=(int x,int y)->x+y;
		Demolambda sub=(int x,int y)->x-y;
		Demolambda mul=(int x,int y)->x*y;
		int ans=add.add(a,b);
		int ans1=sub.add(a,b);
		int ans2=mul.add(a,b);
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
		Function<String, String> upperCaseFunction = Main::toupper;
		String res1=upperCaseFunction.apply("karthika");
		System.out.println(res1);	
	}
}


