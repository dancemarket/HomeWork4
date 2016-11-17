package fibonacci.version1;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NoCacheFibonacciTest {

	@Test
	public void testFibonacci () {
		//given

		//when
		int result = NoCacheFibonacci.fibo(10);

		//then
		assertThat(result, is(89));
	}

	@Test
	public void testFibonacci2 () {
		//given

		//when
		int result = NoCacheFibonacci.fibo(5);

		//then
		assertThat(result, is(8));
	}

}