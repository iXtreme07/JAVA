import java.io.IOException;
import java.util.ArrayList;

public class StackList {
    private Stack up;
    private Stack down;
    private int size;




    private class Stack {
        private int value;
        private Stack next;

        public Stack(int value) {
            this.value = value;
        }

        public Stack(int value, Stack next) {
            this.value = value;
            this.next = next;
        }

    }

    public StackList() {
        this.size = 0;
    }

    public void push(int val) {
        Stack stack = new Stack(val);
        stack.next = up;
        up = stack;

        if (down == null) {
            down = up;
        }
        size++;
    } //insert first

    public int size() {
        if (size == 0) {
            System.out.println("Es handelt sich um eine leere Liste.");
        } else if (size == 1) System.out.println("Es ist ein Objekt in der Liste.");
        else {
            System.out.println("Es sind " + size + " Objekte in der Liste");
        }
        return size;

    }

    public int pop() {

        try {
            int val = up.value;
            up = up.next;
            if (up == null) {
                down = null;
            }
            size--;
            return val;
        } catch (Exception e) {
            System.err.println("\nStackToSmallExeption");
            //  e.printStackTrace();
        }
        return -1;
    }

    public int peek() {

        try {

            return up.value;
        } catch (Exception e) {
            System.err.println("\nStackToSmallExeption");
            //  e.printStackTrace();
        }
        return -1;
    }

    public ArrayList<Integer> pop(int lastXNumbers) {
        ArrayList list = new ArrayList<Integer>();
        try {
            if (size <= 1) {
                list.add(pop());
                return list;
            }
            int temp = size - lastXNumbers;
            for (int i = 0; i < lastXNumbers; i++) {
                Stack secondLast = get(size - 2);
                int val = down.value;
                down = secondLast;
                down.next = null;
                size--;
                list.add(val);
            }
            return list;
        } catch (Exception e) {
            System.err.println("\nStackToSmallExeption");
            //  e.printStackTrace();
        }
        return list;
    }

    public Stack get(int index) {
        Stack stack = up;
        for (int i = 0; i < index; i++) {
            stack = stack.next;
        }
        return stack;
    }

}
