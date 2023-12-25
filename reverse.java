import java.util.Scanner;
public  class reverse {
    public static void main(String args[]){
        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("Enter the number :");
            long n = inp.nextLong();
            long original =n;
            long rev=0,rem;
   
            while(n!=0){
                rem=n%10;
                rev=(rev*10)+rem;
                n=n/10;
            }
            System.out.println("Reverse of "+original+" is "+rev);
        }

    }
}
