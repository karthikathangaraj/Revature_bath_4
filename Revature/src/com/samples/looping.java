package com.samples;

import java.util.Scanner;

public class looping {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    //while(){}
		int i=1;
//		while(i<=10)
//		{
//			
//			if(i==5)
//			{
//			  i=i+1;
//			   continue;
//			}
//			System.out.println(i);
//			i=i+1;
		//}
//		
//		do
//		{
//			System.out.println(i);
//			i++;
//		}while(i<=5);
		
		
		
		//for(int;;con;itera) {}
		int x=0;
		for(x=sc.nextInt();x<=10;System.out.print(x+" "),x++);
		for(i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
