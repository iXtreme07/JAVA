
public class SelectionSort {
    public static int[] sort(int arrayLength, int maxNumberSize, boolean negativeNumbers) {


        int numberRow[] = RandomArray.RandomArray(arrayLength, maxNumberSize, negativeNumbers);
                //Sortierung Starten

        for (int i = 0; i < numberRow.length; i++) {
            int cacheSize = numberRow[i];
            int cachePosition = 0;
            for (int j = i; j < numberRow.length; j++) {
                if (cacheSize >= numberRow[j]) {
                    cacheSize = numberRow[j];
                    cachePosition = j;
                }
            }
            int tempI = numberRow[i];
            int tempCache = numberRow[cachePosition];
            numberRow[i]=tempCache;
            numberRow[cachePosition]=tempI;
        }return numberRow;

    }

}

