package id.test.springboottesting.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ShortSetTest {

	@Test
	void testJustThat() {
		int expectedSize = 100;
		int actualSize = ShortSet.justThat();

		assertEquals(expectedSize, actualSize);
	}
}
