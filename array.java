import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            int a[] = {1,23,4,5,3,4,234,54,4,25,52,4,2,5};
            System.out.println("A elements");
            for(int ele : a){
                System.out.print(ele+" ");
            }
            
            int b[] = new int[10];
            System.out.println("\nB elements before enter :");
            for(int bel : b){
                System.out.print(bel+" ");
            }
            for(int i=0;i<=9;i++){
                System.out.println("\nEnter element "+i);
                b[i]=in.nextInt();
            }
            System.out.println("\nB elements after enter :");
            for(int bel : b){
                System.out.print(bel+" ");
            }
        }
    }
}
