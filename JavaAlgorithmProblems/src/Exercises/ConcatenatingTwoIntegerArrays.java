package Exercises;

import java.util.Arrays;

public class ConcatenatingTwoIntegerArrays {

	public static void main(String[] args) {
		int[] firstArray = { 7, 8 };
		int[] secondArray = { 10, 9, 1, 1, 2 };
		System.out.println(Arrays.toString(concenaterTwoArray(firstArray, secondArray)));
	}

	public static int[] concenaterTwoArray(int[] firstArray, int[] secondArray) {
		int sumDimension = firstArray.length + secondArray.length;
		int[] resultArray = new int[sumDimension];
		int k = 0;

		for (int i = 0; i < sumDimension; i++) {

			if (i >= firstArray.length) {
				resultArray[i] = secondArray[k];
				k++;
			} else {
				resultArray[i] = firstArray[i];
			}
		}

		return resultArray;
	}
}
