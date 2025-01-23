package com.vishal.loop;

import java.util.Scanner;

public class SalaryCalculatorUpdated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Basic Salary : ");

		//input salary
		Scanner sc = new Scanner(System.in);
		int basicSalary = sc.nextInt();
		
		double grossSalary=0.0;
		int hra = 0;
		int da=0;
		
		if(basicSalary <= 10000) {
//			grossSalary = basicSalary+((20/100.0)*basicSalary)+((80/100.0)*basicSalary);
			hra=20;
			da=80;
			
		}else if(basicSalary <= 20000 && basicSalary > 10000) {
//			grossSalary = basicSalary+((25/100.0)*basicSalary)+((90/100.0)*basicSalary);
			hra=25;
			da=90;
		}else {
//			grossSalary = basicSalary+((30/100.0)*basicSalary)+((95/100.0)*basicSalary);
			hra=30;
			da=95;
		}
		grossSalary = basicSalary+((hra/100.0)*basicSalary)+((da/100.0)*basicSalary);
		System.out.println("Gross Salary : "+grossSalary);
		
	
	}

}
