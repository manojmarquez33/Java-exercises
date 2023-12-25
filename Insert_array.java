import java.util.Arrays;

public class Insert_array {
    public static void main(String args[]){
        int a[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("Before insert :"+Arrays.toString(a));
        int index =4 ;
        int value = 35;
        for(int i=a.length-1;i>index;i--){
            a[i]=a[i-1];
        }
       a[index]=value;
        System.out.println("After insert :"+Arrays.toString(a));

    }
}
