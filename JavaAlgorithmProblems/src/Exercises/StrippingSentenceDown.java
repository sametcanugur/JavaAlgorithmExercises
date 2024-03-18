package Exercises;

public class StrippingSentenceDown {

	public static void main(String[] args) {

		System.out.println(sentenceTrimmer("the quick brown fox jumps over the lazy dog", "aeiou"));
	}

	public static String sentenceTrimmer(String sentence, String characters) {

		if (sentence == null || characters == null) {
			return "Undefined";
		}

		String result = "";
		for (int i = 0; i < sentence.length(); i++) {

			boolean check = true;
			for (int j = 0; j < characters.length(); j++) {

				if (sentence.charAt(i) != characters.charAt(j)) {
					check = true;
				} else {
					check = false;
					break;
				}
			}

			if (check == true) {
				result = result + sentence.charAt(i);
			}
		}

		return result;
	}
}
