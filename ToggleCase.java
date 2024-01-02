public class ToggleCase {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("hI I Am mANOJkUMAR");
        System.out.println("Original : "+a);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                int con = (int)a.charAt(i)+32;
                a.setCharAt(i, (char)con);
            } else if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                int con = (int)a.charAt(i)-32;
                a.setCharAt(i, (char)con);
            }
        }
        System.out.println("TOggle cased : "+a);

    }
}
