package Exercises;

public class FindTheLargestEvenNumber {

	public static void main(String[] args) {

		int[] array = { 3, 7, 2, 1, 7, 9, 10, 13 };
		System.out.println(largestEvenNumberFinder(array));
	}

	public static int largestEvenNumberFinder(int[] inputArray) {

		if (inputArray.length == 0) {
			return -1;
		}

		int numberHolder = 0;
		for (int i = 0; i < inputArray.length; i++) {

			for (int j = 0; j < inputArray.length - 1; j++) {

				if (inputArray[j] < inputArray[j + 1]) {
					numberHolder = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = numberHolder;
				}
			}
		}

		for (int k = 0; k < inputArray.length; k++) {

			if (inputArray[k] % 2 == 0) {

				return inputArray[k];
			}
		}

		return -1;
	}
}
