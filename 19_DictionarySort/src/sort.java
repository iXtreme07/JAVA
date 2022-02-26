import java.util.ArrayList;

public class sort {
    public static void main(String[] args) {
        int[] A = {49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34};
        ArrayList<Integer> numberList = arrayToList(A);


        boolean again = false;
        do {
            again = false;
            for (int i = 0; i < numberList.size() - 1; i++) {
                if (numberList.get(i) > numberList.get(i + 1)) {
                    int temp = numberList.get(i);
                    numberList.set(i, numberList.get(i + 1));
                    numberList.set(i + 1, temp);
                    again = true;
                }
            }
        } while (again);
        System.out.println(numberList);
    }


    private static ArrayList<Integer> arrayToList(int[] arrayList) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.length; i++) {
            numberList.add(arrayList[i]);
        }
        return numberList;
    }
}
