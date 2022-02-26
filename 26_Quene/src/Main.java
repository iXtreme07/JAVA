public class Main {
    public static void main(String[] args) {

        QueueList list = new QueueList();

        list.pull(1000);
        list.pull(1001);
        list.pull(1002);
        list.pull(1003);
        list.pull(1004);
        list.pull(1005);
        list.pull(1006);
        list.pull(1007);
        list.pull(1008);
        list.pull(1009);
        list.pull(1010);
        list.pull(1011);
        list.pull(1012);
        list.pull(1013);
        list.pull(1014);
        list.pull(1015);
        list.pull(1016);
        list.pull(1017);
        list.pull(1018);
        list.size();

        for (int i = 0; i < 19; i++) {
            list.dequeue();
        }
        list.size();
    }
}
