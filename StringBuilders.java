import java.lang.StringBuilder;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("manojkumar");
        buffer.append(" from KCET ");
        System.out.println(buffer);
        buffer.insert(11, "Flutter Developer ");
        System.out.println(buffer);
        buffer.replace(29, 33, "@at");
        System.out.println(buffer);
        buffer.delete(29, 30);
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
        System.out.println(buffer.charAt(3));
        System.out.println(buffer.length());
        System.out.println(buffer.substring(0));
        System.out.println(buffer.substring(0, 4));
        buffer.setCharAt(0, '-');
        System.out.println(buffer);

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("Java learning... ");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append("Hi guys I am Manoj, working software developer in Zoho");
        System.out.println(sb);
        System.out.println(sb.capacity());
    }

}