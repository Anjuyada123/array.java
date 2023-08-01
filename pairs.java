import java.util.*;
public class pairs {
    public static void pairing(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++){
             System.out.print("{"+arr[i] +","+arr[j]+"}");
                count++;
            }
        
        System.out.println();
        }
        System.out.println("total number of pairs are"+count);
    }
    public static void main(String args[]){
        int arr[]={3,4,5,7,8,9,11,12};
        pairing(arr);
    }
    
}
