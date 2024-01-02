import java.util.Arrays;
import java.util.Scanner;

public class Digiits {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String number = Integer.toString(n);
        int a [] = new int[number.length()];
        for(int i=0;i<number.length();i++){
                a[i]= Character.getNumericValue(number.charAt(i));
            

        }
        System.out.println(Arrays.toString(a));
    }
}
