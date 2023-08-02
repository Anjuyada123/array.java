import java.util.*;
public class maxsub{
     public static void maxSum(int arr[]){
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
               currsum+=arr[k];
                }
               System.out.println(currsum);
               if(max<currsum){
                max=currsum;
               }
            }
        }
        System.out.println("max sum is"+max);
     }
      public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        maxSum(arr);
      }
}