import java.util.*;
public class prefixsum {
    public static void sumpre(int arr[]){
       int currsum=0;
       int maxsum=Integer.MIN_VALUE ;
       int prefix[]=new int[arr.length];
       prefix[0]=arr[0];

       for(int i=1;i<prefix.length;i++){
          prefix[i]=prefix[i-1]+arr[i];
       }
       for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];

            if(maxsum<currsum){
            maxsum=currsum;
        }
    }
}
System.out.println("max sum "+ maxsum);
}
public static void main(String[] args) {
    int arr[]={1,-2,6,-1,3};
    sumpre(arr);
}
}

