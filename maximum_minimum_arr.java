public class maximum_minimum_arr {
    public static void max_min(int a[]){
        //first i have done selection sort...
        for(int i = 0;i<a.length;i++){
            int max = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j]>a[max]){
                    int temp = a[j];
                    a[j]=a[max];
                    a[max]=temp;
                }
            }
        }
        int i =0;int j = a.length-1;
        while(j>i){
            System.out.print(a[i]+","+a[j]+",");
            i++;j--;
        }
    }
    public static void main(String[] args) {
        int a[]={13,45,76,75,1,24,35,60};
        max_min(a);

    }
}
