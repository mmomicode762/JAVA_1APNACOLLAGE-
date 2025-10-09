public class numPattern {
    public static void main(String[] args) {
        //for(i=1 to n)
        //for(j=i to
        int n=5;
        //outer loop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");// number & space print
            }
            System.out.println();
        }
    }
}
