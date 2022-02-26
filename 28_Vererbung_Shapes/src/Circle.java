public class Circle extends Shape {

    double radius;

    public Circle(double radius, String color, Boolean isFilled) {
        super(color, isFilled);
        if (radius <= 0) {
            throw new ArithmeticException("\nRadius in Circle can't be " + radius + "! \nOnly bigger Numbers as 0 are possible");
        }
        this.radius = radius;
        if (color == null || color == "" || color == " ") {
            throw new ArithmeticException("\nColor in Rectangle can't be emtpy!");
        }
        this.color = color;
        this.isFilled = isFilled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.err.println("Radius of 0 and smaller is not possible");
        }
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

}