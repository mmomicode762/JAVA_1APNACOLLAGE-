import java.util.Scanner;

public class greaterNumber {
    public static int TwoNumbers(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int greater=TwoNumbers(a,b);
        System.out.println(greater);
    }
}
