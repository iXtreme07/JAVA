import java.util.Scanner;

public class Translating_Grades {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Geben Sie die Note ein:");
        int userInput = scannerInput.nextInt();
        scannerInput.close();

        switch (userInput) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Genügend");
                break;
            case 5:
                System.out.println("Nicht Genügend");
                break;
            default:
                System.out.println("Diese Zahl ist (noch) nicht vorhanden!");
        }
    }
}
