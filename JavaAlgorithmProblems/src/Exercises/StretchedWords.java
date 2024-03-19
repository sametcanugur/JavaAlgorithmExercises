package Exercises;

public class StretchedWords {

	public static void main(String[] args) {

		System.out.println(wordCreaterWithoutDuplicateLetters("cccccaaarrrbbonnnnn"));
	}

	public static String wordCreaterWithoutDuplicateLetters(String word) {

		if (word == null) {
			return "Undefined";
		}

		String convertedWord = word + " ";
		String result = "";

		for (int i = 0; i < convertedWord.length() - 1; i++) {

			if (convertedWord.charAt(i) != convertedWord.charAt(i + 1)) {

				result = result + convertedWord.charAt(i);
			}
		}

		return result;
	}
}
