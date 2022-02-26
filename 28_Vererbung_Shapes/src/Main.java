import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Shape> allShapes = new ArrayList<>();


        Circle rundi = new Circle(10, "Green", false);
        Rectangle rechti = new Rectangle(10, 15, "Blue", true);
        Square quadi = new Square(10, "Yellow", true);
        allShapes.add(rundi);
        allShapes.add(rechti);
        allShapes.add(quadi);

        System.out.println(rundi.getPerimeter());
        System.out.println(rechti.getPerimeter());
        System.out.println(quadi.getPerimeter());

        System.out.println(rundi.getArea());
        System.out.println(rechti.getArea());
        System.out.println(quadi.getArea());

        rechti.setLength(-1);

       // System.out.println("\uD83D\uDC9A"); //this is just 4 fun :-D
    }
}
