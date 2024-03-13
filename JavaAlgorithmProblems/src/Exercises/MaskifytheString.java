package Exercises;

public class MaskifytheString {

	public static void main(String[] args) {
		System.out.println(stringMaskifier("4556364607935616"));
	}

	public static String stringMaskifier(String number) {
		if (number == null) {
			return "Undefined";
		}

		if (number.length() <= 4) {
			return number;
		}

		String result = "";
		for (int i = 0; i < number.length(); i++) {

			if (i < number.length() - 4) {
				result = result + "#";
			} else {
				result = result + number.charAt(i);
			}
		}

		return result;
	}
}
