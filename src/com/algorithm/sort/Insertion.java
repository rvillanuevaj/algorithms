package com.algorithm.sort;


public class Insertion {
	void sort(int[] list){
		for(int i=1;i<list.length;i++) {
			int data = list[i];
			int j = i;
			int temp;
			while(j>0 && list[j-1]>data) {
				temp = list[j];
				list[j] = list[j-1];
				list[j-1] = temp;
				j--;
			}
		}
	}
}
