package MavenJenkinsPipeline.mvnPipelineDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FizzBuzzTest {

	public FizzBuzz fB;

	@BeforeMethod
	public void setUp() {
		fB = new FizzBuzz();
	}

	@Test
	public void testNumber() {
		String fizzBuzz = fB.play(1);
		Assert.assertEquals(fizzBuzz, "1");
	}

	@Test
	public void testFizz() {
		String fizzBuzz = fB.play(3);
		Assert.assertEquals(fizzBuzz, "Fizz");
	}

	@Test
	public void testBuzz() {
		String fizzBuzz = fB.play(5);
		Assert.assertEquals(fizzBuzz, "Buzz");
	}

	@Test
	public void testZero() {

		Assert.assertThrows(IllegalArgumentException.class, () -> fB.play(0));
	}

	@AfterMethod
	public void tearDown() {
		fB = null;
	}
}
