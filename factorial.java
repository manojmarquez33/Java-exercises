import java.util.Scanner;

public class factorial {
    public static void main (String [] args){
try (Scanner inp = new Scanner(System.in)) {
    System.out.println("Enter a number :");
    int n = inp.nextInt(); // 5
    int fact=1; // 1,2,6,24
    for(int i=1;i<=n;i++){ // 1<5,2<5 3<5, 4<5 5<=5
        fact=fact*i; // 1*1=1,1*2=2,2*3=6, 6*4=24,24 * 5=120
    }
    System.out.println("Factoial of "+n+" is " + fact);
}
    }
}