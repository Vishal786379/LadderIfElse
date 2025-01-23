package com.vishal.loop;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number : ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int r = n%2;
		
		if(r==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}

	}

}
