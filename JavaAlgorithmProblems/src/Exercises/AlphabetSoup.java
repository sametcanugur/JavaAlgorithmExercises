package Exercises;

public class AlphabetSoup {

	public static void main(String[] args) {
		System.out.println(sortedAlphabetically("javascript"));
	}
	
	public static String sortedAlphabetically(String text) {
		char[] charArray = text.toCharArray();
		int holder1 = 0;
		int holder2 = 0;
		char hold = ' ';
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length; j++) {
				holder1 = charArray[i];
				holder2 = charArray[j];
				if (holder1 < holder2) {
					hold = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = hold;
				}
			}
		}
		String result = String.valueOf(charArray);
		return result;
	}
}
