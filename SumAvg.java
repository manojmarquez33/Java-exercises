import java.util.Scanner;

public class SumAvg {
    public static void main(String [] args){
        try(Scanner in = new Scanner(System.in)){
        System.out.println("How many numbers you want ?");
        int n = in.nextInt();

        int sum=0,a;

        for(int i=1;i<=n;i++){
            System.out.println("Enter number "+i+" ");
            a = in.nextInt();
            sum+=a;
        }
        System.out.println("Sum is :"+sum);
        System.out.println("Average is :"+sum/n);
    }
    }
}
