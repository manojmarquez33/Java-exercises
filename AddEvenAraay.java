import java.util.Scanner;

public class AddEvenAraay {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the limit :");
            int n = in.nextInt();
            int a[] = new int[n];
            int o=0,e=0;
            for(int i=0;i<n;i++){
                System.out.println("Enter the index "+i);
                a[i]=in.nextInt();
            }
            
            for(int i=0;i<n;i++){
                if(a[i]%2==0){
                    System.out.println(a[i]+" - Even number");
                } else if(a[i]%2==1){
                    System.out.println(a[i]+"-  Odd number");
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]%2==0){
                    e++;
                } else if(a[i]%2==1){
                    o++;
                }    
            }
            for(int bvalue :a){
                System.out.print(bvalue+" ");
            }
            System.out.println
            ("\nIn this array totaly "+o+" numbers and "+e+" even numbers");
        }
    }
}

