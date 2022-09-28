package mx.com.nath.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MainClassTest {

	@Test
	void get_only_multiples_of_3_or_5_from_first_10_numbers() throws Exception {
		final List<Integer> multiples = MainClass.getMultiples(3, 5, 10);
		assertEquals(Arrays.asList(3, 5, 6, 9), multiples);
	}

}
