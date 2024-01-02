public class StringLower {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hi Guys I am MANOJKUMAR");
        System.out.println("original : "+str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                int conv = (int)str.charAt(i)+32;
                str.setCharAt(i, (char)conv);
            }
        }
        System.out.println("Converted to Lower : "+str);
    }

}
