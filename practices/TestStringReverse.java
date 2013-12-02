import org.junit.*;
import org.junit.Assert.*;

public class TestStringReverse {
	@BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("Before Class");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("Before Initialization");
	}
	@Test
	public void testShortNormalString() {
		assertEquals("cba", StringReverse.Reverse("abc"));
	}
	@Test
	public void testEmptyString() {
		assertEquals("", StringReverse.Reverse(""));
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}
	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println("tearDownClass");
	}
}