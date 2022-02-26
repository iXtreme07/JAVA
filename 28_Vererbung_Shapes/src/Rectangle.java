public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width, String color, Boolean isFilled) {
        super(color, isFilled);
        if (length <= 0) {
            throw new ArithmeticException("\nLenght in Rectangle can't be " + length + "! \nOnly bigger Numbers as 0 are possible");
        }
        this.length = length;
        if (width <= 0) {
            throw new ArithmeticException("\nWidth in Rectangle can't be " + width + "! \nOnly bigger Numbers as 0 are possible");
        }
        this.width = width;
        if (color == null || color == "" || color == " ") {
            throw new ArithmeticException("\nColor in Rectangle can't be emtpy!");
        }
        this.color = color;
        this.isFilled = isFilled;
    }

    public double getLength() {
        return length;

    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.err.println("Length of 0 and smaller is not possible");
        }

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.err.println("Width of 0 and smaller is not possible");
        }
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }


}