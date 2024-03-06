package Exercises;

public class IstheStringPalindrome {

	public static void main(String[] args) {
		System.out.println(palindromeCheck("reviver"));
	}

	public static boolean palindromeCheck(String word) {
		if (word == null) {
			return false;
		}
		String reverseWord = "";
		String[] array = word.split("");
		for (int i = array.length - 1; i >= 0; i--) {
			reverseWord = reverseWord + array[i];
		}
		if (word.equals(reverseWord)) {
			return true;
		}
		return false;
	}
}
