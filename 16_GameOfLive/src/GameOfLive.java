import java.util.Arrays;
import java.util.Scanner;

public class GameOfLive {
    public static void main(String[] args) {

      //  Scanner scannerInput = new Scanner(System.in);



        int sizeX = 10;
        int sizeY = 10;
        Boolean[][] matchField = Create.create(sizeX, sizeY);
        Print.print(matchField);
        for (int i = 0; i < 50; i++) {
            matchField = SurvivalControl.survivalControl(matchField);
       //     String toEncrypt = scannerInput.nextLine();
            Print.print(matchField);
            System.out.println("");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){}
        }
    }
}
