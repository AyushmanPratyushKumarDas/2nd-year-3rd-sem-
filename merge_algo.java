public class merge_algo {
    public static int[] merge(int []L,int []M){
        int n1 = L.length;
        int n2 = M.length;
        int arr[]=new int[n1+n2];
        int i, j, k;
        i = 0;
        j = 0;
        k = 0;
        while (i < n1 && j < n2) {
            if (L[i] < M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }
        while (i < n1 & j>=n2) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2 & i>=n1) {
            arr[k] = M[j];
            j++;
            k++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int a1[]={1,3,5,7,9};
        int a2[]={2,2,6,8};
        int sorted[]=merge(a1,a2);
        for (int i = 0; i < sorted.length ; i++) {
            System.out.print(sorted[i]+" ");
        }
    }

}
