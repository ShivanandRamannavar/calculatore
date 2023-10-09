package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//UPCASTING
		Calculator calc=new CalculatorImpl();
		//MENU DRIVEN PROGRAM
		while(true) {
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
			System.out.println("Enter Your Choice");
			int choice=scan.nextInt();

			int a=0;
			int b=0;

			if(choice>=1 && choice<=4) {
				System.out.println("Enter Two Numbers");
				a=scan.nextInt();
				b=scan.nextInt();
			}

			switch(choice) {
			case 1:
				System.out.println("Answer is: "+calc.add(a, b));
				break;
			case 2:
				System.out.println("Answer is: "+calc.sub(a, b));
				break;
			case 3:
				System.out.println("Answer is: "+calc.mul(a, b));
				break;
			case 4:
				int result=calc.div(a, b);
				if(result!=0) {
				System.out.println("Answer is: "+result);
				}
				else {
					System.out.println("Cannot Perform Divition");
				}
				break;
			case 5:
				System.out.println("Thank You!!");
				System.exit(0);//Terminate The JVM (Program)
				//exit(0)-->jvm will understand programmer only wants to terminate
				//exit(1(anything apart from 0))--> jvm will understand the program automatically terminates
			default:
				System.out.println(calc.displayErrorMessage());
			}
			System.out.println("-------------------------");
		}


	}
}
