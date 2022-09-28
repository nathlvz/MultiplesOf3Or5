package mx.com.nath.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(final String... args) {
		System.out.println("Total is: " + executeCalulation(getMultiples(3, 5, 1000)));
	}

	public static List<Integer> getMultiples(final int multipleA, final int multipleB, final int limit) {
		final List<Integer> multipliers = new ArrayList<>();
		for (int currentNaturalNumber = 1; currentNaturalNumber < limit; currentNaturalNumber++) {
			if (currentNaturalNumber % multipleA == 0 || currentNaturalNumber % multipleB == 0) {
				multipliers.add(currentNaturalNumber);
			}
		}
		return multipliers;
	}

	public static int executeCalulation(final List<Integer> multiples) {
		return multiples.stream().mapToInt(v -> v).sum();
	}
}
