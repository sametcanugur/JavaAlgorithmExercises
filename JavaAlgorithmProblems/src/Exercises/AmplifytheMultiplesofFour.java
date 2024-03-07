package Exercises;

public class AmplifytheMultiplesofFour {

	public static void main(String[] args) {
		System.out.println(25);
	}

	public static int[] divisibilityCheck(int number) {
		int[] array = new int[number];
		int count = 0;

		for (int i = 1; i <= number; i++) {
			if (i % 4 == 0) {
				array[count] = i * 10;
			} else {
				array[count] = i;
			}
			count++;
		}
		return array;
	}
}
