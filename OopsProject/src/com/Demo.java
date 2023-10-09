package com;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
while(true) {
		System.out.println("Enter your choice");
		int choice=scan.nextInt();

		switch(choice) {
		case 1:
			System.out.println("Hi Tom");
			break;
		case 2:
			System.out.println("HI Jerry");
			break;
		case 3:
			System.out.println("Thnk you");
			System.exit(0);//Terminate the JVM(Program)
		default:
			System.out.println("Bye");
		}
		System.out.println("------------------");
	}
}
}