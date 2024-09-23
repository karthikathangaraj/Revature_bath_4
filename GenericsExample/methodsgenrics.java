package GenericsExample;

import java.util.ArrayList;
import java.util.List;

public class methodsgenrics {
	
	public static <T extends Number> void printdata(T data)
	{
		System.out.println(data);
	}
	public static  void printd(List<? super Integer> list)
	{
		list.add(10);
		list.add(88);
		
	}
	public static  void printd1(List<?> list)
	{
		for(Object o1:list)
			System.out.println(o1);
		
	}
	public static void main(String[] args) {
//		printdata(9);
//		printdata(12.5);
//		printdata(1211234);
//		List<Number> n1=new ArrayList<>();
//		printd(n1);
//		System.out.println(n1);
		
	  List<Integer> l1= List.of(10,1,2,3,4);
	  List<String>  l2 = List.of("a","b","c");
	  printd1(l1);
	  printd1(l2);

	}

}
