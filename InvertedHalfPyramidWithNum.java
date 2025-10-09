public class InvertedHalfPyramidWithNum {
    public static void main(String[] args) {
        //for (i=1 to n) row ,Outer loop
        //for(j=1 to n-i+1) colum,inner loop
        int n=5;
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
