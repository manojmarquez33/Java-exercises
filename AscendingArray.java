import java.util.Arrays;

public class AscendingArray {
    public static void main(String[] args) {
        int a[] = {43,2,21,5,54,33,989,34,35};
        System.out.println("Before sort :");
        for(int value : a){
            System.out.print(value+" ");
        }
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[i+1]){
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        System.out.println("\nAfter sort :");
        for(int value : a){
            System.out.print(value+" ");
        }

        // print array using built in method
        System.out.println("\nPrint by Built in method :\n"+Arrays.toString(a));
    }
}
