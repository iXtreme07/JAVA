import java.util.Locale;

public class workWithStrings {
    public static void main(String[] args) {
        String helloWorld = " Hello World! ";

        System.out.println(helloWorld.toLowerCase());
        System.out.println(helloWorld.toUpperCase());
        System.out.println(helloWorld.replace("World","Coders.Bay"));
        System.out.println(helloWorld.substring(1));
        System.out.println(helloWorld.length());
        for (int i = 15; i != 0; i--) {
            System.out.println(helloWorld);
        }
    }
}
