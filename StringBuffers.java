import java.lang.StringBuffer;
public class StringBuffers {
    public static void main(String[] args) {
        
        // String a = "Manojkumar";
        // String b ="I can do it";
        // String c = "Developer";

        StringBuffer buffer = new StringBuffer("manojkumar");
        buffer.append(" from KCET ");
        System.out.println(buffer);
        buffer.insert(11, "Flutter Developer ");
        System.out.println(buffer);
        buffer.replace(29, 33, "@at");
        System.out.println(buffer);
        buffer.delete(29,30);
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
        System.out.println(buffer.charAt(3));
        System.out.println(buffer.length());
        System.out.println(buffer.substring(0));
        System.out.println(buffer.substring(0,4));
        buffer.setCharAt(0, '-');
        System.out.println(buffer);

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Java learning... ");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append("Hi guys I am Manoj, working software developer in Zoho");
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
