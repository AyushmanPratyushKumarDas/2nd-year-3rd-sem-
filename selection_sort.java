public class selection_sort {
    public static void main(String[] args) {
        int a[]={11,6,9,3,5,10};
        int n = a.length;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
        for (int i=0; i<n; ++i)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    }

