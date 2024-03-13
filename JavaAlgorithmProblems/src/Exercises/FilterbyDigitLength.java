package Exercises;

import java.util.Arrays;

public class FilterbyDigitLength {

	public static void main(String[] args) {
		int[] array = { 88, 232, 4, 9721, 555 };
		System.out.println(Arrays.toString(filteredByDigitLength(array, 3)));
	}

	public static int[] filteredByDigitLength(int[] inputArray, int number) {
		int[] emptyArray = {};
		if (inputArray == null) {
			return emptyArray;
		}

		String result = "";

		for (int i = 0; i < inputArray.length; i++) {

			String numberHolder = String.valueOf(inputArray[i]);
			if (numberHolder.length() == number) {
				result = result + numberHolder + " ";
			}
		}

		if (result.length() == 0) {
			return emptyArray;
		}

		String[] stringArray = result.split(" ");
		int[] resultArray = new int[stringArray.length];

		for (int i = 0; i < resultArray.length; i++) {

			resultArray[i] = Integer.valueOf(stringArray[i]);
		}

		return resultArray;
	}
}
