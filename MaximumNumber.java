package com.vishal.loop;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Number n1: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter second Number n2: ");
		int n2 = scanner.nextInt();
		
		if(n1>n2) {
			System.out.println(n1+ " is maximum");
		}else {
			System.out.println(n2+ " is maximum");
		}
	}

}
