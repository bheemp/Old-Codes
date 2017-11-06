package com.bheem;

import java.util.Scanner;

public class SamShopping {
	public static int[] getMin(int[] arr) {
		int[] index = new int[2];
		int min = 0;
		int idx = 0;
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		if(a <= b ) {
			if(a <=c ) {
				min = a;
				idx = 0;
			}else {min = c;
			idx = 2;
			}
		}else {
			if(b <= c) {
				min = b;
				idx = 1;
			}else {
				min = c;
				idx = 2;
			}
		}
		index[0] = min;
		index[1] = idx;
		return index;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] cost_table = new int[N][3];

		for(int i=0; i<N; i++) {
			for(int j=0; j<3; j++) {
				int tmp = sc.nextInt();
				cost_table[i][j] = tmp;
			}
		}
		
		
       

	}

}
