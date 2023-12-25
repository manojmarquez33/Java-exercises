public class ReverseString {
    public static void main(String args[]){
        StringBuffer a = new StringBuffer("Manojkumar");
        StringBuffer b = new StringBuffer();
        for(int i=a.length()-1;i>=0;i--){
            b.append(a.charAt(i));
            //System.out.println();
            //System.out.print(a.charAt(i));
        }
        System.out.println("Reverse using String Buffer :"+b);

      //--------------------Reverse using String -------------------

        String name ="Manojkumar";
        String reverse_name ="";
        char temp;
        for(int i=name.length()-1;i>=0;i--){
           temp = name.charAt(i);
           reverse_name = reverse_name+temp;
        }
        System.out.println("Reverse using String :"+reverse_name);
      }

    }
