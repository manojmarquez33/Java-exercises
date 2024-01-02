public class VowCap {
    public static void main(String[] args) {
        String a = "Mano-WORK@Zoho in 2025";
        //StringBuilder a = new StringBuilder("Mano-WORK@Zoho in 2025");
        System.out.println(a);
        int upper=0,lower=0,space=0,number=0,vowels=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=65 && a.charAt(i)<=90){
                upper++;
            }
            if(a.charAt(i)>=97 && a.charAt(i)<=122){
                lower++;
            }
            if(a.charAt(i)>=48 && a.charAt(i)<=57){
                number++;
            }
            if(a.charAt(i)==32){
                space++;
            }
            if(a.charAt(i)=='A'||a.charAt(i)=='a'
            ||a.charAt(i)=='E'||a.charAt(i)=='e'
            ||a.charAt(i)=='I'||a.charAt(i)=='i'
            ||a.charAt(i)=='O'||a.charAt(i)=='o'
            ||a.charAt(i)=='U'||a.charAt(i)=='u'){
                vowels++;
            }
        }
    System.out.println("Total word length is "+a.length());
        System.out.println("Captial leter :"+upper);
        System.out.println("Small leter :"+lower);
        System.out.println("Space :"+space);
        System.out.println("Vowels :"+vowels);
        System.out.println("Numbers :"+number);
        int ULNS = upper+lower+number+space;
        System.out.println("Symbols :"+(a.length()-ULNS));
    }
}
