package com.vishal.loop;

import java.util.Scanner;

public class MaxAmongsThreeNumber {
	
	public static void main(String args[]) {
		
		//WAP to find the max number amongs three number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int n2 = sc.nextInt();
		
		System.out.println("Enter Third Number : ");
		int n3 = sc.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("Number First is Maximum ");
		}else if (n2>n1 && n2>n3) {
			System.out.println("Number Second is Maximum ");
		}else {
			System.out.println("Number Third is Maximum ");
		}
		
		
	}

}
