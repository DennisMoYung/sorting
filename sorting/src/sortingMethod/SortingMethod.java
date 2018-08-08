package sortingMethod;

import java.util.Arrays;

import comparator.*;

public class SortingMethod {
	private String[] result;

	public String[] BubbleSort(String[] input) {
		result = Arrays.copyOf(input, input.length);
		for (int i = result.length - 1; i > 0; i--) {
			for (int q = 0; q < i; q++) {
				Comparator c = new Comparator(result[q], result[q + 1]);
				if (c.isGreaterThan())
					swap(q,q+1);
			}
		}
		return result;
	}
	
	public String[] SelectionSort(String[] input) {
		result = Arrays.copyOf(input, input.length);
		int min;
		if(result!= null){
			for(int loc = 0;loc < result.length-1 ;loc++){
				min  = loc;
			for(int i=loc+1;i<result.length;i++){
				Comparator c = new Comparator(result[min], result[i]);
				if (c.isGreaterThan())
					min =i;
			}
			swap(loc, min);
			}
		}
		return result;
		
	}

	public void swap(int pointer,int target) {
		String data = result[target];
		result[target] = result[pointer];
		result[pointer] = data;
	}
}
