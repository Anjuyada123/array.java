
public class create{
    public static void main(String args[]){
        int marks[]=new int[50];
         
         marks[0]=89;
        marks[1]=  90;       
        marks[2]=99;
        // length of array
        System.out.println("lentgh of array is:"+marks.length);
        System.out.println("physics marks"+"="+marks[0]);
        System.out.println("maths marks"+"="+marks[1]);
        System.out.println("chem marks"+"="+marks[2]);

        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage is:"+percentage+"%");


    }
}
