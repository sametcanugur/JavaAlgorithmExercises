package Exercises;

public class TotalNumberofUniqueCharacters {

	public static void main(String[] args) {
		System.out.println(uniqueCharacterCounter("apple", "play"));
	}

	public static int uniqueCharacterCounter(String text1, String text2) {
		if (text1 == null || text2 == null) {
			return -1;
		}

		if (text1.isEmpty() && text2.isEmpty()) {
			return 0;
		}

		String combinedText = text1 + text2;
		char[] array = combinedText.toCharArray();
		int numberHolder1 = 0;
		int numberHolder2 = 0;
		char charHold = ' ';

		for (int i = 0; i < combinedText.length(); i++) {

			for (int j = 0; j < combinedText.length() - 1; j++) {
				numberHolder1 = array[j];
				numberHolder2 = array[j + 1];

				if (numberHolder1 > numberHolder2) {
					charHold = array[j];
					array[j] = array[j + 1];
					array[j + 1] = charHold;
				}
			}
		}

		int count = 1;
		for (int k = 0; k < array.length - 1; k++) {
			if (array[k] != array[k + 1]) {
				count++;
			}
		}

		return count;
	}
}
