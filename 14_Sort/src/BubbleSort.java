

public class BubbleSort {
    public static int[] sort(int arrayLength, int maxNumberSize, boolean negativeNumbers) {


        int numberRow[] = RandomArray.RandomArray(arrayLength, maxNumberSize, negativeNumbers);


        boolean again = false;
        do {
            again = false;
            for (int i = 0; i < numberRow.length - 1; i++) {
                if (numberRow[i] > numberRow[i + 1]) {
                    int temp = numberRow[i];
                    numberRow[i] = numberRow[i + 1];
                    numberRow[i + 1] = temp;
                    again = true;
                }
            }
        } while (again);
        return numberRow;
    }
}
