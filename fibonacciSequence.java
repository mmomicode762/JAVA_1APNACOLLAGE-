public class fibonacciSequence {
    public static void printFibonacciSequence(int n,int a,int b) {
        if(n==0){
            return;
        }
        System.out.println(a);
        printFibonacciSequence(b,a+b,n-1);

    }

    public static void main(String[] args) {
        printFibonacciSequence(1,2,3);
    }

}
