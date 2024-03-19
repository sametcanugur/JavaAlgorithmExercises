package Exercises;

import java.util.Arrays;

public class ReturntheIndexofAllCapitalLetters {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(indexFinder("eQuINoX")));
	}

	public static int[] indexFinder(String word) {

		int[] emptyArray = {};
		if (word == null) {

			return emptyArray;
		}

		String result = "";
		for (int i = 0; i < word.length(); i++) {

			int numberHolder = word.charAt(i);
			if (numberHolder > 64 && numberHolder < 91) {

				result = result + i;
			}
		}

		if (result.length() == 0) {

			return emptyArray;
		}

		String[] indexArray = result.split("");
		int[] resultArray = new int[indexArray.length];
		for (int j = 0; j < resultArray.length; j++) {

			resultArray[j] = Integer.valueOf(indexArray[j]);
		}

		return resultArray;
	}
}
