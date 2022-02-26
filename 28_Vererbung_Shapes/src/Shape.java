public abstract class Shape {

    String color;
    Boolean isFilled;


    public Shape(String color, Boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;

    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }


}