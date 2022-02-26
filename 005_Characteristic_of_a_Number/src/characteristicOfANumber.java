import java.util.Scanner;

public class characteristicOfANumber {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter a Number");
        int luckyNumber = 1312;
        System.out.println("Die Glückszahl ist "+luckyNumber);
        int userInput = scannerInput.nextInt();
        scannerInput.close();
        if (userInput % 10 == 0) {
            System.out.println("Die Zahl ist 'Rund'");
        } else {
            System.out.println("Die Zahl ist nicht 'Rund'");
        }
        if (userInput % 2 == 0) {
            System.out.println("Es handelt sich um eine GERADE Zahl");
        } else {
            System.out.println("Es handelt sich um eine UNGERADE Zahl");
        }
        if (userInput == luckyNumber){
            System.out.println("Es ist die Glückszahl " + luckyNumber);
        } else {
            System.out.println("Es handelt sich nicht um die Glückszahl");
        }

        System.out.println("Die Zahl ist "+ String.valueOf(userInput).length() + "-Stellig");

    }
}
