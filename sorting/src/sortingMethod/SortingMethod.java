package sortingMethod;

import comparator.*;

public class SortingMethod {
	String[] result;

	public SortingMethod(String[] input) {
		result = input;
	}

	public void BubbleSort() {
		for (int i = result.length - 1; i > 0; i--) 
		{
			for (int q = 0; q < i; q++) 
			{
				Comparator c = new Comparator(result[q], result[q + 1]);
				if (c.isGreaterThan()) 
				{
					String data = result[q + 1];
					result[q + 1] = result[q];
					result[q] = data;
				}
			}
		}		
	}
}
