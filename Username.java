package programs;

import java.util.Scanner;

public class Username {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		while (true) {
			
			
			System.out.println("1 : addition");
			System.out.println("2 : subraction");
			System.out.println("3 : multiplication");
			System.out.println("4 : Division");
			System.out.println("5 : Exit");
			System.out.println("Enter your choices");
			int choice=sc.nextInt();
			
			if (choice==1)
			{
				System.out.println("Result :" + (num1+num2) );
			}
			else if (choice==2)
			{
			
				System.out.println("Result :" + (num1-num2) );
			}
			else if (choice==3)
			{
			
				System.out.println("Result :" + (num1*num2) );
			}
			else if(choice==4)
			{
				if(num2!=0) {
					System.out.println("Result: " + (num1/num2));
				}
				else {
					System.out.println("division by zero not possible");
				}
			}
			else if (choice==5)
			{
			
				System.out.println("Exiting  program...");
				break;
			}
			else {
				System.out.println("Invalid Entry");
			}
			System.out.println();
		}
		
		
	}

}
