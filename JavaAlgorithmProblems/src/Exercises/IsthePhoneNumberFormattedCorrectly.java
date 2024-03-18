package Exercises;

public class IsthePhoneNumberFormattedCorrectly {

	public static void main(String[] args) {

		System.out.println(numberFormatChecker("(123) 456-7890"));
	}

	public static boolean numberFormatChecker(String text) {

		if (text == null || text.length() != 14 || text.charAt(0) != '(' || text.charAt(4) != ')'
				|| text.charAt(5) != ' ' || text.charAt(9) != '-') {
			return false;
		}

		for (int i = 1; i < text.length(); i++) {

			int numberHolder = text.charAt(i);
			if ((i > 0 && i < 4) || (i > 5 && i < 9) || i > 9) {

				if (numberHolder < 48 || numberHolder > 57) {
					return false;
				}
			}
		}

		return true;
	}
}
