import java.util.ArrayList;

public class QueueList {
    private Queue front;
    private Queue behind;
    private int size;

    private class Queue {
        private int value;
        private Queue next;

        public Queue(int value) {
            this.value = value;
        }

        public Queue(int value, Queue next) {
            this.value = value;
            this.next = next;
        }

    }

    public QueueList() {
        this.size = 0;
    }


    public void pull(int val) {
        if (behind == null) {
            Queue queue = new Queue(val);
            queue.next = front;
            front = queue;
            behind = front;
            size++;
            return;
        }
        Queue queue = new Queue(val);
        behind.next = queue;
        behind = queue;
        size++;
    }

    public int size() {
        if (size == 0) {
            System.out.println("Es handelt sich um eine leere Liste.");
        } else if (size == 1) System.out.println("Es ist ein Objekt in der Liste.");
        else {
            System.out.println("Es sind " + size + " Objekte in der Liste");
        }
        return size;

    }

    public int dequeue() {

        try {
            int val = front.value;
            front = front.next;
            if (front == null) {
                behind = null;
            }
            size--;
            return val;
        } catch (Exception e) {
            System.err.println("\nStackToSmallExeption");
            //  e.printStackTrace();
        }
        return -1;
    }


    public Queue get(int index) {
        Queue queue = front;
        for (int i = 0; i < index; i++) {
            queue = queue.next;
        }
        return queue;
    }



    public ArrayList<Integer> dequeue(int lastXNumbers) {
        ArrayList list = new ArrayList<Integer>();
        try {
            if (size <= 1) {
                list.add(dequeue());
                return list;
            }

            for (int i = 0; i < lastXNumbers; i++) {
                int val = front.value;
                front = front.next;

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
}













