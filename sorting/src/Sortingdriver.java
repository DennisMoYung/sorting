import sortingMethod.*;

public class Sortingdriver {

	public static void main(String[] args) {

		String[] input = { "123", "abc", "sdf", "adasd", "bdfsd", "z", "abc" };
		SortingMethod s = new SortingMethod();
		//String[] result = s.BubbleSort(input);
		String[] result = s.SelectionSort(input);
		// testing

		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);

	}

}
