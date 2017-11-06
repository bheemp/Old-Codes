package com.bheem;

import java.util.Scanner;

public class ChoosingKNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		for(int i=0; i<test_cases; i++) {
			int N = sc.nextInt();
			int S = sc.nextInt();
			int[] arr_n = new int[N];
			for(int j=0; j<N; j++) {
				arr_n[j] = sc.nextInt();
			}
			int final_k = 0;
			int diffValue = 0;
			
			if(N<S) {
				int final_k1 = N;
				while(final_k1 > 0) {
                   int k=final_k1;
					
					for(int j=0; j<k; j++) {
						for(int w =1; w<k; w++) {
							int tmp = (arr_n[j]-arr_n[w])*k;
							if(tmp > 0 && tmp <= S && tmp>diffValue) {
								diffValue = tmp;
								final_k = final_k1;
							}
						}
					}
				--final_k1;
				}
			}else {
				int final_k1 = S;
				while(final_k1 > 0) {
                   int k=final_k1;
					
					for(int j=0; j<k; j++) {
						for(int w =1; w<k; w++) {
							int tmp = (arr_n[j]-arr_n[w])*k;
							if(tmp > 0 && tmp <= S && tmp>diffValue) {
								diffValue = tmp;
								final_k = final_k1;
							}
						}
					}
				--final_k1;
				}
			}
			System.out.println(final_k+" "+diffValue);
		}

	}

}
