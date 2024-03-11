package Exercises;

public class RemoveAllSpecialCharactersfromaString {

	public static void main(String[] args) {
		System.out.println(specialCharacterRemover("fd76fd-6GvKlO"));
	}

	public static String specialCharacterRemover(String text) {
		if (text == null) {
			return "undefined";
		}

		int numberHolder = 0;
		String result = "";

		for (int i = 0; i < text.length(); i++) {
			numberHolder = text.charAt(i);
			if ((numberHolder > 47 && numberHolder < 58) || (numberHolder > 64 && numberHolder < 91)
					|| (numberHolder > 96 && numberHolder < 123) || (numberHolder == 32) || (numberHolder == 45)
					|| (numberHolder == 95)) {
				result = result + text.charAt(i);
			}
		}

		return result;
	}
}
