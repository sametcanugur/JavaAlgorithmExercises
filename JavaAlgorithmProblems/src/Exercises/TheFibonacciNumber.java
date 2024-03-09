package Exercises;

public class TheFibonacciNumber {

	public static void main(String[] args) {
		System.out.println(fibonacciNumberFinder(12));
	}

	public static int fibonacciNumberFinder(int inputNumber) {
		if (inputNumber < 1) {
			return -1;
		}

		int[] array = new int[inputNumber + 1];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i <= inputNumber; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}

		return array[inputNumber];
	}
}
