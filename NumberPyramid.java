public class NumberPyramid {
    public static void main(String[] args) {
        int n=5;
        for( int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.println(" ");
            }
            //numbers->print row num,row num times
            for(int j=1;j<=i;j++){
                System.out.print(i +" ");

            }
            System.out.println();
        }
    }
}
//https://youtu.be/Dr4PpNa7AYo?si=t7ve97ruwtj1slNd