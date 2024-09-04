package com.samples;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		
   Scanner sc=new Scanner(System.in);
//   int age=sc.nextInt();
//   if(age>=18 && age<=100)
//   {
//	   
//       String crd=sc.next();
//       if(crd.equalsIgnoreCase("a"))
//    	 System.out.print("right to vote");
//       else if(crd.equalsIgnoreCase("v"))
//    	   System.out.print("YOU CAN  vote");
//       else
//    	   System.out.println("sorry bring card");
//         
//   }
//   else
//	   System.out.print("sorry");	
   
		String ch=sc.next();
				switch(ch)
				{
				case "a":
					 System.out.println("Monday");
					 break;
				case "b":
					 System.out.println("T");
					 break;
				case "c":
					 System.out.println("w");
					 break;
				default:
					 System.out.print("wrong choice");
				}
		
	}

}
