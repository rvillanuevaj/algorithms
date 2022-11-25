package com.algorithm.sort;

import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
		int[] disorderInts = new int[] {
				1,5,8,9,12,5
		};
		System.out.println(Arrays.toString(disorderInts));
		new Bubble().sort(disorderInts);
		System.out.println(Arrays.toString(disorderInts));
	}
}