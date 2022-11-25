package com.algorithm.recursive;

public class Fibonacci {
	public void get(int fibonnaciOf) {
		System.out.println("Recursive" + fibonnaciR(fibonnaciOf));
		System.out.println("Iterative:" + fibonnaciI(fibonnaciOf));
	}
	
	//Recursive
	private int fibonnaciR(int n) {
		if (n <= 2) {
			return 1;
		}
		return fibonnaciR(n-1) + fibonnaciR(n-2);
	}
	
	//Iterative
	private int fibonnaciI(int n) {
		int num1 = 0;
		int num2 = 1;
		int factorial=0;
		
		if(n==0) {
			return num1;
		}
		if(n==1) {
			return num2;
		}
		
		for(int i=2;i<=n;i++) {
			factorial = num1 + num2;
			num1=num2;
			num2=factorial;
		}
		
		return factorial;
	}
}
