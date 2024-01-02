import java.util.HashSet;

public class DuplicateArray {
    public static void main(String[] args) {
        int a[] = {1, 3, 1, 2, 5, 8, 5, 64, 4, 3, 4, 8, 5, 11, 12, 13};
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < a.length; i++) {
            int currentElement = a[i];
            if (set.contains(currentElement)) {
                System.out.println(currentElement + " at index " + i + " is a duplicate.");
            } else {
                set.add(currentElement);
            }
        }
    }
}


// public class DuplicateArray {
//     public static void main(String[] args) {
//         int a[]={1,3,1,2,5,8,5,64,4,3,4,8,5,11,12,13};
//         for(int i=0;i<a.length;i++){
//             for(int j=i+1;j<a.length;j++){
//                 if((a[i]==a[j])&&(i!=j)){
//                     System.out.println(a[j]+" in "+i+"th index");
//                 }
//             }
//         }
//     }
// }
