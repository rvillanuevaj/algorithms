package com.algorithm.sort;

import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
		int[] disorderInts = new int[] {
				1,7,99,5,8,9,12,5
		};
		System.out.println(Arrays.toString(disorderInts));
		int[] orderInts = new MergeSort().sort(disorderInts);
		System.out.println("Result: ");
		System.out.println(Arrays.toString(orderInts));
	}
}