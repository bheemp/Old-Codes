package com.bheem;

import java.util.Scanner;

public class ModularExponentiation {
	public static String conversionToBase(int N, int base) {
		String answer = "";
		while(N>0) {
			int bit = N % base;
			N = N/base;
			answer = answer.concat(String.valueOf(bit));
		}
		String answer1 = "";
		System.out.println("Answer: "+answer);
		for(int i=answer.length()-1; i>=0; i--) {
			//answer1 = answer1.concat(String.valueOf(answer.charAt(i)));
			answer1 = answer1 + answer.charAt(i);
		}
		return answer1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int base = 2;
		System.out.println("Enter base: ");
		int mainBase = sc.nextInt();
		System.out.println("Enter exponent: ");
		int n = sc.nextInt();
		System.out.println("Enter Modulo: ");
		int m = sc.nextInt();
		sc.close();
		String binaryNumber = conversionToBase(n, base);
		
		int x = 1;
		int power = mainBase % m;
		for(int i=binaryNumber.length()-1; i>=0; i--) {
			char ch = binaryNumber.charAt(i);
			int a = Integer.parseInt(String.valueOf(ch));
			if(a == 1) x = (x*power)%m;
			power = (power*power) % m;
		}
		System.out.println("x: "+x);

	}

}
