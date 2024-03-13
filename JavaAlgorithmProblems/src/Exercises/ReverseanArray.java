package Exercises;

import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(arrayReverser(array)));
	}

	public static int[] arrayReverser(int[] inputArray) {
		int[] reverseArray = new int[inputArray.length];
		int k = inputArray.length - 1;

		for (int i = 0; i < reverseArray.length; i++) {
			reverseArray[i] = inputArray[k];
			k--;
		}

		return reverseArray;
	}
}
