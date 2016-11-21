package homework1117;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HomeWork1177Test {

	@Test
	public void test() {

		assertTrue(HomeWork1177.check("[]"));
		assertTrue(HomeWork1177.check("{}"));
		assertTrue(HomeWork1177.check("{[]}"));
		assertFalse(HomeWork1177.check("{[]}}"));
	}



}