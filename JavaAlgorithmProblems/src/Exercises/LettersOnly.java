package Exercises;

public class LettersOnly {

	public static void main(String[] args) {
		System.out.println(findingLetters("R!=:~0o0./c&}9k`60=y"));
	}

	public static String findingLetters(String text) {
		if (text == null) {
			return "";
		}
		char[] convertedArray = text.toCharArray();
		String resultText = "";
		int number = 0;
		
		for (int i = 0; i < convertedArray.length; i++) {
			number = convertedArray[i];
			if ((number >= 65 && number <= 90) || (number >= 97 && number <= 122)) {
				resultText = resultText + String.valueOf(convertedArray[i]);
			}
		}
		return resultText;
	}
}
