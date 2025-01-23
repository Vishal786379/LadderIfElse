package com.vishal.loop;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Basic Salary : ");

		//input salary
		Scanner sc = new Scanner(System.in);
		int basicSalary = sc.nextInt();
		
		double grossSalary=0.0;
		
		if(basicSalary <= 10000) {
			grossSalary = basicSalary+((20/100.0)*basicSalary)+((80/100.0)*basicSalary);
			
		}else if(basicSalary <= 20000 && basicSalary > 10000) {
			grossSalary = basicSalary+((25/100.0)*basicSalary)+((90/100.0)*basicSalary);
		}else {
			grossSalary = basicSalary+((30/100.0)*basicSalary)+((95/100.0)*basicSalary);
		}
		System.out.println("Gross Salary : "+grossSalary);
		
	}

}
