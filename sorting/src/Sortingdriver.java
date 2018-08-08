import sortingMethod.*;

public class Sortingdriver {

	public static void main(String[] args) {
		
	String[] input = { "123", "abc", "abc", "sdf", "adasd", "bdfsd" , "z"};
	SortingMethod s = new SortingMethod(input);
	//s.BubbleSort();
		
		// testing
		for (int i = 0; i < input.length; i++)
			System.out.println(input[i]);
	}

}
