import java.util.*;
public class binary {
    public static int binsearch(int arr[],int key){
        int start=0; 
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                return mid;
            }
            if (arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main (String args[]){
       int arr[]={4,8,9,12,15,14};
       int key=15;
       System.out.println("index for key is:"+binsearch(arr, key));
    }
}

