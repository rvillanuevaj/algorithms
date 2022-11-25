package com.algorithm.recursive;

public class Factorial {
	public void get(int factorialOf) {
		System.out.println("Recursive" + factorialR(factorialOf));
		System.out.println("Iterative:" + factorialI(factorialOf));
	}
	
	//Recursive
	private int factorialR(int n) {
		if (n<=1) {
			return 1;
		}
		return n * factorialR(n-1);
	}
	
	//Iterative
	private int factorialI(int n) {
		int factorial = 1;
		for(int i=1;i<=n;i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
