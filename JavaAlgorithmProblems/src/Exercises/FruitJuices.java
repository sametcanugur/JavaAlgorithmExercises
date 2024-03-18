package Exercises;

public class FruitJuices {

	public static void main(String[] args) {

		System.out.println(stringTrimmerAndMerger("passion fruit", "750ml"));
	}

	public static String stringTrimmerAndMerger(String text1, String text2) {

		if (text1 == null || text2 == null) {
			return "Undefined";
		}

		String upperText = text1.toUpperCase();
		String[] array = upperText.split(" ");
		String resultText1 = "";

		for (int j = 0; j < array.length; j++) {

			for (int k = 0; k < array[j].length(); k++) {

				if (k < 3) {
					resultText1 = resultText1 + array[j].charAt(k);
				}
			}
		}

		String resultText2 = "";
		for (int i = 0; i < text2.length(); i++) {

			int numberHolder = text2.charAt(i);
			if (numberHolder > 47 && numberHolder < 58) {
				resultText2 = resultText2 + text2.charAt(i);
			}
		}

		return resultText1 + resultText2;
	}
}