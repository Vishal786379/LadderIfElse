package com.vishal.loop;

import java.util.Scanner;

public class LadderIfExample {
	
	public static void main(String args[]) {
		//input marks of 5 sub : Phisics Chm Maths Bio Computer
		//calculate %
		//grading
		
		Scanner sc = new Scanner(System.in);
		//input physics marks
		System.out.println("Enter Physics marks : ");
		int phy =  sc.nextInt();
		
		//input Chemistry marks
		System.out.println("Enter Chemistry marks : ");
		int chem =  sc.nextInt();
		
		//input maths marks
		System.out.println("Enter Maths marks : ");
		int maths =  sc.nextInt();
		
		//input Bio marks
		System.out.println("Enter Bio marks : ");
		int bio =  sc.nextInt();
		
		//input computer marks
		System.out.println("Enter Computer marks : ");
		int com =  sc.nextInt();
		
		int totalMarks = phy + chem + maths + bio + com;
		System.out.println("Total marks : "+totalMarks);
				
		double percentage= (totalMarks/500.0)*100;
		System.out.println("Percentage : "+percentage+"%");
		
		//grading
		if(percentage >= 90) {
			System.out.println("Grade A");
		}else if(percentage >=80 && percentage <90) {
			System.out.println("Grade B");
		}else if(percentage >=70 && percentage <80) {
			System.out.println("Grade C");
		}else if(percentage >=60 && percentage <70) {
			System.out.println("Grade D");
		}else if(percentage >=40 && percentage <60) {
			System.out.println("Grade E");
		}else {
			System.out.println("Grade F");
		}
		
	}

}
