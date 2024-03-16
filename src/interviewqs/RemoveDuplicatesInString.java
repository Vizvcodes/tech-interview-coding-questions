package interviewqs;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a string");
			String inputString = scanner.nextLine();
			String modifiedString = removeDuplicates(inputString);
			System.out.println((modifiedString));
		}

	}

	static String removeDuplicates(String inputString) {

		char[] inputStringAsArray = inputString.toCharArray();
		System.out.println(inputStringAsArray);
		Arrays.sort(inputStringAsArray);
		String sortedString = new String(inputStringAsArray);
		return sortedString.replaceAll("(.)\\1+", "$1");
//		System.out.println(inputStringAsArray);

	}

}
