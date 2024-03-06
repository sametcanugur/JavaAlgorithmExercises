package Exercises;

public class FindtheMeanofAllDigits {

	public static void main(String[] args) {
		System.out.println(findMeanOfNumber(12345));
	}

	public static int findMeanOfNumber(int inputNumber) {
		String convertedString = String.valueOf(inputNumber);
		String[] splitArray = convertedString.split("");
		int sum = 0;
		for (int i = 0; i < splitArray.length; i++) {
			sum = sum + Integer.valueOf(splitArray[i]);
		}
		return sum / splitArray.length;
	}
}
