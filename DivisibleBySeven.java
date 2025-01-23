package com.vishal.loop;

import java.util.Scanner;

public class DivisibleBySeven {

	public static void main(String args[]) {
		System.out.println("Enter Number : ");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if(n%7 == 0) {
			System.out.println("Number is divisible by 7 ");
		}else {
			System.out.println("Number is not divisible by 7 ");
		}
	}
}
