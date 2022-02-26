


public class InsertSort {
    public static int[] sort(int arrayLength, int maxNumberSize, boolean negativeNumbers) {


        int numberRow[] = RandomArray.RandomArray(arrayLength, maxNumberSize, negativeNumbers);


        for (int i = 0; i < numberRow.length; i++) {
            int now = numberRow[i];
            int before = i - 1;

            while (before >= 0 && numberRow[before] > now) {
                numberRow[before + 1] = numberRow[before];
                before = before - 1;
            }
            numberRow[before + 1] = now;
        }return numberRow;
    }
}