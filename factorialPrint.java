public class factorialPrint {
    //Base case → where recursion stop
    //Recursive case → where function call
    public static void PrintFactorial(int n,int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact *=n;
        PrintFactorial(n-1,fact);
    }

    public static void main(String[] args) {
        PrintFactorial(5,1);
    }
}
