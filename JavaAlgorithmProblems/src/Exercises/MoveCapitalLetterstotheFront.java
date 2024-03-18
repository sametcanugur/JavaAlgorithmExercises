package Exercises;

public class MoveCapitalLetterstotheFront {

	public static void main(String[] args) {

		System.out.println(capitalLetterSorter("shOrtCAKE"));
	}

	public static String capitalLetterSorter(String text) {

		if (text == null) {
			return "Undefined";
		}

		String upperCase = "";
		String lowerCase = "";

		for (int i = 0; i < text.length(); i++) {

			int numberHolder = text.charAt(i);
			if (numberHolder > 64 && numberHolder < 91) {
				upperCase = upperCase + text.charAt(i);
			} else {
				lowerCase = lowerCase + text.charAt(i);
			}
		}

		return upperCase + lowerCase;
	}
}
