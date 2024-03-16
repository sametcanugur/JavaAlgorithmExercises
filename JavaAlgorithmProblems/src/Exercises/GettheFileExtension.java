package Exercises;

import java.util.Arrays;

public class GettheFileExtension {

	public static void main(String[] args) {
		String[] array = { "ruby.rb", "cplusplus.cpp", "python.py", "javascript.js" };
		System.out.println(Arrays.toString(extensionFinder(array)));
	}

	public static String[] extensionFinder(String[] inputArray) {
		String[] emptyArray = {};
		for (int m = 0; m < inputArray.length; m++) {

			if (inputArray[m] == null || inputArray[m].isEmpty()) {
				return emptyArray;
			}
		}

		String result = "";
		for (int i = 0; i < inputArray.length; i++) {
			result = result + inputArray[i] + ".";
		}

		String[] convertedArray = result.split("\\.");
		String[] resultArray = new String[inputArray.length];
		int k = 0;

		for (int j = 0; j < convertedArray.length; j++) {

			if (j % 2 != 0) {
				resultArray[k] = convertedArray[j];
				k++;
			}
		}

		return resultArray;
	}
}
