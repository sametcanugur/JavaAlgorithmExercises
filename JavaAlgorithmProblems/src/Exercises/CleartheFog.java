package Exercises;

public class CleartheFog {

	public static void main(String[] args) {
		System.out.println(someLettersRemover("fogFogFogffoObirdsanffodthebffoeffoesGGGfOgFog"));
	}

	public static String someLettersRemover(String text) {
		if (text == null) {
			return "Undefined";
		}

		String newText = text.toLowerCase();
		String result = "";
		boolean check = false;

		for (int i = 0; i < newText.length(); i++) {
			if (newText.charAt(i) == 'f' || newText.charAt(i) == 'o' || newText.charAt(i) == 'g') {
				check = true;
			}

			else {
				result = result + newText.charAt(i);
			}
		}

		if (check == false) {
			return "It's a clear day!";
		}

		return result;
	}
}
