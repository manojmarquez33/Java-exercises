public class MultiDimArray {
    public static void main(String[] args) {

        // Two dimensiona l array
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Two Dimensional Array:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println(" ");
        }

        // Two jagged dimensiona l array
        System.out.println("Jagged Two Dimensional Array:");
        int b[][]={{1,2,3,11},{4,5,6},{7,8}}; 

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(" "+b[i][j]);
            }
            System.out.println(" ");
        }

    System.out.println("Enhanced Jagged Two Dimensional Array:");
    for(int k[]:b){
        for(int l:k){
            System.out.print(" "+l);
        }
        System.out.println(" ");
    }
    }
}
