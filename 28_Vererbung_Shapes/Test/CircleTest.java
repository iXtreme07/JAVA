import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void setRadiusPositive() {

        Circle test = new Circle(20, "Blue", true);
        test.setRadius(3);
        Assertions.assertEquals(3, test.getRadius());
    }

    @Test
    void setRadiusZero() {
        Circle test = new Circle(10, "Blue", true);
        test.setRadius(0);
        Assertions.assertEquals(10, test.getRadius());
    }

    @Test
    void createColor() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Circle test = new Circle(10, "", true);
        });
    }

    @Test
    void setRadiusNegative() {
        Circle test = new Circle(10, "Blue", true);
        test.setRadius(-10);
        Assertions.assertEquals(10, test.getRadius());
    }

    @Test
    void createRadiusZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Circle test = new Circle(0, "Green", true);
        });
    }

    @Test
    void createRadiusNegative() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Circle test = new Circle(-10, "Green", true);
        });
    }

    @Test
    void getArea() {
        Circle test = new Circle(10, "Green", true);
        assertEquals(314.1592653589793, test.getArea());
    }

    @Test
    void getPerimeter() {
        Circle test = new Circle(10, "Green", true);
        assertEquals(62.83185307179586, test.getPerimeter());
    }

    @Test
    void createNormal() {
        Circle test = new Circle(10, "Green", true);
        Assertions.assertEquals(10, test.getRadius());
        Assertions.assertEquals("Green", test.getColor());
        Assertions.assertEquals(true, test.isFilled);

        Circle test2 = new Circle(50.2, "Red", false);
        Assertions.assertEquals(50.2, test2.getRadius());
        Assertions.assertEquals("Red", test2.getColor());
        Assertions.assertEquals(false, test2.isFilled);


    }
}