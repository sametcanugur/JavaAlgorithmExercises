package Exercises;

public class GCDofTwoNumbers {

	public static void main(String[] args) {
		System.out.println(greatestCommonDivisorFinder(0, 2));
	}

	public static int greatestCommonDivisorFinder(int number1, int number2) {
		if (number1 == 0 || number2 == 0) {
			return 0;
		}

		String result = "";
		for (int i = 1;; i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				result = result + i;
			}

			if (number1 / i < 1 || number2 / i < 1) {
				break;
			}
		}

		String[] array = result.split("");
		return Integer.valueOf(array[array.length - 1]);
	}
}
