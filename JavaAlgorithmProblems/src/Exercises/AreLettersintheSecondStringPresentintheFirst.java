package Exercises;

public class AreLettersintheSecondStringPresentintheFirst {

	public static void main(String[] args) {
		String[] array = { "parses", "parsesc" };
		System.out.println(letterChecking(array));
	}

	public static boolean letterChecking(String[] array) {
		if (array[1].length() > array[0].length()) {
			return false;
		}

		String text1 = array[0].toLowerCase();
		String text2 = array[1].toLowerCase();
		boolean check = false;

		for (int i = 0; i < text2.length(); i++) {

			for (int j = 0; j < text1.length(); j++) {

				if (text2.charAt(i) == text1.charAt(j)) {
					check = true;
					break;
				}
			}
		}

		return check;
	}
}
