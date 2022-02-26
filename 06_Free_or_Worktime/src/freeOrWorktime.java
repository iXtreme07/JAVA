import java.util.Scanner;

public class freeOrWorktime {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Geben Sie die Uhrzeit ein");
        float userInput = scannerInput.nextFloat();
        scannerInput.close();
        if (8 <= userInput && userInput < 12 || 13 <= userInput && userInput < 16) {
            System.out.println("Es ist innerhalb der Arbeitszeit");
        } else {
            System.out.println("Es war in der Freizeit");
        }
    }
}
