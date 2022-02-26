public class MainSorting {
    public static void main(String[] args) {

       // int array[] = SelectionSort.sort(10, 10, true);
       // int array[] = InsertSort.sort(10,10,true);
       // int array[] = BubbleSort.sort(10,10,true);
        int array[] = MergeSort.sort(100,1000,false);

// This is just for Print Out

        for (int i = 1; i < array.length+1; i++) {
            System.out.print(array[i-1] + ", ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}