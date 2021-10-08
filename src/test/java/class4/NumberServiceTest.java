package class4;

import basics.class4.NumberService;
import org.junit.*;

import static org.junit.Assert.*;

public class NumberServiceTest {
    private NumberService numberService = new NumberService();;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Doing @BeforeClass task!");
    }

    @Before
    public void setUp() {
        System.out.println("Doing @Before task!");
        numberService = new NumberService();
    }

    @Test
    public void testIsEvenWhenNumberIsEven() {
        assertTrue(numberService.isEven(2));
        assertEquals(true, numberService.isEven(2));
    }

    @Test
    public void testIsEvenWhenNumberIsOdd() {
        assertFalse(numberService.isEven(1));
    }

    @Test
    public void testAdd() {
        assertEquals(2, numberService.add(1, 1));
    }

    @Test(expected=RuntimeException.class)
    public void testThrowException() {
        numberService.throwException();
    }

    @After
    public void tearDown() {
        System.out.println("Doing @After task!");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Doing @AfterClass task!");
    }
}
