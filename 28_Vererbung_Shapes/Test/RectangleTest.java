import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void setLengthNegative() {
        Rectangle test = new Rectangle(20, 20, "Green", true);
        test.setLength(-3);
        Assertions.assertEquals(20, test.getLength());
    }

    @Test
    void setLengthZero() {
        Rectangle test = new Rectangle(20, 20, "Green", true);
        test.setLength(0);
        Assertions.assertEquals(20, test.getLength());
    }

    @Test
    void setLengthPositive() {
        Rectangle test = new Rectangle(20, 20, "Green", true);
        test.setLength(0.1);
        Assertions.assertEquals(0.1, test.getLength());
    }

    @Test
    void createLengthZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Rectangle test = new Rectangle(0, 20, "Green", true);
            ;
        });
    }

    @Test
    void createLengthNegative() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Rectangle test = new Rectangle(-10, 20, "Green", true);
            ;
        });
    }

    @Test
    void createLengthPositiveWithComer() {
        Rectangle test = new Rectangle(0.1, 20, "Green", true);
        Assertions.assertEquals(0.1, test.getLength());
    }

    @Test
    void setWidthNegative() {
        Rectangle test = new Rectangle(20, 20, "Green", true);
        test.setWidth(-3);
        Assertions.assertEquals(20, test.getWidth());
    }

    @Test
    void setWidthZero() {
        Rectangle test = new Rectangle(20, 20, "Green", true);
        test.setWidth(0);
        Assertions.assertEquals(20, test.getWidth());
    }

    @Test
    void setWidthPositive() {
        Rectangle test = new Rectangle(20, 20, "Green", true);
        test.setWidth(0.1);
        Assertions.assertEquals(0.1, test.getWidth());
    }

    @Test
    void createWidthZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Rectangle test = new Rectangle(20, 0, "Green", true);
        });
    }

    @Test
    void createWidthNegative() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Rectangle test = new Rectangle(10, -20, "Green", true);
            ;
        });
    }

    @Test
    void createWidthPositiveWithComer() {
        Rectangle test = new Rectangle(10, 0.1, "Green", true);
        Assertions.assertEquals(0.1, test.getWidth());
    }

    @Test
    void getAreaWithComer() {
        Rectangle test = new Rectangle(50.5, 20.5, "Green", true);
        test.getArea();
        assertEquals(1035.25, test.getArea());
    }

    @Test
    void getAreaWithoutComer() {
        Rectangle test = new Rectangle(50, 20, "Green", true);
        assertEquals(1000, test.getArea());
    }

    @Test
    void getPerimeterWithComer() {
        Rectangle test = new Rectangle(50.5, 20.5, "Green", true);
        assertEquals(142.0, test.getPerimeter());
    }

    @Test
    void getPerimeterWithoutComer() {
        Rectangle test = new Rectangle(50, 20, "Green", true);
        assertEquals(140.0, test.getPerimeter());
    }

    @Test
    void createWidthNoColor() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Rectangle test = new Rectangle(10, 20, "", true);
            ;
        });
    }

    @Test
    void createNormal() {
        Rectangle test = new Rectangle(0.2, 0.1, "Green", true);
        Assertions.assertEquals(0.2, test.getLength());
        Assertions.assertEquals(0.1, test.getWidth());
        Assertions.assertEquals("Green", test.getColor());
        Assertions.assertEquals(true, test.isFilled);

        Rectangle test2 = new Rectangle(50.2, 50.1, "Red", false);
        Assertions.assertEquals(50.2, test2.getLength());
        Assertions.assertEquals(50.1, test2.getWidth());
        Assertions.assertEquals("Red", test2.getColor());
        Assertions.assertEquals(false, test2.isFilled);
    }

}