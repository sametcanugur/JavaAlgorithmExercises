package Exercises;

public class TheReverser {

	public static void main(String[] args) {

		System.out.println(stringReverser("Hello World"));
	}

	public static String stringReverser(String text) {

		if (text == null) {

			return "Undefined";
		}

		if (text.isEmpty()) {

			return "";
		}

		String[] array = text.split("");
		String result = "";

		for (int i = array.length - 1; i >= 0; i--) {

			int numberHolder = text.charAt(i);
			if (numberHolder > 64 && numberHolder < 91) {

				array[i] = array[i].toLowerCase();
			} else {
				array[i] = array[i].toUpperCase();
			}

			result = result + array[i];
		}

		return result;
	}
}
