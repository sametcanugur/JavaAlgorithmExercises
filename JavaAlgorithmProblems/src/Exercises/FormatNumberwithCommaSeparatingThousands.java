package Exercises;

public class FormatNumberwithCommaSeparatingThousands {

	public static void main(String[] args) {
		System.out.println(thousandSeperator(10000));
	}

	public static String thousandSeperator(int number) {
		String convertedNumber = String.valueOf(number);
		if (convertedNumber.length() <= 3) {
			return convertedNumber;

		}

		String result = "";
		for (int i = 0; i < convertedNumber.length(); i++) {
			if (i == convertedNumber.length() - 3) {
				result = result + ",";
			}

			result = result + convertedNumber.charAt(i);
		}
		return result;
	}
}
