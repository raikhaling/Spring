package programming;

import java.util.List;

public class FPO1Structured {

	public static void main(String[] args) {
		printAllNumbersInListStructured(List.of(1, 2, 3, 4, 5, 6, 7, 1, 2, 8));

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// traditional structural procedure
		for (int number : numbers) {
			System.out.print(number);
		}
		System.out.println();
		System.out.println("Even numbers are:");
		for (int number : numbers) {

			if (number % 2 == 0) {
				System.out.print(number);
			}
		}

	}

}
