package com.bheem;

import java.util.Random;
import java.util.stream.IntStream;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Jai Maa Sarswati!!!");
		String str = "hhhhhhjhfdgdg";
		str.concat("love"); //immutable
		System.out.println(str);
		Random rd = new Random();
		
		for(int i=0; i<20; i++) {
			System.out.print("  "+rd.nextInt(15));
		}
       IntStream a = rd.ints();
       System.out.println();
       System.out.println(" hhhhhh");
      // System.out.println(a.count());
      // System.out.print(a.sum());
       System.out.println(" ggggg");
	}

}
