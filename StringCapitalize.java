public class StringCapitalize {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("hI gUys i aM manOj");
        System.out.println("Original : " + a);
        if (a.charAt(0) >= 97 && a.charAt(0) <= 122) {
            int con = (int) a.charAt(0) - 32;
            a.setCharAt(0, (char) con);
        }
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == 32) {
                i++;
                if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                    int con = (int) a.charAt(i) - 32;
                    a.setCharAt(i, (char) con);
                }
            } else {
                if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                    int con = (int) a.charAt(i) + 32;
                    a.setCharAt(i, (char) con);
                }
            }
        }
        System.out.println("Capitalized : " + a);
    }

}
