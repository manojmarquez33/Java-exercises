class Methods{
    public void add(){
        int a =5;
        int b =10;
        System.out.println("Addition is "+a+b);
    }

    public void sub(int a,int b){
        System.out.println("Subtraction :"+ (a-b));
    }

    public int mul(){
        int a =5;
        int b=4;
        return a*b;
    }
    public int div(int a,int  b){
        return a/b;
    }
    public int factorial(int n){
        if(n==1)
            return 1;
        else 
            return (n*factorial(n-1));
    }
}
public class functions {
    public static void main(String[] args) {
        Methods mt = new Methods();
        mt.add();
        mt.sub(13, 4);
        System.out.println("Multiplication "+mt.mul());
        System.out.println("Division "+mt.div(5, 2));
        System.out.println("Factorial : "+mt.factorial(5));
    }
}
