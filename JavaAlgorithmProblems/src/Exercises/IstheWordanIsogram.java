package Exercises;

public class IstheWordanIsogram {

	public static void main(String[] args) {
		System.out.println(checkingDuplicateLetters("Consecutive"));
	}

	public static boolean checkingDuplicateLetters(String word) {
		if (word == null) {
			return false;
		}

		String convertedWord = word.toLowerCase();

		for (int i = 0; i < convertedWord.length(); i++) {

			for (int j = 0; j < convertedWord.length(); j++) {

				if (convertedWord.charAt(i) == convertedWord.charAt(j) && i != j) {
					return false;
				}
			}
		}

		return true;
	}
}
