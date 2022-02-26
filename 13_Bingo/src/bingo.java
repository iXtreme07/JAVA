import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bingo {
    public static void main(String[] args) {

        //array's erstellen
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int[] bingoBChosen = new int[5];
        int[] bingoIChosen = new int[5];
        int[] bingoNChosen = new int[5];
        int[] bingoGChosen = new int[5];
        int[] bingoOChosen = new int[5];
        //Ganzes Array befüllen

        for (int i = 1; i <= 15; i++) {
            numbers.add(i);
        }
        //The Choosen füllen
        for (int i = 0; i <= 4; i++) {
            int min = 0;
            int max = numbers.size() - 1;
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            bingoBChosen[i] = numbers.get(randomNumber);
            numbers.remove(randomNumber);
        }
        numbers.clear();


        for (int i = 1; i <= 15; i++) {
            numbers.add(i);
        }
        //The Choosen füllen
        for (int i = 0; i <= 4; i++) {
            int min = 0;
            int max = numbers.size() - 1;
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            bingoIChosen[i] = (numbers.get(randomNumber)) + 15;
            numbers.remove(randomNumber);
        }
        numbers.clear();

        for (int i = 1; i <= 15; i++) {
            numbers.add(i);
        }
        //The Choosen füllen
        for (int i = 0; i <= 4; i++) {
            int min = 0;
            int max = numbers.size() - 1;
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            bingoNChosen[i] = (numbers.get(randomNumber)) + 30;
            numbers.remove(randomNumber);
        }
        numbers.clear();

        for (int i = 1; i <= 15; i++) {
            numbers.add(i);
        }
        //The Choosen füllen
        for (int i = 0; i <= 4; i++) {
            int min = 0;
            int max = numbers.size() - 1;
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            bingoGChosen[i] = (numbers.get(randomNumber)) + 45;
            numbers.remove(randomNumber);
        }
        numbers.clear();


        for (int i = 1; i <= 15; i++) {
            numbers.add(i);
        }
        //The Choosen füllen
        for (int i = 0; i <= 4; i++) {
            int min = 0;
            int max = numbers.size() - 1;
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            bingoOChosen[i] = (numbers.get(randomNumber)) + 60;
            numbers.remove(randomNumber);
        }
        numbers.clear();

        System.out.printf("|------------------------|\n");
        System.out.printf("|  B |  I |  N |  G |  O |\n");
        System.out.printf("|----|----|----|----|----|\n");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.printf("| %2d | %2d |LEER| %2d | %2d |\n", bingoBChosen[i], bingoIChosen[i], bingoNChosen[i], bingoGChosen[i], bingoOChosen[i]);
            } else {
                System.out.printf("| %2d | %2d | %2d | %2d | %2d |\n", bingoBChosen[i], bingoIChosen[i], bingoNChosen[i], bingoGChosen[i], bingoOChosen[i]);
            }
        }
        System.out.printf("|------------------------|\n");


    }
}
