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
					swap(q);
			}
		}
		return result;
	}

	public void swap(int pointer) {
		String data = result[pointer + 1];
		result[pointer + 1] = result[pointer];
		result[pointer] = data;
	}
}
