import java.util.ArrayList;


public class Datastructures {
    public static void main(String[] args) {
        int[] A = {49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34};
        int[] B = {39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49};
        int[] C = {41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10};

        ArrayList<Integer> listA = arrayToList(A);
        ArrayList<Integer> listB = arrayToList(B);
        ArrayList<Integer> listC = arrayToList(C);

        System.out.println(getUnionList(listA, getUnionList(listB, listC)));
        System.out.println(getIntersectionList(listA, getIntersectionList(listB, listC)));
        // System.out.println(listA);
        // System.out.println(listB);
        // System.out.println(listC);
    }

    private static ArrayList<Integer> getUnionList(ArrayList<Integer> theListOne, ArrayList<Integer> theListTwo) {
        ArrayList<Integer> unionList = new ArrayList<Integer>();

        for (int i = 0; i < theListOne.size(); i++) {
            unionList.add(theListOne.get(i));
        }
        for (int i = 0; i < theListTwo.size(); i++) {
            if (!theListOne.contains(theListTwo.get(i))) {
                unionList.add(theListTwo.get(i));
            }
        }
        return unionList;
    }

    private static ArrayList<Integer> getIntersectionList(ArrayList<Integer> theListOne, ArrayList<Integer> theListTwo) {

        ArrayList<Integer> doubleNumbers = new ArrayList<Integer>();
        for (int i = 0; i < theListOne.size(); i++) {

            if (theListTwo.contains(theListOne.get(i))) {
                doubleNumbers.add(theListOne.get(i));
            }
        }
        return doubleNumbers;
    }

    private static ArrayList<Integer> arrayToList(int[] arrayList) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.length; i++) {
            numberList.add(arrayList[i]);
        }
        return numberList;
    }
}
