package com.bheem;

import java.util.Scanner;

public class SamShoppingFinal {
	public static int[] getMin(int[] arr, int skip) {
		int[] index = new int[2];
		int min = 100000000;
		int idx = 0;
		for(int i=0; i<arr.length; i++) {
			if(i != skip) {
				int tmp = arr[i];
				if(tmp <= min) {
					min = arr[i];
					idx = i;
				}
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
		
		int totalCost = 0;
		int index = -2;
		for(int i=0; i<N; i++) {
			int[] tmp = getMin(cost_table[i], index);
			totalCost = totalCost + tmp[0];
			index = tmp[1];
		}
		System.out.println(totalCost);

	}

}
