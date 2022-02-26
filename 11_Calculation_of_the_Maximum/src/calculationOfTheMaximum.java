import java.util.Scanner;

public class calculationOfTheMaximum {
    public static void main(String[] args) {
        boolean controlFinish = false;
        int biggestNumber = 0;
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein oder beenden sie mit q:");
        while (!controlFinish) {
            String input = scannerInput.next();
            int number = 0;
            try {
                number = Integer.parseInt(input);
                if (number>biggestNumber) {
                    biggestNumber = number;
                }
            } catch (NumberFormatException ex) {
                try {
                    if (input.equals("q")) {
                        controlFinish=true;
                    }
                } catch (Exception e) {
                }
            }
        }
        System.out.println("Die größte Nummer war:" + biggestNumber);
    }
}