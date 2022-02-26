public class DoublyLinkedList {

    private Node head;

    private static class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;

    }

    public void insert(int after, int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println("not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }

    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        head.prev = null;

        return val;
    }

    public int deleteIndex(int index) {

        if (index == 0) {
            return deleteFirst();
        }

        if (index >= lengthCheck() - 1 || index == -1) {
            return deleteLast();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        return temp.val;

    }

    public int deleteLast() {
        Node temp = head;
        int returnTemp;
        while (temp.next != null) {
            temp = temp.next;
        }
        returnTemp = temp.val;
        temp.prev.next = null;
        return temp.val;
    }


    public void display() {
        Node node = head;
        Node last = null;

        System.out.println("\nPrint in correct order:");
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse:");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");

    }

    public int lengthCheck() {
        Node node = head;
        Node last = null;
        int size = 0;

        while (node != null) {
            last = node;
            node = node.next;
            size++;
        }
        return size;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
