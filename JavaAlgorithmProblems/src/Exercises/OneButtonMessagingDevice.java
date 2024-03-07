package Exercises;

public class OneButtonMessagingDevice {

	public static void main(String[] args) {
		System.out.println(letterCounter("qudusayo"));
	}

	public static int letterCounter(String text) {
		int number = 0;
		int sum = 0;
		
		for (int i = 0; i < text.length(); i++) {
			number = text.charAt(i);
			if (number >= 97 && number <= 122) {
				sum = sum + number - 96;
			}
		}
		return sum;
	}
}
