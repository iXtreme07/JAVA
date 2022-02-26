public class Square extends Shape {
    double side;

    public Square(double side, String color, Boolean isFilled) {
        super(color, isFilled);
        if (side <= 0) {
            throw new ArithmeticException("\nSide in Square can't be " + side + "! \nOnly bigger Numbers as 0 are possible");
        }
        this.side = side;
        if (color == null || color == "" || color == " ") {
            throw new ArithmeticException("\nColor in Square can't be emtpy!");
        }
        this.color = color;
        this.isFilled = isFilled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {


        if (side > 0) {
            this.side = side;
        } else {
            System.err.println("Side of 0 and smaller is not possible");
        }
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
