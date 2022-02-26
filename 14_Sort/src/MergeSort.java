

public class MergeSort {
    public static int[] sort(int arrayLength, int maxNumberSize, boolean negativeNumbers) {

        int[] numberRow = mergeSort(RandomArray.RandomArray(arrayLength, maxNumberSize, negativeNumbers));
        return numberRow;
    }

    private static int[] mergeSort(int[] numberRow) {


        int inputLength = numberRow.length;
        if (inputLength < 2) {
            return numberRow;
        }
        int inputHalf = inputLength / 2;
        int[] leftHalf = new int[inputHalf];
        int[] rightHalf = new int[inputLength - inputHalf];

        for (int i = 0; i < inputHalf; i++) {
            leftHalf[i] = numberRow[i];
        }

        for (int i = inputHalf; i < inputLength; i++) {
            rightHalf[i - inputHalf] = numberRow[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        
        return merge(numberRow, leftHalf, rightHalf);
    }

    private static int[] merge(int[] numberRow, int[] leftHalf, int[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0; //for the Left Side
        int j = 0; //for the Right Side
        int k = 0; //for the sorted Array

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                numberRow[k] = leftHalf[i];
                i++;
            } else {
                numberRow[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            numberRow[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            numberRow[k] = rightHalf[j];
            j++;
            k++;
        }
        return numberRow;
    }
}
