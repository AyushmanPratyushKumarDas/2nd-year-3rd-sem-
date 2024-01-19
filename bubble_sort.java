public class bubble_sort {
    public static void bubblesort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for (int j = 0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={13,45,76,75,1,24,35,60};
        bubblesort(a);
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
