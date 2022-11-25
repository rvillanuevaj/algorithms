package com.algorithm.recursive;

public class ReverseWord {
	public void getReverse(String word) {
		String res = reverse(word.toCharArray(),word.length()-1);
		System.out.println(res);
	}
	
	private String reverse(char[] word,int lenght) {
		if(lenght==0) {
			return "" + word[0];
		}
		return word[lenght] + reverse(word ,lenght-1);
	}
}
