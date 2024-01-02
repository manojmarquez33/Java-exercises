public class Strings {
    public static void main(String[] args) {
         
        String a = "Manojkumar";
        String b = "Manojkumar";
        String c = " I can do it  ";

        System.out.println("A Hashcode: "+a.hashCode());
        System.out.println("B hashcode :"+b.hashCode());
        System.out.println("C hashcode :"+c.hashCode());
        System.out.println("Equals :"+a.equals(b));
        System.out.println("Captial Ignore :"+a.equalsIgnoreCase(b));
        System.out.println("Uppercase :"+a.toUpperCase());
        System.out.println("Lowercase :"+a.toLowerCase());
        System.out.println("Replace :"+a.replace("kumar", "marquez"));
        System.out.println("Length :"+a.length());
        System.out.println("CharAt :"+a.charAt(1));
        System.out.println("Contains :"+c.contains("can"));
        System.out.println("Empty :"+a.isEmpty());
        System.out.println("Start with :"+a.startsWith("Manoj"));
        System.out.println("SUbString :"+a.substring(0,5));
        System.out.println("Substring :"+a.substring(5));
        System.out.println("Trim :"+c.length());
        System.out.println("Trim :"+c.trim().length());

        char[] chararray = a.toCharArray();
        for(char d:chararray){
            System.out.print(d+"|");
        }
    }
}
