import java.util.Scanner;

public class caeserChiffre {
    public static void main(String[] args) {
        int randomNumberToCrypt = (int) (Math.random() * (26 - 1 + 1) + 1);
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Bitte gebe einen Text ein der Verschlüsselt werden soll:");
        String toEncrypt = scannerInput.nextLine();
        scannerInput.close();

        //Code in CharArray Setzen
        char[] encryptText = new char[toEncrypt.length()];
        for (int i = 0; i < toEncrypt.length(); i++) {
            encryptText[i] = toEncrypt.charAt(i);
        }
        //CharArray in int Umwandeln
        int[] encryptTextASCII = new int[toEncrypt.length()];
        for (int i = 0; i < toEncrypt.length(); i++) {
            encryptTextASCII[i] = toEncrypt.charAt(i);
        }
        //int versetzen
        for (int i = 0; i < toEncrypt.length(); i++) {
            //A-Z
            int start = 65;
            int end = 90;
            if (start <= encryptTextASCII[i] && encryptTextASCII[i] <= end) {
                for (int j = 0; j < randomNumberToCrypt; j++) {
                    encryptTextASCII[i]++;
                    if (end < encryptTextASCII[i]) {
                        encryptTextASCII[i] = start;
                    }
                }
            }
            //a-z
            start = 97;
            end = 122;
            if (start <= encryptTextASCII[i] && encryptTextASCII[i] <= end) {
                for (int j = 0; j < randomNumberToCrypt; j++) {
                    encryptTextASCII[i]++;
                    if (end < encryptTextASCII[i]) {
                        encryptTextASCII[i] = start;
                    }
                }
            }
        }
        //die Ausgabe
        for (int j = 0; j < toEncrypt.length(); j++) {
            System.out.print((char) encryptTextASCII[j]);
        }
        System.out.println();
    }
}
