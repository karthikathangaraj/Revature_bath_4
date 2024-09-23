package optinalclass;

import java.util.Optional;

public class Main {
	public static void main(String[] a1)
	{
		String[] name=new String[20];
//		String name1=name[1].toLowerCase();
//		System.out.println(name1);
		name[4]="karthikaThangaraj";
		//System.out.println(w1);
		Optional<String> chk =Optional.ofNullable(name[5]);
		if(chk.isPresent())
		{
			String w1=name[5].toUpperCase();
			System.out.println(w1);
		}
		else
			System.out.println("is null");
			
	}
	

}
