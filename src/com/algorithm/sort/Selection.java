package com.algorithm.sort;


public class Selection {
	void sort(int[] list){
		int temp,maxIndex=0;
		for(int i=list.length-1;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				if(list[j]>list[maxIndex]) {
					maxIndex = j;
				}
			}
			temp = list[maxIndex];
			list[maxIndex] = list[i];
			list[i] = temp;
			maxIndex=0;
		}
	}
}
