import java.util.Scanner;

public class SumOddNumber {
    public static void PrintSumOddNumber(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("sum of odd numbers is "+sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintSumOddNumber(n);
    }

}
