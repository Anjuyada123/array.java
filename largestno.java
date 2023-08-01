import java.util.*;
public class largestno{
    public static int largest(int arr[]){
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
               maximum=arr[i];
            }
        }
        return maximum;
    }
         public static int smallest(int arr[]){
            int minimum=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<minimum){
                minimum=arr[i];
            }
         }
         return minimum;
        }
    public static void main(String args[]){
        int arr[]={1,2,6,3,5};
       System.out.println("largest number is:"+largest(arr));
       System.out.println("smallesr number is:"+smallest(arr));
    }
}