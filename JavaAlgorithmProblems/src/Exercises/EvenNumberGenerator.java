package Exercises;

import java.util.Arrays;

public class EvenNumberGenerator {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(evenNumbersFinder(2)));
	}

	public static int[] evenNumbersFinder(int number) {
		int[] array = new int[number / 2];
		int counter = 0;
		for (int i = 2; i <= number; i++) {
			if (i % 2 == 0) {
				array[counter] = i;
				counter++;
			}
		}
		return array;
	}
}
