import java.util.*;
public class kadane{
    public static void maxsub(int arr[]){
      int curr=0;
      int max=Integer.MIN_VALUE;

      for(int i=0;i<arr.length;i++){
         curr=curr+arr[i];
         if(curr<0){
            curr=0;
         }
          max=Math.max(curr,max);
      }
      System.out.println("max sum  is:"+max);
    }
    public static void main(String args[]){
        int arr[]={-2,-1,4,6,8,-3,9,-4};
        maxsub(arr);
    }
}
