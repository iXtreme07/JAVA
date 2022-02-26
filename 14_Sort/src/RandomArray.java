

public class RandomArray {

    public static int[] RandomArray(int arrayLength, int maxNumberSize, boolean negativeNumbers) {
        /*
        ArrayLength is The length of the Array (max is 2147483647,
        MaxNumberSize is the which may be generated,
        NegativeNumbers: true = Only positive Numbers, false = positive and Negative Numbers;
         */
        int[] numberRow;
        {
            numberRow = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                int randomNumber = (int) (Math.random() * maxNumberSize);//
                if ((((int) (Math.random() * 2)) == 1) && negativeNumbers == true) {
                    randomNumber = randomNumber * -1;
                }
                numberRow[i] = randomNumber;
            }
        } return numberRow;
    }
}
