package comparator;

public class Comparator {
	String str1, str2;

	public Comparator(Object item1, Object item2) {
		str1 = (String) item1;
		str2 = (String) item2;
	}

	public boolean isGreaterThan() {
		return str1.compareTo(str2) > 0;
	}

	public boolean isEqualTo() {
		return str1.compareTo(str2) == 0;
	}

	public boolean isLessThan() {
		return str1.compareTo(str2) < 0;
	}
	
	public boolean isGreaterOrEqualTo() {
		return str1.compareTo(str2) >= 0;
	}
	
	public boolean isLessOrEqualTo() {
		return str1.compareTo(str2) <= 0;
	}
}
