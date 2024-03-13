package Exercises;

import java.util.Arrays;

public class ReturntheFourLetterStrings {

	public static void main(String[] args) {
		String[] array = { "Ryan", "Kieran", "Jason", "Matt" };
		System.out.println(Arrays.toString(findingArrayElement(array)));
	}

	public static String[] findingArrayElement(String[] inputArray) {
		String result = "";
		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i].length() == 4) {
				result = result + inputArray[i] + " ";
			}
		}

		String[] resultArray = result.split(" ");
		return resultArray;
	}
}
