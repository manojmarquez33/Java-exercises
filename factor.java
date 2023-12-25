import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = in.nextInt(); 
            System.out.println("The factor of "+n+" is");
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}
