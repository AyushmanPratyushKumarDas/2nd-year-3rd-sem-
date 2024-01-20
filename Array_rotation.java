public class Array_rotation {
    public static void rotate(int k,int a[]){
        if(k>=a.length){
            return;
        }
            int i = a.length-1;
            for(int j = 0;j<k;j++){
                System.out.print(a[i]+" ");
                i--;
            }
            for(int j = 0;j<a.length-k;j++){
                System.out.print(a[j]+" ");
            }
    }
    public static void main(String[] args) {
        int a[]={1,3,5,7,9};
        int k = 4;
        rotate(k,a);
    }
}
