package com.bheem;

import java.util.Scanner;

public class ThoughtWorksCountries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_cases = sc.nextInt();
		for (int w = 0; w < test_cases; w++) {
			
			int N = sc.nextInt();
			int[] c_arr = new int[N];
			for (int s = 0; s < N; s++) {
				c_arr[s] = sc.nextInt();
			}
			int j = 0;
			int country = 0;
			//System.out.println();
			//System.out.println("Starting... ");
			boolean isValid = true;
			while (j < N) {
				int tmp = c_arr[j];
				if (tmp != 1) {
					boolean isRight = false;
					int upper_bound = j + tmp;
					int s = 0;
					try {
						for (s = j + 1; s < upper_bound; s++) {
							//System.out.println("s=j+1  : "+s);
							if (tmp == c_arr[s]) {
								isRight = true;
							} else {
								isRight = false;
								break;
							}
						}
					} catch (Exception e) {
						isValid = false;
						isRight = false;
					}
					if (!isRight) {
						isValid = false;
						break;
					} else {
						country++;
						j = s;
					}
				} else {
					country++;
					j++;
				}
			}
			if (!isValid) {
				System.out.println("Invalid Data");
			} else
				System.out.println(country);
		}
	}

}
