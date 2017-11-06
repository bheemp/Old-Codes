package com.bheem;

import java.util.ArrayList;
import java.util.Scanner;

public class SamuAndShoping {
	
	public static int[] minIndex(int[] arr) {
		int[] index_arr = new int[3];
		int min = arr[0];
		int index_zero = 0;
		int index_two = 0;
		int max = min;
		arr[0] = -2;
		for(int i=1; i<3; i++) {
			if(arr[i] <= min) {
				min = arr[i];
				index_zero = i;
				arr[i] = -2;
			}
			if(arr[i] >= max) {
				max = arr[i];
				index_two = i;
			}
		}
		int index_one = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		return index_arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		for(int z=0; z<test_cases; z++) {
			int N = sc.nextInt();
			int[][] cost_table = new int[N][3];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<3; j++) {
					int tmp = sc.nextInt();
					cost_table[i][j] = tmp;
				}
			}
			
			int[] row_one = new int[3];
			for(int i=0; i<N; i++) {
				for(int j=0; j<3; j++) {
				
				}
			}
			
		}

	}

}
