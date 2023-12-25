public class MathFunction {
    public static void main(String[] args) {

        System.out.println("Absolute value :" + Math.abs(-33));
        System.out.println("Rounded value :" + Math.round(17.6));
        System.out.println("Ceiled value :" + Math.ceil(19.1));
        System.out.println("Floor value :" + Math.floor(19.51));

        double a = 3;
        double b = 7;

        System.out.println("Maxmium of " + a + " and " + b + ": " + Math.max(a, b));
        System.out.println("Minimum of " + a + " and " + b + ": " + Math.min(a, b));
        System.out.println("Power of " + a + " and " + b + ": " + Math.pow(a, b));
        System.out.println("Log of " + a + " : " + Math.log(a));
        System.out.println("Log 10 of " + a + " : " + Math.log10(a));
        System.out.println("Sin of " + a + " : " + Math.sin(a));
        System.out.println("cos of " + a + " : " + Math.cos(a));
        System.out.println("tan of " + a + " : " + Math.tan(a));

    }
}
