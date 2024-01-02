import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number :");
            int n = in.nextInt();
            //int orignal=n,sum=0
            int fact=1;
            while (n>0) {
                int rem=n%10;
                n=n/10;
                for(int i=1;i<=rem;i++){
                    fact=fact*i;
                }
            }

        }
        }
}
