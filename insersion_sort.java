public class insersion_sort {
    public static void main(String[] args) {
        int a[]={11,6,9,3,5,10};
        int n = a.length;
        int key=0;
        for (int j = 1;j<n;j++){
            key=a[j];
            int i = j-1;
            while(i>=0 && a[i]>key){
                a[i+1]=a[i];
                i=i-1;
            }
            a[i+1]=key;
        }
        for(int i = 0; i<n;i++){
            System.out.println(a[i]);
        }
    }
}

