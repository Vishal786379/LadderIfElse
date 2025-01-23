package com.vishal.loop;

import java.util.Scanner;

public class ElectricityUnitCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input electricity unit charges
		//calculate total electricity bill
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Electricity Unit : ");
		int electricityUnit  = sc.nextInt();
		
		double bill=0.0;
		
		if(electricityUnit <=50) {
			bill= electricityUnit*0.50;
		}else if(electricityUnit <=150 ) {
			bill=(50 * 0.50) + ((electricityUnit - 50) * 0.75);
		}else if(electricityUnit <=250) {
			bill=(50 * 0.50) + (100 * 0.75) + ((electricityUnit - 150) * 1.20);
		}else {
			bill=(50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((electricityUnit - 250) * 1.50);
		}
		
		double surcharge = bill * 0.20;
        bill = bill + surcharge;
		
		System.out.println("Total Electricity bill is : "+bill);
		
	}

}
