public class insertion_sort {
    public static void insertionSort(int array[]) {
        int size = array.length;
        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;
            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int a[]={13,45,76,75,1,24,35,60};
       insertionSort(a);
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
