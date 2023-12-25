import java.util.Arrays;
import java.util.Scanner;

public class ReturnArray {

    public static int [] sortArray(){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the range :");
            int n = in.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the"+i+ " element :");
                a[i]=in.nextInt();
            }
            Arrays.sort(a);
            return a;
        }
    }
    public static void main(String[] args) {
        int arr[] = sortArray();
        for(int a : arr){
            System.out.println(a);
        }
    }
}
