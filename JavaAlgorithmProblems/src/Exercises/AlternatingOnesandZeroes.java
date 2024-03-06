package Exercises;

public class AlternatingOnesandZeroes {

	public static void main(String[] args) {
		System.out.println(stringRearranger("1101001"));
	}

	public static boolean stringRearranger(String text) {
		if (text == null) {
			return false;
		}
		String[] splitArray = text.split("");
		int countOfZero = 0;
		int countOfOne = 0;

		for (int i = 0; i < splitArray.length; i++) {
			if (splitArray[i].equals("0")) {
				countOfZero++;
			}
			if (splitArray[i].equals("1")) {
				countOfOne++;
			}
		}

		if (countOfZero == 0 || countOfOne == 0) {
			return false;
		}
		if (countOfZero - countOfOne == 1 || countOfOne - countOfZero == 1 || countOfOne - countOfZero == 0) {
			return true;
		}
		return false;
	}
}
