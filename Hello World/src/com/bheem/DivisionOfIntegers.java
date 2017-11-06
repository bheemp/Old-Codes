package com.bheem;

import java.util.Scanner;

public class DivisionOfIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Dividend: ");
		int dividend = sc.nextInt();
		System.out.println("Enter Divisor: ");
		int divisor = sc.nextInt();
		sc.close();
		int remainder = Math.abs(dividend);
		int quotient = 0;
		while(remainder >= divisor) {
			remainder = remainder -divisor;
			quotient = quotient + 1;
		}
		
		if(dividend < 0 && remainder > 0) {
			remainder = divisor - remainder;
			quotient = -(quotient + 1);
		}
		
		System.out.println("Quotient and Remainder are: "+quotient+"  "+remainder);

	}

}
