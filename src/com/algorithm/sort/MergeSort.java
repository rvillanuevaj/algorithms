package com.algorithm.sort;

import java.util.Arrays;

public class MergeSort {
	public int[] sort(int[] list){
		return mergeSort(list);
	}

	private int[] mergeSort(int[] list) {
		if(list.length<=1) {
			return list;
		}
		int[] left = Arrays.copyOfRange(list, 0, list.length/2);
		int[] right = Arrays.copyOfRange(list, list.length/2, list.length);
		return merge(mergeSort(left),mergeSort(right));
	}
	
	private int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length+right.length];
		

		System.out.println("-----------------------------------");
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		
		int indexL=0,indexR=0, indexRes=0;
		
		while(indexL<left.length && indexR<right.length) {
			if(left[indexL]<right[indexR]) {
				result[indexRes] = left[indexL];
				indexL++;
			}
			else {
				result[indexRes] = right[indexR];
				indexR++;
			}
			indexRes++;
		}
		
		if(indexL<left.length) {
			copyInResult(result,left,indexL,indexRes);
		}
		else if(indexR<right.length) {
			copyInResult(result,right,indexR,indexRes);
		}
		
		System.out.println("Merge Result: " + Arrays.toString(result));
		return result;
	}
	
	private void copyInResult(int[] result,int[] arrayToCopy,int indexToCopy,int indexResult) {
		for(int i = indexToCopy; i<arrayToCopy.length; i++) {
			result[indexResult] = arrayToCopy[i];
			indexResult++;
		}
	}
}
