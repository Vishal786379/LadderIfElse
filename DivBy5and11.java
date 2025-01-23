package com.vishal.loop;

import java.util.Scanner;

public class DivBy5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Number n1: ");
		int n1 = scanner.nextInt();
		
		boolean divBy5 = n1%5==0;
		boolean divBy11 = n1%11==0;
		
		
		if(divBy5 ==true && divBy11 ==true) {
			System.out.println("Number is Divisible by 5 and 11");
		}else {
			System.out.println("Number is Not Divisible by 5 and 11");
		}
	}

}
