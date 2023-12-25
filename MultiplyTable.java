import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the table you want? :");
            int n = in.nextInt();
            for(int i=1;i<=n;i++){
                System.out.println(n+" x "+i+" = "+n*i);
            }
        }
    }
}
