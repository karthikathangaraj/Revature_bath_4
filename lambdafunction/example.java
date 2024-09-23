package lambdafunction;

import java.util.ArrayList;

public class example {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			a1.add(i);
		a1.forEach((n)-> System.out.println(n));
		System.out.println(a1);
		a1.removeIf(n-> n%2 !=0);
		System.out.println(a1);

	}

}
