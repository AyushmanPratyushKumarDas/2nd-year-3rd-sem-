public class selection_sort {
    public static void selectiobsort(int a[]){
        int n = a.length;
        for(int i =0;i<n;i++){
            int min=i;
            for(int j =i+1;j<n;j++){
                if(a[j]<a[min]){
                    int temp = a[j];
                    a[j]=a[min];
                    a[min]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int a[]={13,45,76,75,1,24,35,60};
        selectiobsort(a);
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    }

