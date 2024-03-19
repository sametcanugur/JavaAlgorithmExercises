package Exercises;

public class TrimmedAverages {

	public static void main(String[] args) {

		int[] array = { 10, 25, 5, 15, 20 };
		System.out.println(finderAvarageNumbersInArray(array));
	}

	public static int finderAvarageNumbersInArray(int[] array) {

		if (array == null) {

			return -1;
		}

		int numberHolder = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] < array[j + 1]) {

					numberHolder = array[j];
					array[j] = array[j + 1];
					array[j + 1] = numberHolder;
				}
			}
		}

		int sum = 0;
		for (int k = 1; k < array.length; k++) {

			if (k != array.length - 1) {

				sum = sum + array[k];
			}
		}

		return sum / (array.length - 2);
	}
}
