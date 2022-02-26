import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {


    @Test
    void setSidePositive() {

        Square test = new Square(20, "Blue", true);
        test.setSide(3);
        Assertions.assertEquals(3, test.getSide());
    }

    @Test
    void setSideZero() {
        Square test = new Square(10, "Blue", true);
        test.setSide(0);
        Assertions.assertEquals(10, test.getSide());
    }

    @Test
    void createColor() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Square test = new Square(10, "", true);
        });
    }

    @Test
    void setSideNegative() {
        Square test = new Square(10, "Blue", true);
        test.setSide(-10);
        Assertions.assertEquals(10, test.getSide());
    }

    @Test
    void createSideZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Square test = new Square(0, "Green", true);
        });
    }

    @Test
    void createSideNegative() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Square test = new Square(-10, "Green", true);
        });
    }

    @Test
    void getArea() {
        Square test = new Square(10, "Green", true);
        assertEquals(100.0, test.getArea());
    }

    @Test
    void getPerimeter() {
        Square test = new Square(10, "Green", true);
        assertEquals(40, test.getPerimeter());
    }

    @Test
    void createNormal() {
        Square test = new Square(10, "Green", true);
        Assertions.assertEquals(10, test.getSide());
        Assertions.assertEquals("Green", test.getColor());
        Assertions.assertEquals(true, test.isFilled);

        Square test2 = new Square(50.2, "Red", false);
        Assertions.assertEquals(50.2, test2.getSide());
        Assertions.assertEquals("Red", test2.getColor());
        Assertions.assertEquals(false, test2.isFilled);


    }

}