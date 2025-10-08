import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("You are young");
        }else{
            System.out.println("You are old");
        }
    }
}
