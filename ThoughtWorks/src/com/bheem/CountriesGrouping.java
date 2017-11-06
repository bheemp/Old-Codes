package com.bheem;

import java.util.Scanner;

public class CountriesGrouping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		for(int i=0; i<test_cases; i++) {
			System.out.println("Enter N:");
			int N = sc.nextInt();
			int[] arr_n = new int[N];
			
			for(int j=0; j<N; j++) {
				arr_n[j] = sc.nextInt();
			}
			sc.close();
			int country = 0;
			int total = 0;
			boolean isCountry = true;
			int j = 0;
			while(j<N) {
				if(arr_n[j] != 1) {
					int next_j_arr_ele = arr_n[j];
					boolean isRight = false;
					int test = next_j_arr_ele+j-1;
						System.out.println("test"+test);
						int k=j+1;
						for( k=j+1; k<=test; k++) {
							if(next_j_arr_ele != arr_n[k]) {
								isCountry = false;
								isRight = false;
								break;
							}else {
								isRight = true;
							}
						}
					j = k+1;
					total = total + next_j_arr_ele;
					if(isRight) {country++; }
					if(!isCountry) break;
				}else {
					country++;
					total++;
				}
				
			}
			if(!isCountry || total != N) System.out.println("Invalid Data");
			else
			System.out.println(country);
		}

	}

}
