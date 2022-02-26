import org.junit.jupiter.api.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Testing {


    @BeforeAll
    void beforeAll() {
        System.out.println("Before All");
    }
    @BeforeEach
    void runBefore() {
        System.out.println("Befor Test");
    }

    @Test
    void firstTester() {
        System.out.println("Hello World");
    }

    @Test
    @Disabled
    void secondTester() {
        System.out.println("Hello World secondTest");
    }

    @AfterEach
    void runAfter() {
        System.out.println("AfterTest");
    }
    @AfterAll
    void afterAll() {
        System.out.println("After All");
    }
}
