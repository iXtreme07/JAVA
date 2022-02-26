public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(8, 65);
        list.deleteFirst();
        list.deleteLast();
        list.display();
        list.deleteIndex(-1);
        list.display();


    }
}
