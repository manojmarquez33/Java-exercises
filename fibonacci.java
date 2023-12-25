import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("Enter the Limit :");
            int n = inp.nextInt();

            /*-------------Method 1---------------  */
            int a=-1,b=1,c=a+b;
            for(int i=0; i<n; i++){
                c=a+b;
                System.out.print(c+" , ");
                a=b;
                b=c;
            }
            System.out.println(" ");
            /*-------------Method 2---------------  */
            int t1=0,t2=1; 
            int t3 = t1+t2;
            System.out.print(t1+" , "+t2+" , ");
            for(int i=3;i<=n;i++){
                System.out.print(t3+" , ");
                t1=t2;
                t2=t3;
                t3=t1+t2;
            }
        }

    }
}
