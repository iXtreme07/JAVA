import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class JUTsumOfTwo {




    @Test
    public void fillTheArrayPositive5() {
        int[] tester = {1, 3, 6, 5};
        HashSet<Integer> newHashSet = sumOfTwoMain.fillArray(tester, 5);
        assertNotSame(tester, newHashSet);
        assertEquals("[-1, 0, 2, 4]", newHashSet.toString());
    }

    @Test
    public void fillTheArrayNegative5() {
        int[] tester = {1, 3, 6, 5};
        HashSet<Integer> newHashSet = sumOfTwoMain.fillArray(tester, -5);
        assertNotSame(tester, newHashSet);
        assertEquals("[-6, -8, -10, -11]", newHashSet.toString());
    }

    @Test
    public void fillTheArrayWithDoubble() {
        int[] tester = {1, 3, 3, 4, 5, 6, 6, 6};
        HashSet<Integer> newHashSet = sumOfTwoMain.fillArray(tester, -5);
        assertNotSame(tester, newHashSet);
        assertEquals("[-6, -8, -9, -10, -11]", newHashSet.toString());
    }

    @Test
    public void containsOneSamePosition() {
        HashSet<Integer> newHashset = new HashSet();
        newHashset.add(1);
        newHashset.add(2);
        newHashset.add(3);
        int[] tester = {1, 8, 9, 10};
        assertEquals(true, sumOfTwoMain.contains(newHashset, tester));
    }

    @Test
    public void containsOneDifferentPosition() {
        HashSet<Integer> newHashset = new HashSet();
        newHashset.add(1);
        newHashset.add(2);
        newHashset.add(3);
        int[] tester = {9, 8, 1, 10};
        assertEquals(true, sumOfTwoMain.contains(newHashset, tester));
    }

    @Test
    public void containsTwo() {
        HashSet<Integer> newHashset = new HashSet();
        newHashset.add(1);
        newHashset.add(8);
        newHashset.add(3);
        int[] tester = {10, 9, 8, 1};
        assertEquals(true, sumOfTwoMain.contains(newHashset, tester));
    }

    @Test
    public void containsNothing() {
        HashSet<Integer> newHashset = new HashSet();
        newHashset.add(1);
        newHashset.add(2);
        newHashset.add(3);
        int[] tester = {10, 9, 8, 7};
        assertEquals(false, sumOfTwoMain.contains(newHashset, tester));
    }
}

