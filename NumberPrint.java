

public class NumberPrint {
    //print numbers from 1 to n
    public static void PrintNumbers(int n){
        if(n== 11)
        {
            return;
        }
        System.out.println(n);
        PrintNumbers(n+1);
    }

    public static void main(String[] args) {
        PrintNumbers(1);
    }
}
