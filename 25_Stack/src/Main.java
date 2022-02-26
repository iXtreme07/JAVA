public class Main {
    public static void main(String[] args) {

        StackList list = new StackList();

        list.push(1000);
        list.push(1001);
        list.push(1002);
        list.push(1003);
        list.push(1004);
        list.push(1005);
        list.push(1006);
        list.push(1007);
        list.push(1008);
        list.push(1009);
        System.out.println(list.pop(2));

        list.size();

        System.out.println(list.pop(5));

        System.out.println(list.peek());

    }
}
