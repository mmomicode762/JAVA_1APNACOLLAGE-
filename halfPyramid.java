public class halfPyramid {
    public static void main(String[] args) {
        // 1st row ( 1 * )
        //2 nd row(2 *)
        //row num = total colum num
        int n=4;
       //Outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
