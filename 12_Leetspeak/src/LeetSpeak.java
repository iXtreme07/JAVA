import java.util.Scanner;

public class LeetSpeak {
    public static void main(String[] args) {

//Usereingabe
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Gib den Text ein:");
        String userInput = scannerInput.nextLine();
        scannerInput.close();

//Umwandlungstabelle
        for (int i = 0; i < userInput.length(); i++) {
            switch (userInput.charAt(i)) {

//                case 'a','A':
//                    System.out.println("test");
//                    break;
                case 'a', 'A' -> System.out.print("@");
                case 'b', 'B' -> System.out.print("8");
                case 'c', 'C' -> System.out.print("(");
                case 'e', 'E' -> System.out.print("3");
                case 'g', 'G' -> System.out.print("6");
                case 'h', 'H' -> System.out.print("#");
                case 'i', 'I' -> System.out.print("!");
                case 'l', 'L' -> System.out.print("1");
                case 'o', 'O' -> System.out.print("0");
                case 's', 'S' -> System.out.print("$");
                case 't', 'T' -> System.out.print("7");
                case 'z', 'Z' -> System.out.print("2");
                default -> System.out.print(userInput.charAt(i));
            }
        }
        System.out.println();
    }
}