public class pairarr {
    public static void subarray(int arr[]){
        int count=0; 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=i;k<=j;k++){  
                    System.out.print(arr[k]+" ");   
                    count++;
                }
               System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of subarray are"+count);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        subarray(arr);

    }
}
