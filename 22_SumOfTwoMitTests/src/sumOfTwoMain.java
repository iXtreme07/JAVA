import java.util.HashSet;

public class sumOfTwoMain {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {10, 20, 30, 40};
        int v = 42;
        System.out.println(sumOfTwo(a, b, v));
    }

    public static boolean sumOfTwo(int[] a, int[] b, int v) {
        HashSet<Integer> newHashset = fillArray(a, v);
        return contains(newHashset, b);
    }

    public static HashSet fillArray(int[] theArray, int v) {
        HashSet<Integer> newHashset = new HashSet();
        for (int i = 0; i < theArray.length; i++) {
            newHashset.add((theArray[i] - v) * -1);
        }
        System.out.println(newHashset);
        return newHashset;
    }

    public static boolean contains(HashSet a, int[] b) {
        boolean isIn = false;
        for (int i = 0; i < b.length; i++) {
            isIn = a.contains(b[i]);
            if (isIn == true) {
                break;
            }
        }
        return isIn;
    }
}
