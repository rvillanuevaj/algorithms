package com.algorithm.sort;


public class Bubble {
	void sort(int[] list){
		int temp;
		for(int i=list.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(list[j]>list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}
}
