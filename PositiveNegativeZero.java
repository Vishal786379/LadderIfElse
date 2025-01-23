package com.vishal.loop;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Number n1: ");
		int n1 = scanner.nextInt();
		
		if(n1>0) {
			System.out.println("Number is Positive");
		}else if(n1<0) {
			System.out.println("Number is Negative");
		}else {
			System.out.println("Number is Zero");
		}
	}

}
