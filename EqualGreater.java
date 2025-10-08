import java.util.Scanner;

public class EqualGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }else{
            if(a>b){
                System.out.println("Great");
            }else{
                System.out.println("lesser");
                //if(3%2==0); (incorrect )
            }
        }
    }
}
