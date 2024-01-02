import java.util.Scanner;

public class ArmStrongRange {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            System.out.println("Enter the number :");

            for (int n = 100; n <= 999; n++) {
                int original = n;
                int n1 = n % 10;
                n = n / 10;
                int n2 = n % 10;
                n = n / 10;
                int n3 = n % 10;
                n = n / 10;

                int result = (n1 * n1 * n1) + (n2 * n2 * n2) + (n3 * n3 * n3);
                if (result == original) {
                    System.out.println(original + " is armstrong number");
                }
            }
        }
    }
}