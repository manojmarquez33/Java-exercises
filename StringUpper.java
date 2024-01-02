public class StringUpper {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hi guys I am Manojkumar");
        System.out.println("Original : "+str);
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                int c = (int)str.charAt(i)-32;
                str.setCharAt(i, (char)c);
            }
        }
        System.out.println("Converted : "+str);
    }
}
