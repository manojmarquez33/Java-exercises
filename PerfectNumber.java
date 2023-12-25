import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the numberr :");
            int n = in.nextInt();
            int sum=0;
            for(int i =1;i<n;i++){
                if(n%i==0){
                    sum+=i;
                    System.out.println("sum is");     
                }
            }
            if(sum==n){
                System.out.println(n+" is perfect number");    
            } else{
                System.out.println(n+" is NOT a perfect number");
            }
        }
    
    }
}
