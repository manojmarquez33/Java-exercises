import java.util.Scanner;

public class DeciToBin {

    public static  void deciBinary(int n){
        int binaryNumber[] = new int[1000];
        int i = 0;
        while (n>0){
            binaryNumber[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
        System.out.print(binaryNumber[j]);
       }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the binary :");
        int n = in.nextInt();
        System.out.println("Decimal is "+n);
        System.out.println("Binary is");
        deciBinary(n);
    }
}
