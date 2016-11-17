package fibonacci.version2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CacheFibonacciTest {

	@Test
	public void test() {
		assertThat(CacheFibonacci.fibo(10), is(55));
	}

}