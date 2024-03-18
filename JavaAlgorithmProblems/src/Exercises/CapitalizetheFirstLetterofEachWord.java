package Exercises;

public class CapitalizetheFirstLetterofEachWord {

	public static void main(String[] args) {

		System.out.println(firstLetterOfWordCapitalizer("capitalize every word"));
	}

	public static String firstLetterOfWordCapitalizer(String sentence) {

		if (sentence == null) {
			return "Undefined";
		}

		String[] array = sentence.split(" ");
		String result = "";

		for (int i = 0; i < array.length; i++) {

			String holder = String.valueOf(array[i].charAt(0));
			String word = holder.toUpperCase();
			for (int j = 1; j < array[i].length(); j++) {

				word = word + array[i].charAt(j);
			}

			result = result + word + " ";
		}

		return result;
	}
}
