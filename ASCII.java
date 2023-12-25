public class ASCII {
    /*
     * 65-90 A to Z
     * 97-122 a to z
     * 48-57 0 t0 9
     * 32 space
     */
    public static void main(String[] args) {
        System.out.println("ASCII characterr 1 to 255");
        for(int i=0;i<=255;i++){
            System.out.println(i+" "+(char)i);
        }
        System.out.println("CAPTITAL LETTER ASCII CODE");
        for(int i=65;i<=90;i++){
            System.out.println(i+" "+(char)i);
        }
        System.out.println("small letter ASCII code");
        for(int i=97;i<=122;i++){
            System.out.println(i+" "+(char)i);
        }
        System.out.println("Numeric Numbers ASCII code");
        for(int i=48;i<=57;i++){
            System.out.println(i+" "+(char)i);
        }
    }
}
