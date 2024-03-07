package Exercises;

public class BetweenWords {

	public static void main(String[] args) {
		System.out.println(alphabeticallySorter2("monk", "monument", "monkey"));
	}

	public static boolean alphabeticallySorter(String first, String last, String word) {
		if (first == null || last == null || word == null) {
			return false;
		}

		char[] firstArray = first.toCharArray();
		char[] lastArray = last.toCharArray();
		char[] wordArray = word.toCharArray();

		boolean firstCheck = false;
		boolean secondCheck = false;
		int number1 = 0;
		int number2 = 0;

		for (int i = 0;; i++) {
			if (firstArray[i] != wordArray[i]) {
				number1 = firstArray[i];
				number2 = wordArray[i];
				if (number1 < number2) {
					firstCheck = true;
				}

				break;
			}

			if (i == firstArray.length - 1) {
				firstCheck = true;
				break;
			}

			if (i == wordArray.length - 1) {
				firstCheck = false;
				break;
			}
		}

		for (int j = 0;; j++) {
			if (lastArray[j] != wordArray[j]) {
				number1 = lastArray[j];
				number2 = wordArray[j];
				if (number1 > number2) {
					secondCheck = true;
				}

				break;
			}

			if (j == lastArray.length - 1) {
				secondCheck = false;
				break;
			}

			if (j == wordArray.length - 1) {
				secondCheck = true;
				break;
			}
		}

		if (firstCheck == true && secondCheck == true) {
			return true;
		}

		return false;
	}

	public static boolean alphabeticallySorter2(String first, String last, String word) {
		boolean firstCheck = false;
		boolean secondCheck = false;
		int number1 = 0;
		int number2 = 0;

		for (int i = 0;; i++) {
			if (first.charAt(i) != word.charAt(i)) {
				number1 = first.charAt(i);
				number2 = word.charAt(i);
				if (number1 < number2) {
					firstCheck = true;
				}

				break;
			}

			if (i == first.length() - 1) {
				firstCheck = true;
				break;
			}

			if (i == word.length() - 1) {
				firstCheck = false;
				break;
			}
		}

		for (int j = 0;; j++) {
			if (last.charAt(j) != word.charAt(j)) {
				number1 = last.charAt(j);
				number2 = word.charAt(j);
				if (number1 > number2) {
					secondCheck = true;
				}

				break;
			}

			if (j == last.length() - 1) {
				secondCheck = false;
				break;
			}

			if (j == word.length() - 1) {
				secondCheck = true;
				break;
			}
		}

		if (firstCheck == true && secondCheck == true) {
			return true;
		}

		return false;
	}
}