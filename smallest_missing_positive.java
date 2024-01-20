public class smallest_missing_positive {
    public static void sm(int a[]){
        int small = Integer.MAX_VALUE;
        int i = 0;
        while(i<a.length){
            if(small>a[i]){
                small=a[i];
            }
            i++;
        }
        for(int j = 0,k=0;j<a.length||k<Integer.MAX_VALUE;j++){
                if((small+k)==a[j]){
                    k++;
                }else{
                    System.out.println("smallest missing number is "+(small+k));
                    break;
                }
            }

    }
    public static void main(String[] args) {
        int a[]={9,10,11,12,13,14,16,76,45,67};
        sm(a);
    }
}
