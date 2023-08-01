import java.util.*;
public class linear {
    public static int search(int arr[],int key){
      for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            return i;
    }
}   
      return -1;
}
    public static void main(String args[]){
        int arr[]={4,12,6,8,9,3};
        int key=9;
      int index=  search(arr, key);
    if(index==-1){
        System.out.println("not found");
    }else{
        System.out.println("key is found at index:"+index);
       }
    }
}

